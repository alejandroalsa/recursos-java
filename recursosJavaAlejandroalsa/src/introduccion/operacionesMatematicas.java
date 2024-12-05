// Paquete del programa
package introduccion;

// Clase "operacionesMatematicas" que contiene las operaciones del programa
public class operacionesMatematicas {

    public static void main(String[] args) {

        // Declaración de variables
        int xInt = 10;
        int yInt = 5;
        double xDouble = 10.0;
        double yDouble = 5.0;

        // Suma para enteros
        int sumaInt = xInt + yInt;

        // Suma para números de punto flotante
        double sumaDouble = xDouble + yDouble;

        // Imprimir resultados
        System.out.println("Suma int = " + sumaInt + "\n");
        System.out.println("Suma double = " + sumaDouble + "\n");
        
        // Resta
        int restaInt = xInt - yInt;
        double restaDouble = xDouble - yDouble;
        
        System.out.println("Resta int = " + restaInt + "\n");
        System.out.println("Resta double = " + restaDouble + "\n");
        
        // Multiplicación
        int multiplicacion = xInt * yInt;
        
        System.out.println("Multiplicación = " + multiplicacion + "\n");
        
        // División
        int divisionCociente = xInt / yInt;
        int divisionResto = xInt % yInt;

        System.out.println("División (Cociente) = " + divisionCociente + "\n");
        System.out.println("División (Resto) = " + divisionResto + "\n");
        
        //Operaciones con Math
        double diametroCircunferencia = 2.0 * xInt;
        
        // Math.PI = número π (3,14159265359...)
        double longitudCircunferencia = 2.0 * Math.PI * xInt; 
        
        // Math.pow(a, b) = a²
        double areaCircunferencia = Math.PI * Math.pow(xInt, 2.0);
        double volumenEsfera = (4.00 * Math.PI * Math.pow(xInt, 3.0)) / 3.0;
        double areaEsfera = 4 * Math.PI * Math.pow(xInt, 2.0);

        int xIntA = 1;
        int yIntA = 2;
        int xIntB = 4;
        int yIntB = 6;

        // Math.sqrt = Raíz cuadrada de x siendo en este caso -> (x_2 - x_1)² + (y_2 - y_1)²
        double distanciaEntreDosPuntos = Math.sqrt(Math.pow((xIntB - xIntA), 2) + Math.pow((yIntB - yIntA), 2));
        
        // Math.floor redondea hacia abajo siempre, Ej (3.45 * 0.21) + 3.45) = 4.1745 pero Math.floor pondra 4
        double redondeoAbajo = Math.floor((3.45 * 0.21) + 3.45);
        
        // Math.ceil redondea hacia arriba al entero más cercano, Ej (3.45 * 0.21) + 3.45) = 4.1745 pero Math.ceil pondra 5
        double redondeoArriba = Math.ceil((3.45 * 0.21) + 3.45);
        
        // Math.ceil redondea al entero más cercano dependiendo del decimal, Ej (3.45 * 0.21) + 3.45) = 4.1745 pero Math.ceil pondra 4
        double redondeoEnteroMasCercanoA = Math.round((3.45 * 0.21) + 3.45); // 4.1745 -> 4
        double redondeoEnteroMasCercanoB = Math.round((3.72 * 0.21) + 3.72); // 4.5012 -> 5
        double redondeoEnteroMasCercanoC = Math.round((3.95 * 0.21) + 3.95); // 4.7795 -> 5

        //Math.random genera número aleatorios entre un rango determinado que tendremos que indicar
        double aleatorioA = Math.random(); // Número aleatorio entre [0.0, 1.0)
        
        // Para poner un numero aleatorio en un rango específico [a, b] utiliza esta formula: aleatorioB = minimo + (maximo - minimo) * Math.random();
        
        int minimoInt = 10;
        int maximoInt = 20;
        double aleatorioB = minimoInt + (maximoInt - minimoInt) * Math.random(); // Número aleatorio entre [10, 20]
        
        // En el caso de que queramos un número aleatorio entero tendremos declarar la varible como entera y añadir (int) a la formula
        int aleatorioC = (int) (minimoInt + Math.random() * maximoInt); // Número entero aleatorio entre [10, 29]
        
        // ¿Por qué [10, 29] y no [10, 20]?
        // La confusión puede deberse a la multiplicación Math.random()∗20Math.random()∗20. Esta fórmula genera un rango de 20 valores posibles (de 0 a 19.9999) antes de sumar 10, lo que desplaza el rango a [10, 30).
        // Si quieres un rango de [10, 20], necesitas ajustar el factor de escalado y la suma siendo como mínimo 10 y como máximo 11.
        
        maximoInt = 11;
        int aleatorioD = (int) (minimoInt + Math.random() * maximoInt); // Número entero aleatorio entre [10, 29]
        
        System.out.println("Diametro Circunferencia (2 * radio) = " + diametroCircunferencia + "\n");
        System.out.println("Longitud Circunferencia (2 * π * radio) = " + longitudCircunferencia + "\n");
        System.out.println("Área Cirunferencia (π * radio³) = " + areaCircunferencia + "\n");
        System.out.println("Volúmen Esfera ((4 * π * r²) / 3) = " + volumenEsfera + "\n");
        System.out.println("Área Esfera (4 * π * r²) = " + areaEsfera + "\n");
        System.out.println("Distancia entre dos puntos (1,2) y (4,6) = " + distanciaEntreDosPuntos + "\n");
        System.out.println("Redondeo hacia abajo = " + redondeoAbajo + "\n");
        System.out.println("Redondeo hacia arriba = " + redondeoArriba + "\n");
        System.out.println("Redondeo hacia el entero más cercano, caso A = " + redondeoEnteroMasCercanoA + "\n");
        System.out.println("Redondeo hacia el entero más cercano, caso B = " + redondeoEnteroMasCercanoB + "\n");
        System.out.println("Redondeo hacia el entero más cercano, caso C = " + redondeoEnteroMasCercanoC + "\n");
        System.out.println("Número aleatorio, caso A = " + aleatorioA + "\n");
        System.out.println("Número aleatorio, caso B = " + aleatorioB + "\n");
        System.out.println("Número aleatorio, caso C = " + aleatorioC + "\n");
        System.out.println("Número aleatorio, caso D = " + aleatorioD + "\n");

    }
}
