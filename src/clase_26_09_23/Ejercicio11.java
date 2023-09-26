package clase_26_09_23;

  /*
   pide un numero real que represente a un precio y muestre el precio con IVA. El IVA es del 21%
   */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        final double IVA = 0.21;
        System.out.println("Ingrese el precio...");
        double preciosinIVA = sc.nextDouble();
        double precioconIVA = preciosinIVA * (1 + IVA);
    }
}
