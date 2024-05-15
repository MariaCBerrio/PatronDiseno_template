import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seleccion;
        Cafe cafe= new Cafe();
        Chocolate chocolate = new Chocolate();

        System.out.println("\n----------Bienvenido(a) a la máquina dispensadora de bebidas----------\n");
        System.out.println("Por favor indique la bebida que desea tomar el día de hoy:");
        System.out.println("1.Café");
        System.out.println("2.Chocolate");
        seleccion = input.nextInt();
        if (seleccion == 1) {
            cafe.prepararReceta();
        } else {
            chocolate.prepararReceta();
        }
        System.out.println("\nQue disfrute su bebida.");
    }
}