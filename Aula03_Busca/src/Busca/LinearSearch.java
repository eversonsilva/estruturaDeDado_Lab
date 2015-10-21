/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Everson
 */
public class LinearSearch {
    
    public int linearSearch(String vetor[]){
       
        List<String> list = new ArrayList<>();
        list.add(vetor[0]);
        boolean cont = false;
        
        for (int i = 0; i < vetor.length; i++) {
            for (String elem : list) {
                if(!elem.equals(vetor[i])){
                    cont=true;
                }else{
                    cont=false;
                    break;
                }
            }
            if(cont==true){
                list.add(vetor[i]);
            }
        }
        return list.size();
    
    }
}
