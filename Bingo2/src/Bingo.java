import java.util.*;



//este no cuenta, lo he hecho con ayuda y ni aun asi funciona como quiero pero bueno es para entender.

public class Bingo {

    private static int[] generadorCarton() {
        int[] carton = new int[10];
        for (int i = 0; i < 10; i++) {
            carton[i] = (int) (Math.random() * 98) + 1; // Números del 1 al 98
        }
        return carton;
    }

    private static boolean haGanado(int[] carton) {
        // Si todos los números en el cartón salen es win
        for (int i = 0; i < carton.length; i++) {
            if (carton[i] != 0) {
                return false; //hay numeros sin marcar
            }
        }
        return true; // todos los numeros salen
    }

    public static void main(String[] args) {
        int[] carton = generadorCarton();
        System.out.println("¡Bienvenido al juego de Bingo!\n");
        Scanner scanner = new Scanner(System.in);

        // Muestra el carton
        System.out.println("Tu cartón es: ");
        for (int i = 0; i < carton.length; i++) {
            System.out.print(carton[i] + " ");
        }
        System.out.println();

        // el juego es este
        while (!haGanado(carton)) {
            int numeroExtraido = (int) (Math.random() * 90) + 1;
            System.out.println("Número extraído: " + numeroExtraido);

            // ver si el numero ha salido y marcarlo
            for (int i = 0; i < carton.length; i++) {
                if (carton[i] == numeroExtraido) {
                    carton[i] = 0; // marcar el numero
                    break;
                }
            }

            // muestra el estado cartón
            System.out.println("Tu cartón actual es: ");
            for (int i = 0; i < carton.length; i++) {
                System.out.print(carton[i] + " ");
            }
            System.out.println();
        }

        // final
        System.out.println("Bingo.");
        scanner.close();
    }
}
