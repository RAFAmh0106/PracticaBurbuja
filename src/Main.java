import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    //metodo de ordenamiento por burbuja tradicional
    public static void ordenamientoBurbuja(int[] arreglo){
        int n = arreglo.length;
        for (int i=0; i < n-1; i++){
            for (int j = 0; j<n-1-i; j++){
                if (arreglo[j] > arreglo[j+1]){
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = temp;
                }
            }
        }
    }

    //metodo de ordenamiento por burbuja mejorado
    public static void ordenamientoBurbujaMejorado(int[] arreglo){
        int n = arreglo.length;
        boolean intercambiado;

        for (int i=0; i<n-1; i++){
            intercambiado = false;

            for (int j=0; j < n-1-i; j++){
                if (arreglo[j] > arreglo[j+1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    intercambiado = true;
                }
            }
            if (!intercambiado){
                break;
            }
        }
    }

    //metodo main
    public static void main(String[] args){
        //prueba 1
        int[] datosDesordenados1 = {64,34,25,12,22,11};
        int[] datosDesordendos2 = datosDesordenados1.clone();

        System.out.println("Prueba 1: arreglo desordenado");
        System.out.println("Estado inicial:" + Arrays.toString(datosDesordenados1));

        ordenamientoBurbuja(datosDesordenados1);
        System.out.println("Burbuja tradicional:" + Arrays.toString(datosDesordenados1));
        ordenamientoBurbujaMejorado(datosDesordendos2);
        System.out.println("Burbuja mejorada:"+ Arrays.toString(datosDesordendos2));
        System.out.println("\n");

        //prueba 2
        int[] datosOrdenados1 = {10,20,30,40,50};
        int[] datosOrdenados2 = datosOrdenados1.clone();

        System.out.println("Prueba 2");
        System.out.println("Estado inicial:"+Arrays.toString(datosOrdenados1));

        ordenamientoBurbuja(datosOrdenados1);
        System.out.println("Burbuja normal:"+ Arrays.toString(datosOrdenados1));
        ordenamientoBurbujaMejorado(datosOrdenados2);
        System.out.println("Burbuja mejorada:" + Arrays.toString(datosOrdenados2));
    }
}
