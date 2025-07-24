package BigONotation;

import java.util.ArrayList;
import java.util.Arrays;

public class O_1 {
    public static void main(String[] args) {

       // Não importa o quao grande seja o input, o espaco temporal e ocupacional sera sempre o mesmo

       // Por exemplo: Pegar primeira posição de um array

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8)); // lista com x elementos

        System.out.println(arr.get(0)); // pegar a primeira posição
    }
}
