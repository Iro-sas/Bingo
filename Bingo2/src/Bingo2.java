import java.util.*;

public class Bingo2 {

    //crear el carton 10 entradas y que sea aletorio esta vez
    public static void main(String[] args){
        int[] carton = new int[10];

        for (int i = 0; i < 10; i++) {
            int numeroAleatorio;

            do {
                numeroAleatorio = numeroAleatorio();
            } while (contiene(carton, numeroAleatorio));
            carton[i]=numeroAleatorio;
        }

        imprimeArrayNumeros(carton);
    }

    //muestra el carton por favor
    public static void imprimeArrayNumeros(int[] array){
            for (int elemento: array) System.out.println(elemento);
    }

    //añade al carton en la posicion si no existe ya o no existo yo
    public static int numeroAleatorio(){
            return (int) (Math.random() * 98) + 1;
    }

    //aqui me han tenido que ayudar no me da la vida.
    public static boolean contiene(int[] array, int elemento){
        for (int num: array){
            if (num==elemento){
                    return true;
            }
        }
        return false;

    }

}
