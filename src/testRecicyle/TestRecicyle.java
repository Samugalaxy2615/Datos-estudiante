package testRecicyle;

import java.util.Scanner; // ← Corrección aquí

/**
 *
 * @author SamugalaxyXD
 */
public class TestRecicyle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar teléfono
        System.out.print("Ingresa tu numero de teléfono: ");
        String telefono = scanner.nextLine();

        // Mostrar el teléfono ingresado
        System.out.println("Tu numero de telefono es: " + telefono);
       

        scanner.close();
    }
}

 
