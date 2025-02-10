public class GestorCPIFP {
    public static void main(String[] args) throws Exception {
        if(args.length != 1){
            System.out.println("nada");
        }else{
            CPIFP cp = new CPIFP("Alan Turing", "Frederick Terman", 953462837, args[0]);

            cp.añadirEstudiante(1, "Hugo");
            cp.añadirEstudiante(2, "Juan");
            cp.añadirEstudiante(3, "Pedro");
            cp.añadirEstudiante(4, "Luis");

            cp.obtenerEstudiante(1);
            cp.mostrarListadoEstudiante();
            cp.quitarEstudiante(3);
            cp.mostrarListadoEstudiante();
            cp.modificarEstudiante(2, "Carlos");
            cp.mostrarListadoEstudiante();
        }
    }
}
