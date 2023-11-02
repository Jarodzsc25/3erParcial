package ejercicio4_1;

public class libro {
    String titulo;
    String autor;
    int precio;

    public libro(String titulo, String autor,int precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }
    public void imprimir(){
        System.out.println("titulo: "+this.titulo);
        System.out.println("autor: "+this.autor);
        System.out.println("precio: "+this.precio);
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
    }

