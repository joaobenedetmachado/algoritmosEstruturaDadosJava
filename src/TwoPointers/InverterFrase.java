package TwoPointers;

public class InverterFrase {
    public static void main(String[] args) {

    }
    public String reverseWord(String s) {
        StringBuilder res = new StringBuilder();
        int l = 0;
        int r = 0;

        while (r <= s.length()) {
            // Quando encontrar espaço ou o final da string
            if (r == s.length() || s.charAt(r) == ' ') {
                StringBuilder word = new StringBuilder(s.substring(l, r));
                res.append(word.reverse());

                // Adiciona o espaço se não for o fim
                if (r != s.length()) {
                    res.append(" ");
                }

                r++;
                l = r;
            } else {
                r++;
            }
        }

        return res.toString();
    }

}
