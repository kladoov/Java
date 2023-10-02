package procesos;



/*@author alekk*/
//getInputStream(), getErrorStream(), getOututStream()
public class Procesos {

    public static void main(String[] args) {

        ComandProcess process = new ComandProcess();
        //process.processNotepad();
        
        //process.cmdProcess();
        
        process.proyectoJava();
        
        
        
        
        
        
        
        
        
        /*
        1. Lanzar el proceso
            File f = new File(ruta);
            ProcessBuilder pb = new ProcessBuilder(proceso);
            pb.directory(f);
            Process p = pb.start();
        
        2. Ver el resultado del proceso
            ImputStream is = p.getImputStream();
            int c;
            while((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            is.close();
        
        3. Ver la salida de un error de un proceso
            InputStream er = p.getErrorStream();
            int e;
            while ((e = er.read()) != -1) {
                System.out.println((char)e);
            }
            er.close();
        
        */
    }

}
