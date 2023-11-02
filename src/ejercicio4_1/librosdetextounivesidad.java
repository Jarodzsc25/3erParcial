package ejercicio4_1;

public class librosdetextounivesidad extends librosdetexto {

    String facultad;
    public librosdetextounivesidad(String titulo ,String autor,
                                   String curso,String facultad,int precio){
        super(titulo, autor, curso, precio);
        this.facultad=facultad;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("facultad: "+this.facultad);
    }
}
