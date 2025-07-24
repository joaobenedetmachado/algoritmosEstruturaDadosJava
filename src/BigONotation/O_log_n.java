package BigONotation;

import java.util.ArrayList;
import java.util.Arrays;

public class O_log_n {
    public class BinarySearchExample {

        // Se o input dobrar, o espaco temporal e ocupacional nao dobram tambem, mas aumentam

        // por exemplo: log2 (10) : 3.3 | log2 (20) : 4.3 | log2 (40) : 5.3

        // Por exemplo: Binary Search

        public static int binarySearch(int[] arr, int target) {
            int left = 0;
            int right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target) {
                    return mid; // achou o elemento
                } else if (arr[mid] < target) {
                    left = mid + 1; // procura na metade direita
                } else {
                    right = mid - 1; // procura na metade esquerda
                }
            }

            return -1; // não achou
        }

        public static void main(String[] args) {
            int[] array = {1, 3, 5, 7, 9, 11, 13, 15};
            int alvo = 7;

            int resultado = binarySearch(array, alvo);

            if (resultado != -1) {
                System.out.println("encontrado no índice: " + resultado);
            } else {
                System.out.println("não encontrado");
            }
        }
    }
}
