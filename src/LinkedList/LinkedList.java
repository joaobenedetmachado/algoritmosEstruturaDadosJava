package LinkedList;

public class LinkedList {
    static class Node {
        int valor;
        Node proximo;

        Node(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    public static class ListaLigada {
        Node head;

        // Inserção no final - O(n)
        public void inserir(int valor) {
            Node novo = new Node(valor);
            if (head == null) {
                head = novo;
                return;
            }

            Node atual = head;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }

        // Leitura (acessar posição i) - O(n)
        public int ler(int indice) {
            Node atual = head;
            int contador = 0;

            while (atual != null) {
                if (contador == indice)
                    return atual.valor;

                atual = atual.proximo;
                contador++;
            }

            throw new IndexOutOfBoundsException("Índice inválido");
        }

        // Remoção de um valor específico - O(n)
        public void remover(int valor) {
            if (head == null) return;

            if (head.valor == valor) {
                head = head.proximo;
                return;
            }

            Node atual = head;
            while (atual.proximo != null) {
                if (atual.proximo.valor == valor) {
                    atual.proximo = atual.proximo.proximo;
                    return;
                }
                atual = atual.proximo;
            }
        }

        // Mostrar a lista
        public void imprimir() {
            Node atual = head;
            while (atual != null) {
                System.out.print(atual.valor + " ");
                atual = atual.proximo;
            }
            System.out.println();
        }

        // Exemplo de uso
        public static void main(String[] args) {
            ListaLigada lista = new ListaLigada();

            lista.inserir(10); // O(n)
            lista.inserir(20);
            lista.inserir(30);
            lista.inserir(40);

            lista.imprimir(); // 10 20 30 40

            System.out.println("Elemento na posição 2: " + lista.ler(2)); // O(n)

            lista.remover(20); // O(n)

            lista.imprimir(); // 10 30 40
        }
    }

}
