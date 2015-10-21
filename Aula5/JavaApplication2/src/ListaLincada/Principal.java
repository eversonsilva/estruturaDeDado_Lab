package ListaLincada;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList lista = new LinkedList();
        LinkedList lista1 = new LinkedList();

        try {

            lista.addFirst(new Node(1));
            lista.addFirst(new Node(2));
            lista.addLast(new Node(3));
            lista.addFirst(new Node(4));

            lista.addAfter(new Node(10), 1);

            lista.addBefore(new Node(20), 2);

            lista.remove(new Node(3));
            
            
            
            lista1.addFirst(new Node(1));
            lista1.addFirst(new Node(2));
            lista1.addLast(new Node(3));
            lista1.addFirst(new Node(4));

            lista1.addAfter(new Node(10), 1);

            lista1.addBefore(new Node(20), 2);

            lista1.remove(new Node(3));

            lista.mostraLista();
            System.out.println("");
            
            lista1.mostraLista();
            System.out.println("");
            
            /*System.out.println("Tamanho da Lista: " + lista.size());
            System.out.println("Primeiro Número: " + lista.first().getElemento());
            System.out.println("Ultimo Número: " + lista.last().getElemento());
            lista.mostraLista();
            System.out.println("");

            System.out.println("Elemento Central: " + lista.central());
            System.out.println("Elemento central remvido é: " + lista.removerElementoCentral());
            lista.mostraLista();
            System.out.println("");

            System.out.println("Numero de Ocorrencia do elemento: " + lista.numOcorrencia(20));
            System.out.println("");
            
            lista.numOcorrenciaValorMenor(20);
            System.out.println("");
            
            System.out.println("Numero de Ocorrencia do elemento em um vetor: " + lista.numOcorrValorMenorVetor(20));
            System.out.println("");
            */
            System.out.println("A lista 1 é igual a lista 2 ?  " + lista.compararListas(lista, lista1));
            System.out.println("");
            /*
            lista.dividirLista();
            System.out.println("");
            
            lista.duplicarListaParametro(lista);
            System.out.println("");
            
            lista.inverterLista(lista);
            System.out.println("");
            
            lista.anexarLista(lista);
            */

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
