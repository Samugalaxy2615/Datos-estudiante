package testRecicyle;
import java.util.Scanner;

public class DatosConversion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            String edadStr = sc.nextLine().replaceAll("[^0-9]", "");
            System.out.print("Telefono: ");
            String telefonoStr = sc.nextLine().replaceAll("[^0-9]", "");
            System.out.print("Estatura (ejemplo 1.75): ");
            String estaturaStr = sc.nextLine().replaceAll("[^0-9.]", "");
            System.out.println("\n--- Resultados ---");
            System.out.println("Nombre (String): " + nombre);
            try {
                Integer edad = Integer.valueOf(edadStr);
                System.out.println("Edad (Integer): " + edad);
            } catch (NumberFormatException ignored) {}
            try {
                Long telefono = Long.valueOf(telefonoStr);
                System.out.println("Telefono (Long): " + telefono);
            } catch (NumberFormatException ignored) {}
            try {
                Float estatura = Float.valueOf(estaturaStr);
                System.out.println("Estatura (Float): " + estatura);
                
                Double estaturaDouble = Double.valueOf(estaturaStr);
                System.out.println("Estatura (Double): " + estaturaDouble);
            } catch (NumberFormatException ignored) {}
            }
}
}

       


 
