/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busca;

/**
 *
 * @author Everson
 */
public class BinarySearch {

    public int binarySearch(String[] vetor, int low, int high) {
        
        if(vetor[low].equals(vetor[high])){
            return 1;
        }
        
        int mid;
        mid=(low+high)/2;
        int cont = binarySearch(vetor, low, mid) + binarySearch(vetor, mid+1, high);
        
        if(vetor[mid].equals(vetor[mid + 1])){
            cont--;
         }
         return cont;
     }

}
