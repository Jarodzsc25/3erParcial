package ejercicio4_1;

public class libro {
    String titulo;
    String autor;
    int precio;

    public libro(String titulo, String autor, int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public  void imprimirlibro(){
        System.out.println("el titulo del libro es: "+titulo+" el autor es: "+autor+" y el precio es: "+precio);
    }
}
