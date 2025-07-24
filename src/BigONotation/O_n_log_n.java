package BigONotation;

public class O_n_log_n {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Divide a array em duas metades
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Junta as duas metades ordenadas
            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Arrays temporários
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copia os dados pros arrays temporários
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[middle + 1 + j];

        // Intercala os arrays L[] e R[]
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copia o que sobrou (se sobrar)
        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {8, 3, 2, 9, 5, 1, 4, 7, 6};

        System.out.println("Antes:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("Depois:");
        printArray(array);
    }
}
