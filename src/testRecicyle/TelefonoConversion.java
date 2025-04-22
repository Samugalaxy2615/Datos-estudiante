package testRecicyle;
import java.util.Scanner;

public class TelefonoConversion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa tu numero de telefono: ");
           
            String tel = sc.nextLine().replaceAll("[^0-9]", "");
            System.out.println("Numero como String: " + tel);
            try {
                int telInt = Integer.parseInt(tel);
                System.out.println("int: " + telInt);
            } catch (NumberFormatException e) {
                System.out.println("Conversion a int fallida");
            }
            try {
                long telLong = Long.parseLong(tel);
                System.out.println("long: " + telLong);
                System.out.println("float: " + Float.valueOf(tel));
                System.out.println("double: " + Double.valueOf(tel));
            } catch (NumberFormatException e) {
                System.out.println("Conversión a número fallida");
            }
        }
    }
}
       


 
