package clase_9_5_23;

public class Ejercicio5 {
    /*
    Mostrar los numeros pares que hay entre 1 y 10
     */
    public static void main(String[] args) {
        //While y For -> son bucles (estructuras repetitivas)

        //While
        System.out.println("while");
        System.out.println("-----");

        int i = 1;
        while (i <= 10){                   //declaracion
            if (i%2 == 0) {                //condicion
                System.out.println(i);
            }
            i++;    //i = i+1                      //paso: no olvidar de incrementar -> i = i+1
        }

    }
}

