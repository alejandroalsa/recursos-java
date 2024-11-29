// Paquete del programa
package alejandroalsaJava;

// Importamos la clase Scanner para leer datos desde el teclado.
import java.util.Scanner;

// Clase "Menu" que contiene las opciones del menú principal.
public class menu {

    // Método para mostrar el menú de opciones.
    public static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Opción 01");
        System.out.println("2. Opción 02");
        System.out.println("3. Opción 03");
        System.out.println("4. Opción 04");
        System.out.println("5. Salir");
        System.out.print("\nSeleccione una opción: ");
    }

    // Método principal (entry point) del programa.
    public static void main(String[] args) {

        // Declaramos un objeto Scanner para leer datos desde el teclado.
        Scanner scanner = new Scanner(System.in);
        int opcion; // Variable para almacenar la opción seleccionada por el usuario.

        // Ciclo do-while para mostrar el menú hasta que el usuario elija salir.
        do {
            // Mostramos el menú y leemos la opción seleccionada.
            mostrarMenu();
            while (!scanner.hasNextInt()) { // Validación para evitar errores al ingresar valores no numéricos.
                System.out.println("Por favor, introduzca un número válido.");
                scanner.next(); // Limpiamos la entrada incorrecta.
                mostrarMenu();
            }
            opcion = scanner.nextInt();

            // Validación para asegurarse de que la opción esté dentro del rango permitido.
            if (opcion < 1 || opcion > 5) {
                System.out.println("\nOpción no válida. Por favor, seleccione un número entre 1 y 5.");
                continue; // Regresamos al inicio del bucle si la opción es inválida.
            }

            // Switch para manejar las acciones según la opción seleccionada.
            switch (opcion) {
                case 1:
                    System.out.println("Opción 01 seleccionada.");
                    break;
                case 2:
                    System.out.println("Opción 02 seleccionada.");
                    break;
                case 3:
                    System.out.println("Opción 03 seleccionada.");
                    break;
                case 4:
                    System.out.println("Opción 04 seleccionada.");
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    // Este caso nunca debería alcanzarse debido a la validación previa.
                    System.out.println("Error inesperado.");
            }

        } while (opcion != 5); // El bucle termina cuando el usuario selecciona la opción "Salir".

        // Cerramos el objeto Scanner para liberar recursos.
        scanner.close();
    }
}
