/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Everson
 */
public class LerArquivo {
    
    public String[] FileReader(String [] vetor,File file) {
        
        FileReader data;
        
        try {
            data = new FileReader(file);
            BufferedReader linha = new BufferedReader(data);
            String aux = linha.readLine();
            for (int j = 0; j < vetor.length; j++) {
                if (aux != null) {
                    vetor[j] = "" + aux.substring(0, 3);
                }
                aux = linha.readLine();
            }

            data.close();
            return vetor;
            
        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
            return vetor;
        }
    }
    
}
