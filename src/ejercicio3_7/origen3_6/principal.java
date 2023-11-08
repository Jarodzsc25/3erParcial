package ejercicio3_7.origen3_6;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        tiendaorigen tienda=new tiendaorigen("Tienda Cuantica","Juana la Cubana",451238,5);
        computador comp1=new computador("Acer",50,"intel iCore7","Windows",18500000);
        computador comp2=new computador("Toshiba",80,"Intel iCore5","Windows",15500000);
        computador comp3=new computador("Mac",100,"Intel i Core7","Mac",2500000);
        tienda.anadir(comp1);
        tienda.anadir(comp2);
        tienda.anadir(comp3);
        System.out.println("ingrese el nombre de la pc a buscar:");
        Scanner sc=new Scanner(System.in);
        String marca =sc.next();
        System.out.println("El computador a buscar: "+ marca+" Se encuentra en la posicion "+ tienda.buscar(marca));
        tienda.imprimir();
        System.out.println("...................");
    }
}
