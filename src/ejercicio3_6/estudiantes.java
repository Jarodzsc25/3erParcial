package ejercicio3_6;

public class estudiantes {
    String nombre;
    String apellidos;
    int codigo;
    int semestre;
    double notafinal;

    public estudiantes(String nombre, String apellidos, int codigo, int semestre, double notafinal) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.semestre = semestre;
        this.notafinal = notafinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(double notafinal) {
        this.notafinal = notafinal;
    }
}
