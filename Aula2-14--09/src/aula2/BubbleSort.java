package Aula2;

import java.util.Arrays;
import java.util.Collections;

public class BubbleSort {

    public static void bubbleSort(int[] vet) {

        int temp;
          // inicia o Bubble Sort
        for (int i = 0; i < vet.length - 1; i++) {
            for (int j = 1; j < vet.length - 1 - i; j++) {
                if (vet[j - 1] > vet[j]) {
                    //troca os elementos
                    temp = vet[j - 1];
                    vet[j - 1] = vet[j];
                    vet[j] = temp;
                }
            }
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
        
        long inicio = System.currentTimeMillis();
        
           bubbleSort(vetC);
        
        long fim = System.currentTimeMillis();
        System.out.println("Tempo BubbleSort : " + (fim - inicio));
        
        //=========================================================
        
        long inicio1 = System.currentTimeMillis();
        
            bubbleSort(vetC1);
        
        long fim1 = System.currentTimeMillis();
        System.out.println("Tempo BubbleSort Reverso: " + (fim1 - inicio1));
        
    }
}
