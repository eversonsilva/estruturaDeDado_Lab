/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaLincada;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    private Node header;
    private int size;
    private Node trailer;

    public LinkedList() {
        this.header = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public Node first() {
        return header;
    }

    public void addFirst(Node novo) {
        if (isEmpty()) {
            header = novo;
            trailer = novo;
            novo.setNext(null);
            novo.setPrev(null);
        } else {
            header.setPrev(novo);
            novo.setNext(header);
            header = novo;
            header.setPrev(null);
        }
        size++;
    }

    public void addLast(Node novo) {
        if (isEmpty()) {
            header = novo;
            trailer = novo;
            novo.setNext(null);
            novo.setPrev(null);
        } else {
            novo.setPrev(trailer);
            trailer.setNext(novo);
            trailer = novo;
            novo.setNext(null);
        }
        size++;
    }

    public Node last() {
        return trailer;
    }

    public void mostraLista() {
        Node aux = header;
        while (aux.getNext() != null) {
            System.out.println(aux.getElemento() + " ");
            aux = aux.getNext();
        }
        System.out.println(aux.getElemento()+ " ");

        System.out.println("FIM DA LISTA ");

    }

    public void remove(Node node) throws Exception{
        if (isEmpty())
            throw new Exception("Lista vazia, impossÃ­vel remover");
        
        if (node.getElemento() == header.getElemento()){
            header.getNext().setPrev(null);
            header = header.getNext();
            size--;
        }
        if (node.getElemento() == trailer.getElemento()){
            trailer.getPrev().setNext(null);
            trailer = trailer.getPrev();
            size--;
        }
        else {
            Node n;
            for (n = header; !(n.getElemento() == (node.getElemento())); n = n.getNext());
            n.getPrev().setNext(n.getNext());
            n.getNext().setPrev(n.getPrev());  
            size--;
        }
    }

    public void addBefore(Node novo, int elemento) {
        if (isEmpty()){
            addFirst(novo);
        }
        else {
            Node n;
            for (n = header; !(n.getElemento() == (elemento)); n = n.getNext());
            novo.setPrev(n.getPrev());
            n.getPrev().setNext(novo);
            n.setPrev(novo);
            novo.setNext(n);     
            size++;
        }      

    }

    public void addAfter(Node novo, int elemento) {
        if (isEmpty()){
            addFirst(novo);
        }
        else {
            
            Node n;
            for (n = header; !(n.getElemento() == (elemento)); n = n.getNext()); 
            novo.setNext(n.getNext());
            n.getNext().setPrev(novo);
            novo.setPrev(n);
            n.setNext(novo);            
            size++;
        }        
    }
    
    public Integer central(){
        Integer cont = 0;
        Integer meio = size / 2;
        Node aux = header;
        while (aux.getNext() != null && cont <= meio) {
            if (cont.equals(meio)) {
                return aux.getElemento();
            }
            cont++;
            aux = aux.getNext();
        }
        if (cont.equals(meio)) {
            return aux.getElemento();
        }
        return -1;
    } 
    
    public boolean removerElementoCentral() throws Exception{
        boolean resp = false;
        Integer cont = 0;
        Integer meio = size/2;
        Node aux = header;
        
        while(aux.getNext() != null && cont <= meio ){
            if(cont.equals(meio)){
                remove(aux);
                return resp = true;
            }
            cont++;
            aux = aux.getNext();
        }
        if(cont.equals(aux)){
            remove(aux);
            return resp = true;
        }
        return resp;
    }
    
    public Integer numOcorrencia(Integer elemento) throws Exception {
        
        Node aux = header;
        Integer cont = 0;
        
        while (aux.getNext() != null) {
            if (elemento == aux.getElemento()) {
                cont++;
            }
            aux = aux.getNext();
        }
        if (elemento == aux.getElemento()) {
            cont++;
        }
        return cont;
    }

    public void numOcorrenciaValorMenor(Integer elemento) throws Exception {
        Node aux = header;
        while (aux.getNext() != null) {
            if (aux.getElemento()< elemento) {
                System.out.println("Node: " + aux.getElemento() + " é menor que: " + elemento);
            }
            aux = aux.getNext();
        }
        if (aux.getElemento()< elemento) {
            System.out.println("Node: " + aux.getElemento()+ " é menor que: " + elemento);
        }
    }

    public List numOcorrValorMenorVetor(Integer elemento) throws Exception {
        Node aux = header;
        List elementos = new ArrayList();
        while (aux.getNext() != null) {
            if (aux.getElemento()< elemento) {
                elementos.add(aux.getElemento());
            }
            aux = aux.getNext();
        }
        elementos.add(aux.getElemento());
        return elementos;
    }

    public boolean compararListas(LinkedList lista1, LinkedList lista2) throws Exception {   
        return lista1.equals(lista2);
    }
    
    public void dividirLista() {
        Integer cont = 0;
        Integer meio = size / 2;
        Node aux = header;
        LinkedList lista1 = new LinkedList();
        LinkedList lista2 = new LinkedList();
        while (aux.getNext() != null) {
            if (cont <= meio) {
                lista1.addFirst(new Node((aux.getElemento())));
            } else {
                lista2.addFirst(new Node((aux.getElemento())));
            }
            cont++;
            aux = aux.getNext();
        }
        lista2.addFirst(new Node((aux.getElemento())));
        System.out.println("Lista1");
        lista1.mostraLista();
        System.out.println("Lista2");
        lista2.mostraLista();
    }

    public LinkedList duplicarListaParametro(LinkedList lista) {
        Node aux = header;
        LinkedList lista1 = new LinkedList();
        while (aux.getNext() != null) {
            lista1.addFirst(new Node((aux.getElemento())));
            lista1.addFirst(new Node((aux.getElemento())));
            aux = aux.getNext();
        }
        lista1.addFirst(new Node((aux.getElemento())));
        lista1.addFirst(new Node((aux.getElemento())));
        System.out.println("Lista");
        lista1.mostraLista();
        return lista1;
    }

    public LinkedList inverterLista(LinkedList lista) {
        Node aux = header;
        LinkedList lista1 = new LinkedList();
        while (aux.getNext() != null) {
            lista1.addFirst(new Node((aux.getElemento())));
            aux = aux.getNext();
        }
        lista1.addFirst(new Node(aux.getElemento()));
        System.out.println("Inverso da lista");
        lista1.mostraLista();
        return lista1;
    }

    public LinkedList anexarLista(LinkedList lista) {
        LinkedList lista1 = new LinkedList();
        lista1.addFirst(new Node(55));
        lista1.addFirst(new Node(100));
        Node aux = lista1.header;
        while (aux.getNext() != null) {
            lista.addLast(new Node(aux.getElemento()));
            aux = aux.getNext();
        }
        lista.addLast(new Node(aux.getElemento()));
        System.out.println("Inverso da lista");
        lista.mostraLista();
        return lista1;
    }
    
}
