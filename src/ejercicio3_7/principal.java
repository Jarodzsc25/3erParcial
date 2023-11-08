package ejercicio3_7;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        tienda tienda1 = new tienda("Tienda Cuantica","Pepito",123456);
        computadora computador1 = new computadora("Acer","Intel iCore 7","Windows",50,18500000);
        computadora computador2 = new computadora("Toshiba","Intel iCore 5","Windows", 80,15500000);
        computadora computador3 = new computadora("Mac", "Intel iCore7","Mac",100,2500000);
        tienda1.anadir(computador1);
        tienda1.anadir(computador2);
        tienda1.anadir(computador3);
        System.out.println("Ingrese la marca del computador que desea buscar");
        Scanner sc = new Scanner(System.in);
        String marca= sc.next();
        System.out.println("El computador a buscar: "+ marca+" se encuentra en la posicion: "+ tienda.buscar(marca));
        tienda1.imprimir();
    }
}
