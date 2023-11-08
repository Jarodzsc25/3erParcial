package ejercicio3_6;

import java.util.Scanner;

public class curso {
    estudiantes[] estudiantes;
    int cantidadestudiantes;
    private double[][] notasporsemestre;

    static final int maxiestudiantes = 20;

    public curso() {
        estudiantes = new estudiantes[maxiestudiantes];
        notasporsemestre = new double[maxiestudiantes][3];
        cantidadestudiantes = 0;
    }

    public void agregarEstudiante() {
        Scanner sc = new Scanner(System.in);

        if (cantidadestudiantes < maxiestudiantes) {
            System.out.println("Ingrese el nombre:");
            String nombre = sc.nextLine();

            System.out.println("Ingrese los apellidos:");
            String apellidos = sc.nextLine();

            System.out.println("Ingrese el codigo:");
            int codigo = sc.nextInt();

            if (codigoExistente(codigo)) {
                System.out.println("Este codigo ya existe. No se pudo agregar al curso.");
                return;
            }

            System.out.println("Digite el semestre que cursa:");
            int semestre = sc.nextInt();
            if (semestre < 1 || semestre > 3) {
                System.out.println("Digitacion incorrecta. Debe estar entre 1 y 3.");
                return;
            }
            System.out.println("Ingrese la nota final del estudiante:");
            double notaFinal = sc.nextDouble();

            estudiantes[cantidadestudiantes] = new estudiantes(nombre, apellidos, codigo, semestre, notaFinal);
            notasporsemestre[cantidadestudiantes][semestre - 1] = notaFinal;
            cantidadestudiantes++;

            System.out.println("Estudiante agregado exitosamente.");
        } else {
            System.out.println("El curso esta completo. No se pueden añadir a mas estudiantes.");
        }
    }

    boolean codigoExistente(int codigo) {
        for (int i = 0; i < cantidadestudiantes; i++) {
            if (estudiantes[i].getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    public void buscarEstudiantePorCodigo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo del estudiante a buscar:");
        int codigoBuscado = sc.nextInt();

        for (int i = 0; i < cantidadestudiantes; i++) {
            if (estudiantes[i].getCodigo() == codigoBuscado) {
                System.out.println("Estudiante encontrado:");
                System.out.println("Nombre: " + estudiantes[i].getNombre());
                System.out.println("Apellidos: " + estudiantes[i].getApellidos());
                System.out.println("Codigo: " + estudiantes[i].getCodigo());
                System.out.println("Numero de semestre: " + estudiantes[i].getSemestre());
                System.out.println("Nota Final: " + estudiantes[i].getNotafinal());
                return;
            }
        }

        System.out.println("Estudiante no encontrado.");
    }

    public void eliminarEstudiantePorCodigo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el codigo del estudiante que desea eliminar:");
        int codigoEliminar = sc.nextInt();
        int indiceEliminar = -1;

        for (int i = 0; i < cantidadestudiantes; i++) {
            if (estudiantes[i].getCodigo() == codigoEliminar) {
                indiceEliminar = i;
                System.out.println("Estudiante encontrado:");
                System.out.println("Nombre: " + estudiantes[i].getNombre());
                System.out.println("Apellidos: " + estudiantes[i].getApellidos());
                System.out.println("Codigo: " + estudiantes[i].getCodigo());
                System.out.println("Numero de semestre: " + estudiantes[i].getSemestre());
                System.out.println("Nota Final: " + estudiantes[i].getNotafinal());
                break;
            }
        }

        if (indiceEliminar != -1) {
            System.out.println("¿Esta seguro de eliminar este estudiante? si / no");
            String confirmacion = sc.next();
            if (confirmacion.equalsIgnoreCase("si")) {
                eliminarEstudiante(indiceEliminar);
                System.out.println("Eliminacion exitosa.");
            } else {
                System.out.println("Eliminación fallida.");
            }
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    void eliminarEstudiante(int indice) {
        for (int i = indice; i < cantidadestudiantes - 1; i++) {
            estudiantes[i] = estudiantes[i + 1];
        }
        cantidadestudiantes--;
    }

    // calcular el promedio del curso
    public double calcularPromedioPorSemestre() {
        for (int semestre = 1; semestre <= 3; semestre++) {
            double sumaNotas = 0;
            int cantidadEstudiantesEnSemestre = 0;

            for (int i = 0; i < cantidadestudiantes; i++) {
                if (estudiantes[i].getSemestre() == semestre) {
                    sumaNotas += notasporsemestre[i][semestre - 1];
                    cantidadEstudiantesEnSemestre++;
                }
            }
            if (cantidadEstudiantesEnSemestre > 0) {
                double promedio = sumaNotas / cantidadEstudiantesEnSemestre;
                System.out.println("Promedio del semestre " + semestre + ": " + promedio);
            } else {
                System.out.println("No hay estudiantes en el semestre " + semestre);
            }
        }
        return 0;
    }
}