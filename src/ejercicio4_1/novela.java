package ejercicio4_1;

public class novela  extends  libro{
     String tipo;
     public novela(String titulo,String autor,String tipo,int precio){
         super(titulo,autor,precio);
         this.tipo=tipo;
     }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("tipo: "+this.tipo);
    }
}
