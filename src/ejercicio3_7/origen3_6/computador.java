package ejercicio3_7.origen3_6;

public class computador {
    public String marca;
    String caracteristicasProcesador;
    String sisteOpera;
    double precio;
    int cantidadMemoria;

    public computador(String marca,int cantidadMemoria,String caracteristicasProcesador,String sisteOpera,double precio){
        this.marca= marca;
        this.cantidadMemoria=cantidadMemoria;
        this.caracteristicasProcesador=caracteristicasProcesador;
        this.sisteOpera=sisteOpera;
        this.precio=precio;
    }
}
