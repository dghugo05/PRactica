import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CPIFP implements Serializable{
    private String nombre, direccion;
    private int telefono;
    private String nombreFichero;

    public CPIFP(String nombre, String direccion, int telefono, String nombreFichero) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombreFichero = nombreFichero;
    }

    public boolean añadirEstudiante(int idEstudiante, String nombre){
        if(obtenerEstudiante(idEstudiante) == null){
            try{
                BufferedWriter write = new BufferedWriter(new FileWriter(nombreFichero, true));
                Estudiante estudiante = new Estudiante(idEstudiante, nombre);
                write.write(serializar(estudiante));
                write.newLine();
                write.close();
                return true;
            }catch (IOException ioe){
                System.out.println(ioe.getMessage());
                return false;
            }
        }else{
            return false;
        }
    }

    public boolean quitarEstudiante(int idEstudiante){
        if(obtenerEstudiante(idEstudiante) != null){
            try{
                BufferedReader reader = new BufferedReader(new FileReader(nombreFichero));
                BufferedWriter write = new BufferedWriter(new FileWriter(nombreFichero + ".tmp"));

                String linea = "";
                while(reader.readLine() != null){
                    linea = reader.readLine();
                    if(linea.contains(Integer.toString(idEstudiante))){
                    }else{
                        write.write(linea);
                    }
                }
                if(! new java.io.File(nombreFichero + ".tmp").renameTo(new java.io.File(nombreFichero))){
                    System.out.println("Error al renombrar el archivo");
                }
                reader.close();
                write.close();
                return true;

            }catch (IOException ioe){
                System.out.println(ioe.getMessage());
                return false;
            }
        }else{
            return false;
        }
    }

    public boolean modificarEstudiante(int idEstudiante, String nombre){
        if(obtenerEstudiante(idEstudiante) != null){
            try{
                BufferedReader reader = new BufferedReader(new FileReader(nombreFichero));
                BufferedWriter write = new BufferedWriter(new FileWriter(nombreFichero + ".tmp", true));
                String linea = "";
                while(linea != null){
                    linea = reader.readLine();
                    if(linea.contains(Integer.toString(idEstudiante))){
                        Estudiante estudiante = new Estudiante(idEstudiante, nombre);
                        write.write(serializar(estudiante));
                    }else{
                        write.write(linea);
                    }
                }
                write.close();
                reader.close();
                return true;
            }catch (IOException ioe){
                System.out.println(ioe.getMessage());
                return false;
            }
        }else{
                return false;
        }
    }

    public String obtenerEstudiante(int idEstudiante){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(nombreFichero));
            String estudiante = "";
            String linea = reader.readLine();
            while(linea = reader.readLine() != null){
                linea = reader.readLine();
                if(linea.contains(Integer.toString(idEstudiante))){
                    estudiante = linea;
                }
            }
            reader.close();
            return estudiante;
        } catch (IOException ioe){
            System.out.println(ioe.getMessage());
            return null;
        }
    }

    public String mostrarListadoEstudiante(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(nombreFichero));
            String linea = "";
            StringBuilder listado = new StringBuilder();
            while(linea != null){
                linea = reader.readLine();
                listado.append(linea);
            }
            reader.close();
            return listado.toString();
        }catch (IOException ioe){
            System.out.println(ioe.getMessage());
            return null;
        }
    }

    @Override
    public String serializar(Object estudiante){
        String datos = ((Estudiante)estudiante).getNombre() + "," + ((Estudiante)estudiante).getIdEstudiante();
        return datos;
    }

    @Override
    public Object deserializar(String datos){
        String[] datosArray = datos.split(";");
        String id
    }
}