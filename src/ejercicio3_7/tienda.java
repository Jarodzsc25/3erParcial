package ejercicio3_7;

import java.util.Vector;

public class tienda {
    String nombre, propietario;
    int identificadorTrib;

    static Vector computadores;

    public tienda(String nombre, String propietario, int identificadorTrib) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.identificadorTrib = identificadorTrib;
        computadores = new Vector();
    }
    public boolean tiendaLlena(){
        return false;
    }

    public boolean tiendaVacio(){
        return computadores.size()==0;
    }

    public void anadir(computadora computadora){
        computadores.add(computadora);
    }

    public boolean eliminar(String marcaComputadora){
        int pos= buscar(marcaComputadora);
        if (pos<0){
            return false;
        }
        computadores.removeElement(pos);
        return true;
    }

    public static int buscar(String marcaComputadora){
        computadora computador;
        for (int i=0;i< computadores.size();i++){
            computador= (computadora) computadores.elementAt(i);
            if (computador.marca.equals(marcaComputadora))
                return i;
        }
        System.out.println("Esa marca no existe");
        return -1;
    }
    public void imprimir(){
        for (int i=0;i< computadores.size();i++){
            System.out.println("Computador "+i);
            computadora computador =(computadora) computadores.elementAt(i);
            System.out.println("Marca: "+computador.marca);
            System.out.println("Cantidad de memoria: "+ computador.cantidadmemoria);
            System.out.println("Caracteristicas del procesador: "+ computador.caracteristicasprocesador);
            System.out.println("Sistema operativo: "+ computador.sistemaoperativo);
            System.out.println("Precio: "+computador.precio);

        }
    }
}
