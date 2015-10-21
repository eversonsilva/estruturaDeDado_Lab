package Busca;

import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Everson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File file = new File("E:\\3º semestre\\Estrutura de dados\\Lab\\Aula03_Busca\\dataVoos.txt");
        
        String vetor[] = new String[2719];  

        LerArquivo a = new LerArquivo();

        a.FileReader(vetor, file);
        
        //for(int i = 0; i < vetor.length; i++){
        //System.out.println(vetor[i]);
        //}
        
        //System.out.println(vetor[0]);
        //System.out.println(vetor1[0]);
    
    //======================================================================================
        
        LinearSearch teste = new LinearSearch();
        
        long inicio = System.currentTimeMillis();
        
        System.out.println(teste.linearSearch(vetor));
        
        long fim = System.currentTimeMillis();
        
        System.out.println ("Tempo do LinearSearch: " + (fim - inicio) + " milissegundos.");
    
    //======================================================================================    
        
        BinarySearch teste1 = new BinarySearch();
        
        long inicio1 = System.currentTimeMillis();
            
        System.out.println(teste1.binarySearch(vetor, 0, vetor.length - 1));  
        
        long fim1 = System.currentTimeMillis();
        System.out.println ("Tempo do BinarySearch: " + (fim1 - inicio1) + " milissegundos.");
    }
    
}
