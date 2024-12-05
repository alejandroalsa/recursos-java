// Paquete del programa
package introduccion;

// Clase "IfCondicional" que contiene los principales casos de uso del condicional if
public class ifCondicional {

    // Método principal (entry point) del programa
    public static void main(String[] args) {
        
        // Declaración de variables
        int x = 10;
        int y = 5;
        int z = 20;

        // Condicional simple: se ejecuta si x es mayor que y
        if (x > y) {
            System.out.println(x + " es mayor que " + y);
        }

        // Condicional con "else": si x no es menor que y, se ejecuta la rama alternativa
        if (x < y) {
            System.out.println(x + " es menor que " + y);
        } else {
            System.out.println(y + " no es mayor que " + x);
        }

        // Condicional con "||" (OR lógico): se ejecuta si al menos una condición es verdadera
        if (x > y || y > z) {
            System.out.println(x + " es mayor que " + y + " pero no aseguramos que " + y + " sea mayor que " + z);
        }

        // Condicional con "&&" (AND lógico): ambas condiciones deben ser verdaderas para ejecutar el bloque
        if (x > y && z > y) {
            System.out.println("Tanto " + x + " como " + z + " son números mayores que " + y);
        }

        // Condicional anidado con "else if": se evalúan múltiples condiciones en orden
        if (x < y) {
            System.out.println(x + " es menor que " + y);
        } else if (x > y) {
            System.out.println(x + " es mayor que " + y);
        } else {
            System.out.println(x + " es igual a " + y);
        }

        // Uso del operador "==" para verificar igualdad
        if (x == y) {
            System.out.println(x + " es igual a " + y);
        } else {
            System.out.println(x + " no es igual a " + y);
        }

        // Uso del operador "!=" para verificar desigualdad
        if (x != y) {
            System.out.println(x + " no es igual a " + y);
        } else {
            System.out.println(x + " es igual a " + y);
        }

        // Uso de operaciones dentro de las condiciones
        int resultado = 15;
        if ((x + y) == resultado) {
            System.out.println(x + " + " + y + " = " + resultado);
        }

        // Uso de variables booleanas en condiciones
        boolean esMayor = x > y; // Variable booleana calculada a partir de una operación
        boolean condicionVerdadera = true;
        boolean condicionFalsa = false;

        // Uso de una variable booleana en un if
        // En este caso, la variable "esMayor" se declaró previamente como un booleano que almacena el resultado
        // de evaluar si "x" es mayor que "y". Esto permite simplificar la condición dentro del if, ya que no
        // es necesario repetir la comparación en este bloque. Si el valor de "esMayor" es true (x > y),
        // se ejecutará el contenido del if y mostrará el mensaje correspondiente.
        if (esMayor) {
            System.out.println(x + " es mayor que " + y);
        }

        // Uso del operador "!" (negación): invierte el valor de una condición booleana
        // Aquí se utiliza el operador de negación "!" para comprobar si la variable booleana "condicionVerdadera"
        // no es verdadera. Es decir, si el valor de "condicionVerdadera" es false, el if lo interpretará como true
        // y ejecutará el bloque correspondiente. En caso contrario (si "condicionVerdadera" es true), no hará nada.
        if (!condicionVerdadera) {
            System.out.println("La condición no es verdadera");
        }

        // Condición con valor booleano false y negación
        // En este caso, la variable "condicionFalsa" se definió previamente con el valor false.
        // El operador "!" invierte su valor, por lo que el if lo interpreta como true. Al cumplirse la condición,
        // el bloque de código dentro del if se ejecuta y muestra el mensaje correspondiente.
        if (!condicionFalsa) {
            System.out.println("La condición es falsa");
        }

    }
}
