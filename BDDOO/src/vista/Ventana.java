
package vista;
import bddoo.*;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/*@author alexk*/
public class Ventana extends javax.swing.JFrame {
    private Orientacion or;
    
    public Ventana() {
        initComponents();
        this.or = new Orientacion();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        botonInsertarObjetoOrquesta = new javax.swing.JButton();
        botonMostrarDatosdelaBBDD = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDatosdelaBBDD = new javax.swing.JTextArea();
        botonMostrarTelefono = new javax.swing.JButton();
        spinnerMostrarTelefono = new javax.swing.JSpinner();
        mostrarNumeroTelefono = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        orquestaNombre = new javax.swing.JTextField();
        cancionTitulo = new javax.swing.JTextField();
        cancionGenero = new javax.swing.JTextField();
        representanteNombre = new javax.swing.JTextField();
        representanteTelefono = new javax.swing.JTextField();
        orquestasNumeroComponentes = new javax.swing.JSlider();
        botonIntroducirOrquesta = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        borrarOrquestaID = new javax.swing.JSpinner();
        botonBorrarID = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        spinnerBuscarID = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaMostrarIDBuscado = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        textRecogeNombreModificar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaNombreModificado = new javax.swing.JTextArea();
        botonBuscarID = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 204, 204));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));

        botonInsertarObjetoOrquesta.setBackground(new java.awt.Color(255, 153, 153));
        botonInsertarObjetoOrquesta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonInsertarObjetoOrquesta.setText("INSERTAR OBJETOS (3) ORQUESTA");
        botonInsertarObjetoOrquesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarObjetoOrquestaActionPerformed(evt);
            }
        });

        botonMostrarDatosdelaBBDD.setBackground(new java.awt.Color(255, 153, 153));
        botonMostrarDatosdelaBBDD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonMostrarDatosdelaBBDD.setText("MOSTRAR DATOS DE LA BASE DE DATOS");
        botonMostrarDatosdelaBBDD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarDatosdelaBBDDActionPerformed(evt);
            }
        });

        textAreaDatosdelaBBDD.setColumns(20);
        textAreaDatosdelaBBDD.setRows(5);
        jScrollPane1.setViewportView(textAreaDatosdelaBBDD);

        botonMostrarTelefono.setBackground(new java.awt.Color(255, 153, 153));
        botonMostrarTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonMostrarTelefono.setText("MOSTRAR TELEFONO");
        botonMostrarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarTelefonoActionPerformed(evt);
            }
        });

        spinnerMostrarTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.NW_RESIZE_CURSOR));

        mostrarNumeroTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarNumeroTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(botonInsertarObjetoOrquesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonMostrarDatosdelaBBDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonMostrarTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spinnerMostrarTelefono)
                    .addComponent(mostrarNumeroTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(121, 121, 121))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertarObjetoOrquesta)
                    .addComponent(botonMostrarTelefono))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMostrarDatosdelaBBDD)
                    .addComponent(spinnerMostrarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarNumeroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("INSERT OBJ", jPanel4);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("NOMBRE");

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CANCION");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nº DE COMPONENTES");

        jLabel4.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel4.setText("ORQUESTAS");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TITULO");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GENERO");

        jLabel7.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel7.setText("REPRESENTANTE");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("TELEFONO");

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("NOMBRE");

        orquestasNumeroComponentes.setMajorTickSpacing(200);
        orquestasNumeroComponentes.setMaximum(800);
        orquestasNumeroComponentes.setMinimum(200);
        orquestasNumeroComponentes.setMinorTickSpacing(200);
        orquestasNumeroComponentes.setPaintLabels(true);
        orquestasNumeroComponentes.setPaintTicks(true);
        orquestasNumeroComponentes.setSnapToTicks(true);
        orquestasNumeroComponentes.setToolTipText("");

        botonIntroducirOrquesta.setBackground(new java.awt.Color(255, 153, 153));
        botonIntroducirOrquesta.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        botonIntroducirOrquesta.setText("INTRODUCIR ORQUESTA");
        botonIntroducirOrquesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIntroducirOrquestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orquestaNombre)
                            .addComponent(orquestasNumeroComponentes, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(representanteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(representanteTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancionTitulo)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancionGenero)
                    .addComponent(botonIntroducirOrquesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orquestaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(orquestasNumeroComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancionTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cancionGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(representanteNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(representanteTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIntroducirOrquesta, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADD ORQUESTA", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jLabel10.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel10.setText("BORRAR UNA ORQUESTA POR IDENTIFICADOR");

        jLabel11.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel11.setText("ID");

        botonBorrarID.setBackground(new java.awt.Color(255, 153, 153));
        botonBorrarID.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        botonBorrarID.setText("BORRAR ID");
        botonBorrarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonBorrarID, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(borrarOrquestaID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel10)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(borrarOrquestaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(botonBorrarID)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DELETE ORQUESTA", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jLabel12.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("BUSCA TU ID PARA MODIFICAR");

        areaMostrarIDBuscado.setColumns(20);
        areaMostrarIDBuscado.setRows(5);
        jScrollPane2.setViewportView(areaMostrarIDBuscado);

        jLabel13.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MODIFICAR NOMBRE");

        areaNombreModificado.setColumns(20);
        areaNombreModificado.setRows(5);
        jScrollPane3.setViewportView(areaNombreModificado);

        botonBuscarID.setBackground(new java.awt.Color(255, 102, 102));
        botonBuscarID.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        botonBuscarID.setText("BUSCAR ID");
        botonBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarIDActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jButton1.setText("MOSTRAR MODIFICACION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonBuscarID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(spinnerBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textRecogeNombreModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textRecogeNombreModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonBuscarID)
                    .addComponent(jButton1))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("MODIFICAR", jPanel3);

        jMenu1.setText("Conexiones");

        jMenuItem1.setText("Cerrar conexion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIntroducirOrquestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIntroducirOrquestaActionPerformed
        // TODO add your handling code here:
        Cancion can = new Cancion(this.cancionTitulo.getText(), this.cancionGenero.getText());
        
        int telefono = Integer.parseInt(this.representanteTelefono.getText());
        Representante rep = new Representante(this.representanteNombre.getText(), telefono);
        
        Orquesta orq = new Orquesta(this.orquestaNombre.getText(), this.orquestasNumeroComponentes.getValue(), can, rep);
        
        or.insertarDatos(orq);
        
        JOptionPane.showMessageDialog(this, "ORQUESTA AGREGADA CON EXITO", "CREANDO ORQUESTA", HEIGHT);
        
        
    }//GEN-LAST:event_botonIntroducirOrquestaActionPerformed

    private void botonBorrarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarIDActionPerformed
        // TODO add your handling code here:
        int id = (int)this.borrarOrquestaID.getValue();
        or.borrarVehiculoPorIdentificador(id);
        
    }//GEN-LAST:event_botonBorrarIDActionPerformed

    private void botonInsertarObjetoOrquestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarObjetoOrquestaActionPerformed
        // TODO add your handling code here:
    
    Cancion cancion1= new Cancion("JUST DANCE", "TECHNO");
    Representante representante1 = new Representante("LADY GAGA", 967876342);
    Orquesta orquesta1 = new Orquesta("PARADISE", 65, cancion1, representante1);
    //----------------------------------------------------------------------------------------------------
    Cancion cancion2= new Cancion("HANGOVER", "POP");
    Representante representante2 = new Representante("TAIO CRUZ", 967543298);
    Orquesta orquesta2 = new Orquesta("MEDUSA BEACH FESTIVAL", 1898, cancion2, representante2);
    //----------------------------------------------------------------------------------------------------
    Cancion cancion3= new Cancion("PLAYA DEL INGLES", "HARD TECHNO");
    Representante representante3 = new Representante("QUEVEDO", 967598438);
    Orquesta orquesta3 = new Orquesta("MINAYAFEST", 189, cancion3, representante3);
    
    or.insertarDatos(orquesta1);
    or.insertarDatos(orquesta2);
    or.insertarDatos(orquesta3);
    System.out.println("SE HAN INSERTADO LAS 3 ORQUESTAS EN LA BASE DE DATOS");
        
    }//GEN-LAST:event_botonInsertarObjetoOrquestaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        or.cerrarConexion();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void botonMostrarDatosdelaBBDDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarDatosdelaBBDDActionPerformed
        // TODO add your handling code here:
        String a = or.mostrarTablas();
        this.textAreaDatosdelaBBDD.append(a);
    }//GEN-LAST:event_botonMostrarDatosdelaBBDDActionPerformed

    private void botonMostrarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarTelefonoActionPerformed
        // TODO add your handling code here:
        int id = (int)this.spinnerMostrarTelefono.getValue();
        int text = or.buscarTelefono(id);
        this.mostrarNumeroTelefono.setText(Integer.toString(text));
        
    }//GEN-LAST:event_botonMostrarTelefonoActionPerformed

    private void botonBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarIDActionPerformed
        // TODO add your handling code here:
        this.areaMostrarIDBuscado.setText("");
        int id = (int)this.spinnerBuscarID.getValue();
        String text = or.buscarID(id);
        this.areaMostrarIDBuscado.append(text);

    }//GEN-LAST:event_botonBuscarIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nombre = this.textRecogeNombreModificar.getText();
        int id = (int)this.spinnerBuscarID.getValue();
        String text = or.modificarNombre(id, nombre);
        this.areaNombreModificado.append(text);
    }//GEN-LAST:event_jButton1ActionPerformed

    /*@param args the command line arguments*/
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaMostrarIDBuscado;
    private javax.swing.JTextArea areaNombreModificado;
    private javax.swing.JSpinner borrarOrquestaID;
    private javax.swing.JButton botonBorrarID;
    private javax.swing.JButton botonBuscarID;
    private javax.swing.JButton botonInsertarObjetoOrquesta;
    private javax.swing.JButton botonIntroducirOrquesta;
    private javax.swing.JButton botonMostrarDatosdelaBBDD;
    private javax.swing.JButton botonMostrarTelefono;
    private javax.swing.JTextField cancionGenero;
    private javax.swing.JTextField cancionTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel mostrarNumeroTelefono;
    private javax.swing.JTextField orquestaNombre;
    private javax.swing.JSlider orquestasNumeroComponentes;
    private javax.swing.JTextField representanteNombre;
    private javax.swing.JTextField representanteTelefono;
    private javax.swing.JSpinner spinnerBuscarID;
    private javax.swing.JSpinner spinnerMostrarTelefono;
    private javax.swing.JTextArea textAreaDatosdelaBBDD;
    private javax.swing.JTextField textRecogeNombreModificar;
    // End of variables declaration//GEN-END:variables
}
