import java.util.Scanner;

// Versión Recursiva

public class Exercise3_UD2 {
    public static void main(String[] args) {
        // Utilizar un Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        // Calcular el factorial del número
        long factorial = calcularFactorial(numero);

        // Imprimir el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);

        // Cerrar el Scanner
        scanner.close();
    }

    // Método para calcular el factorial de un número
    private static long calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFactorial(numero -1);
        }
    }
}