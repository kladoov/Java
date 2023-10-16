package bddoo;

import java.util.ArrayList;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

//Clase para conexion a bases de datos OO
public class Orientacion {

    private EntityManagerFactory emf;
    private EntityManager em;

    public Orientacion() {
        emf = Persistence.createEntityManagerFactory("$objectdb/db/bbddooAleksandrKladov.odb");
        em = emf.createEntityManager();
        System.out.println("BASE DE DATOS CREADA");
    }

    public void cerrarConexion() {
        em.close();
        emf.close();
        System.out.println("CONEXION CERRADA");
    }

    public void insertarDatos(Object obj) {
        em.getTransaction().begin();
        em.persist(obj);
        em.getTransaction().commit();
    }

    public String mostrarTablas() {
        StringBuilder stringBuilder = new StringBuilder();

        TypedQuery<Orquesta> consulta = em.createQuery("SELECT o FROM Orquesta o", Orquesta.class);
        ArrayList<Orquesta> resultado = (ArrayList<Orquesta>) consulta.getResultList();

        stringBuilder.append("LAS ORQUESTAS QUE TENEMOS SON: \n");
        for (Orquesta o : resultado) {
            stringBuilder.append(o.toString());
            stringBuilder.append("\n\n");
        }

        return stringBuilder.toString();
    }

    public int buscarTelefono(int id) {
        try {
            Query query = em.createQuery("SELECT o FROM Orquesta o WHERE o.id = :ide");
            query.setParameter("ide", id);
            Orquesta resultado = (Orquesta) query.getSingleResult();

            if (resultado != null) {
                return resultado.getRepresentante().getTelefonoRepresentante();
            } else {
                return 0;
            }

        } catch (NonUniqueResultException e) {
            return 0;
        } catch (NoResultException e1) {
            return 0;
        }
    }

    public void borrarVehiculoPorIdentificador(int id) {
        try {
            Orquesta orq = em.find(Orquesta.class, id);
            em.getTransaction().begin();
            em.remove(orq);
            em.getTransaction().commit();
            if (orq != null) {
                System.out.println("Orquesta con id " + id + " borrada.");
            } else {
                System.out.println(id + " id no encontrada.");
            }
        } catch (NoResultException e1) {
            System.out.println(e1.getMessage());
        } catch (IllegalArgumentException e2) {
            System.out.println(e2.getMessage());
        }
    }

    public String buscarID(int id) {
        try {
            Query query = em.createQuery("SELECT o FROM Orquesta o WHERE id = :ide");
            query.setParameter("ide", id);
            Orquesta resultado = (Orquesta) query.getSingleResult();

            if (resultado != null) {
                return resultado.toString();
            } else {
                return "NULL";
            }

        } catch (NonUniqueResultException e) {
            return e.toString();
        } catch (NoResultException e1) {
            return e1.getMessage();
        }
    }

    public String modificarNombre(int id, String nom) {
        
        String sentencia = "SELECT o FROM Orquesta o";
        Query consulta = em.createQuery(sentencia);
        ArrayList<Orquesta> orquestas = (ArrayList<Orquesta>) consulta.getResultList();
        int total = orquestas.size();
        if (total > 0) {
            Orquesta buscado = em.find(Orquesta.class, id);
            em.getTransaction().begin();
            buscado.setNombre(nom);
            em.getTransaction().commit();
            return buscado.toString();
        } else {
            return "Cambio NO realizado";
        }
    }
}
