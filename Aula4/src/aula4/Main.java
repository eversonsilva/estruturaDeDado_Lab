/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

import javax.swing.JOptionPane;

/**
 *
 * @author 41487532
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pilha a = new Pilha();
        String entrada;
        Integer num;

        do {

            entrada = JOptionPane.showInputDialog("Digite um número inteiro diferente de 0");
            num = Integer.parseInt(entrada);

        } while (num == 0);

        int resto;
        do {
            
            resto = num % 16;
            num = num / 16;
            a.push(Integer.toHexString(resto).toUpperCase());
        } while (num != 0);
        
        String r="";
        while (a.isEmpty() == false) {
            r=r+a.pop();
        }
        JOptionPane.showMessageDialog(null,"O número digitado convertido para hexadecimal é: " + r);
        /*while(num/16 != 0){
         a.push(num%16);
         }*/
        //System.out.println(a.pop());
        //while(a.isEmpty() == false){
        //  System.out.println(a.pop());
        //}
        /*
         Pilha a = new Pilha();
         a.push("A");
         a.push(2);
         a.push(3);
         a.push(4);
         a.push(5);
         a.push(6);
         a.push("Oi");
         a.push("Everson");
        
         while(a.isEmpty() == false){
         System.out.println(a.pop());
         }
         */
    }

}
