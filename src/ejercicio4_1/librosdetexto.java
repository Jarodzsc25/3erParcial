package ejercicio4_1;

public class librosdetexto extends libro{
     String curso;

     public librosdetexto(String titulo,String autor, String curso,int precio){
         super (titulo,autor,precio);
         this.curso=curso;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("curso: "+ this.curso);
    }
}
