package clase_9_5_23;

import java.util.Scanner;

public class Ejercicio6 {
    /*
          Pedir un número por consola y mostrar la tabla de multiplicar hasta 10
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa un numero");

        int nro = sc.nextInt();
        int res = 0;

        for (int i = 1; i <= 10; i++) {
            res = i * nro;
            System.out.println(res);
            //System.out.println(nro + " * i + " = " + res);
        }

    }
}
