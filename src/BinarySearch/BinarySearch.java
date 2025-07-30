package BinarySearch;

import java.util.ArrayList;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        System.out.println(binarySearch(arr, 1));
    }

    public static Integer binarySearch(ArrayList<Integer> list, Integer n) {
        int lo = 0; // pointeiro da esquerda
        int hi = list.size(); // da direita
        int passos = 0;

        while (lo < hi) {
            passos++;
            int mid = lo + hi / 2; // o ponteiro vai pro meio

            if (mid == n) { // se achar ai blz fechou
                System.out.println("achou");
                return passos;
            } else if (mid < n) {
                lo = mid +1;
            } else {
                hi = mid;
            }
        }

        return n;
    }
}
