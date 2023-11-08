package ejercicio3_7.origen3_6;

public class tiendaorigen {
    String nombre;
    String propietario;
    int identTrib;
    computador[] computadores;
    static int numeroComputadores;
    public tiendaorigen (String nombre,String propietario,int identTrib, int tamano){
        if (tamano<1){
            System.out.println("Cantidad de computadores insuficientes.");
        }else {
            this.nombre=nombre;
            this.propietario=propietario;
            this.identTrib=identTrib;
            computadores= new computador[tamano];
            numeroComputadores=0;
        }

    }
    public boolean tiendaLlena(){
        return numeroComputadores==computadores.length;
    }
    public boolean tiendaVacia(){
        return numeroComputadores==0;
    }
    public void anadir(computador computador){
        if (tiendaLlena()){
            System.out.println("La tienda esta llena. No se puede agregar elementos.");
        }else {
            computadores[numeroComputadores]=computador;
            numeroComputadores++;
        }
    }
    public boolean eliminar(String marcaComputador){
        int pos=buscar(marcaComputador);
        if (pos<0){
            return false;
        }
        for (int i=pos;i<numeroComputadores;i++){
            computadores[i]=computadores[i+1];
        }
        numeroComputadores--;
        return true;
    }
    public int buscar(String marcaComputador){
        for (int i=0;i<numeroComputadores;i++){
            if (computadores[i].marca.equals(marcaComputador))
                return i;
        }
        return -1;
    }
    public void imprimir(){
        for (int i=0;i<numeroComputadores;i++){
            System.out.println("Computador "+i);
            System.out.println("Marca: "+computadores[i].marca);
            System.out.println("Cantidad de memoria: "+computadores[i].cantidadMemoria);
            System.out.println("Caracteristicas del Procesador: "+computadores[i].caracteristicasProcesador);
            System.out.println("Sistema operativo: "+computadores[i].sisteOpera);
            System.out.println("Precio: "+computadores[i].precio);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getIdentTrib() {
        return identTrib;
    }

    public void setIdentTrib(int identTrib) {
        this.identTrib = identTrib;
    }

    public computador[] getComputadores() {
        return computadores;
    }

    public void setComputadores(computador[] computadores) {
        this.computadores = computadores;
    }

    public static int getNumeroComputadores() {
        return numeroComputadores;
    }

    public static void setNumeroComputadores(int numeroComputadores) {
        tiendaorigen.numeroComputadores = numeroComputadores;
    }
}
