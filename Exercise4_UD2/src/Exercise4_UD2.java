import java.util.Scanner;

public class Exercise4_UD2 {
    public static void main(String[] args) {
        // Crear un array para almacenar los 10 números
        double[] numeros = new double[10];

        // Utilizar un Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese 10 números
        System.out.println("Por favor, ingrese 10 números:");

        // Leer los números y almacenarlos en el array
        for (int i = 0; i <= 9; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Calcular el número más grande
        double mayor = numeros[0];
        for (int i = 0; i <= 9; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        // Imprimir el resultado
        System.out.println("El número más grande es: " + mayor);

        // Cerrar el Scanner
        scanner.close();
    }
}