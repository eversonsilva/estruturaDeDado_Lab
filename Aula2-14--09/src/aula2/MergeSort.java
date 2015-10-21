package aula2;

import java.util.Arrays;
import java.util.Collections;

public class MergeSort {

    public static void mergeSort(int vetor[], int first, int n) {
        int n1; // Tamanho da primeira metade do vetor
        int n2; // Tamanho da segunda metade do vetor

        if (n > 1) {
// Calcula o tamanho das duas metades
            n1 = n / 2;
            n2 = n - n1;
// ordena vetor[first] até vetor[first+n1-1]
            mergeSort(vetor, first, n1);

// ordena vetor[first+n1] até o final 
            mergeSort(vetor, first + n1, n2);

// mescla as duas metades ordenadas
            merge(vetor, first, n1, n2);
        }
    }

    private static void merge(int vetor[], int first, int n1, int n2) {
        int[] temp = new int[n1 + n2]; // Cria o vetor temporário
// Nro de elementos copiados do vetor data para o vetor temp
        int copied = 0;
// Nro de elementos copiados da primeira metade do vetor 
        int copied1 = 0;
// Nro de elementos copiados da segunda metade do vetor 
        int copied2 = 0;
// Índice p/ copiar elementos do vetor temp p/ o vetor 
        int i;

// Mescla os elementos, copiando das duas metades do vetor 
// para o vetor temporário.
        while ((copied1 < n1) && (copied2 < n2)) {

            if (vetor[first + copied1] < vetor[first + n1 + copied2]) {
                temp[copied++] = vetor[first + (copied1++)];
            } else {
                temp[copied++] = vetor[first + n1 + (copied2++)];
            }
        }

// Copia os elementos remanescentes dos sub-vetores da 
// esquerda e da direita
        while (copied1 < n1) {
            temp[copied++] = vetor[first + (copied1++)];
        }
        while (copied2 < n2) {

            temp[copied++] = vetor[first + n1 + (copied2++)];

// Copia de volta os dados do vetor temp para o vetor 
            for (i = 0; i < n1 + n2; i++) {
                vetor[first + i] = temp[i];
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
        
        long inicio4 = System.currentTimeMillis();
        
           mergeSort(vetC, 0, vet.length - 1);
        
        long fim4 = System.currentTimeMillis();
        System.out.println("Tempo MergeSort: " + (fim4 - inicio4));
        
        //=========================================================
        
        long inicio5 = System.currentTimeMillis();
        
           mergeSort(vetC1, 0, vet.length - 1);
        
        long fim5 = System.currentTimeMillis();
        System.out.println("Tempo MergeSort Reverso: " + (fim5 - inicio5));
        
    }    
}
