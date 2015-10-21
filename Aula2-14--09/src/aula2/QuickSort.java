package aula2;

import java.util.Arrays;
import java.util.Collections;

public class QuickSort {

    
    public static void quickSort(int [] v,int ini, int fim) {

        int k;
        if (fim > ini) {
            k = separa(v,ini, fim);
            quickSort(v,ini, k - 1);
            quickSort(v,k + 1, fim);
        }
    }

    public static int separa(int []v,int ini, int fim) {
        int pivo, esq;
        pivo = v[ini];
        esq = 0;

        while (ini < fim) {

            if (esq == 0) {
                if (pivo >= v[fim]) {
                    v[ini] = v[fim];
                    ini++;
                    esq = 1;
                } else {
                    fim--;
                }
            } else if (pivo < v[ini]) {
                v[fim] = v[ini];
                fim--;
                esq = 0;
            } else {
                ini++;
            }
        }
        v[fim] = pivo;
        return fim;
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
        
        long inicio6 = System.currentTimeMillis();
        
           quickSort(vetC, 0, vet.length -1);
        
        long fim6 = System.currentTimeMillis();
        System.out.println("Tempo QuickSort: " + (fim6 - inicio6));
        
        //=========================================================
        
        long inicio7 = System.currentTimeMillis();
        
           quickSort(vetC1, 0, vet.length -1);
        
        long fim7 = System.currentTimeMillis();
        System.out.println("Tempo QuickSort Reverso: " + (fim7 - inicio7));
        
        //=========================================================
        
    }
}
