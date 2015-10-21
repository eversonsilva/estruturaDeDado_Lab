/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author Everson
 */
public class Pilha {
    
    public int topo;
    //public int max_elem;
    public Object [] vetor;

    public Pilha() {
        this.topo = -1;
        //this.max_elem = -1;
        vetor = new Object[100000];
    }
    
    public boolean isEmpty(){
        if(this.topo == -1){
            return true;
        } 
        return false;
    }
    
    public int size(){
        if(this.isEmpty()){
            return 0;
        }
        return this.topo+1;
    }
    
    public Object top(){
        if(isEmpty()){
            return null;
        }
        return this.vetor[this.topo];
    }
    
    public Object pop(){
        if(isEmpty()){
            return null;
        }
        return this.vetor[this.topo--];
    }
    
    public void push(Object valor){
        if(this.topo < this.vetor.length - 1){
            this.vetor[++topo] = valor;
        } 
    }
    
    /*
    public Pilha(int max_elem) {
        this.topo = -1;
        this.max_elem = max_elem;
        vetor = new int[max_elem];
    }
    
    public boolean vazia(){
        if(this.topo == -1){
            return true;
        }
            return false;
    }
    
    public boolean cheia(){
        if(this.topo == max_elem){
            return true;
        }
            return false;
    }
    
    public void inserir(int elemento){
        if(this.cheia()){
            System.out.println("Pilha Cheia!");
        }
        else{
            topo += 1;
            vetor[topo] = elemento;
        }
    }
    
    public int remover(){
        if(this.vazia()){
            topo -= 1;
            return (vetor[topo + 1]);
        }
            System.out.println("Pilha Vazia");
            return -1;
    }
    
    public int size(){
        if(this.vazia()){
            return 0;
        }
        return this.topo;
    }
    
    public void push(int valor){
        if(this.topo < this.vetor.length - 1){
            this.vetor[++topo] = valor;
        } 
    }
    */
    
}
