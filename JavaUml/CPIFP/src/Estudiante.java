public class Estudiante {
    private int idEstudiante;
    private String nombre;

    public Estudiante(int idEstudiante, String nombre) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
    }

    public int getIdEstudiante() {
        return this.idEstudiante;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String toString(){
        return "Estudiante: " + this.nombre + " - ID: " + this.idEstudiante;
    }
}
