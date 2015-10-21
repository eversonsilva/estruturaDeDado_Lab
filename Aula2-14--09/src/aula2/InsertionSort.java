package aula2;

import java.util.Arrays;
import java.util.Collections;


public class InsertionSort {

    public static void insertionSort(int[] vetor) {

        int j, aux;

        for (int i = 1; i < vetor.length; i++) {

            aux = vetor[i];

            for (j = i - 1; j >= 0 && aux < vetor[j]; j--) {
                vetor[j + 1] = vetor[j];
            }
            vetor[j + 1] = aux;
        }
    }
    
    public static int[] generateVector(int n) {
        int v[] = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = (int) (Math.random() * 100);
        }
        return v;
    }
    
    public static int[] generateVectorInverso(int n){
        Integer v[] = new Integer[n];
        int w[] = new int[n];
        for(int i = 0; i < n; i++){
            v[i] = (int)(Math.random() * i);
        }
        Arrays.sort(v, Collections.reverseOrder());
        for(int i = 0; i < v.length - 1; i++){
            w[i] = v[i];
        }
        return w;
    }
    
    public static void main(String args[]) {
        int vet[] = generateVector(1000000);
        int vet1[] = generateVectorInverso(1000000);
        
        int vetC[] = Arrays.copyOf(vet, 1000000);
        int vetC1[] = Arrays.copyOf(vet1, 1000000);
    
        //=========================================================
        
        long inicio2 = System.currentTimeMillis();
        
           insertionSort(vetC);
        
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo InsertionSort: " + (fim2 - inicio2));
        
        //=========================================================
        
        long inicio3 = System.currentTimeMillis();
        
           insertionSort(vetC1);
        
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo InsertionSort Reverso: " + (fim3 - inicio3));
    
    
    
    }
}
