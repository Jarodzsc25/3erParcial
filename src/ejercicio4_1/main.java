package ejercicio4_1;

public class main {
    public static void main(String[] args) {
      libro libro1 = new libro("LOLA","Jose Lopez",170);
      libro1.imprimir();
      librosdetexto librosdetexto1 = new librosdetexto("Ciencias Naturales","Miguel De La Sierra","Herbologia",200);
      librosdetexto1.imprimir();
      librosdetextounivesidad librosdetextounivesidad1 = new librosdetextounivesidad("Computo 1","Luis Antana","Primero","Ing. Sistemas",150);
      librosdetextounivesidad1.imprimir();
      novela novela1 = new novela("SOLEDAD","Maria De La Soledad","Fantasia",280);
      novela1.imprimir();
    }
}
