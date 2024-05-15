import java.util.Scanner;

abstract class MaquinaBebidas {
    Scanner sc = new Scanner(System.in);
    // Método template que define el esqueleto de preparación de la receta
    public void prepararReceta() {
        String base = elegirBase();
        System.out.println("");
        hervir(base);
        System.out.println("");
        if (agregaAzucar()) {
            System.out.println("Agregando azucar...\n");
        }
        preparar();
        System.out.println("");
        servir();
    }

    // Métodos abstractos que deben ser implementados por las subclases
    abstract void preparar();

    String elegirBase() {
        String base;
        int seleccion;
        System.out.println("¿Qué base desea para su bebida:");
        System.out.println("1.Agua");
        System.out.println("2.Leche");
        seleccion = sc.nextInt();
        if (seleccion == 1) {
            base = "agua";
        } else {
            base = "leche";
        }
        return base;
    }

    // Métodos comunes que pueden ser utilizados por todas las subclases
    void hervir(String base) {
        System.out.println("Hirviendo " + base + "...");
    }

    void servir() {
        System.out.println("Sirviendo bebida...");
    }

    // Método hook que puede ser sobreescrito por las subclases para personalizar el comportamiento
    boolean agregaAzucar() {
        int seleccion;
        System.out.println("¿Desea azúcar para su bebida?");
        System.out.println("1.Sí");
        System.out.println("2.No");
        seleccion = sc.nextInt();
        if (seleccion == 1) {
            return true;
        } else {
            return false;
        }
    }
}

