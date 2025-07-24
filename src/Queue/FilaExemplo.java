package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FilaExemplo {
    public static void main(String[] args) {
        // Criando a fila
        Queue<String> fila = new LinkedList<>();

        // Enqueue (adicionar na fila) — O(1)
        fila.add("João");
        fila.add("Maria");
        fila.add("Carlos");

        // Estado atual: João <- Maria <- Carlos

        // Peek (ver o primeiro da fila) — O(1)
        System.out.println("Primeiro da fila: " + fila.peek()); // João

        // Dequeue (remover da fila) — O(1)
        String atendido = fila.poll();
        System.out.println("Atendido: " + atendido); // João

        // Nova fila: Maria <- Carlos
        System.out.println("Fila atual: " + fila); // [Maria, Carlos]
    }
}
