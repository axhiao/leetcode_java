package leetcode75;

public class MergeStringsAlternately {

    public static String mergeAlternately(String word1, String word2) {
        if ("".equals(word1) || "".equals(word2))
            return word1 + word2;

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        StringBuilder sb = new StringBuilder(word1.length()+word2.length());
        int i = 0;
        //-0  1  2  3  4
        // 0  2  4  6  8
        //   1  3  5  7
        //-  0  1  2  3
        for ( ; ; i++) {
            if ((i&1)==0) {
                sb.append(w1[i/2]);
                if (i/2 == w1.length-1)
                    break;
            } else {
                sb.append(w2[(i - 1) / 2]);
                if ((i - 1) / 2 == w2.length - 1)
                    break;
            }
        }
        if ((i&1)==0 && ((i-1)/2 < w2.length)) {
            for (i=i+1; (i-1)/2 < w2.length; i=i+2) {
                sb.append(w2[(i-1)/2]);
            }
        }
        if ((i&1)==1 && (i/2 < w1.length)) {
            for (i=i+1; i/2 < w1.length; i=i+2) {
                sb.append(w1[i/2]);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        String word1 = "abcd", word2 = "pq";

        String r = mergeAlternately(word1, word2);

        System.out.println(r);
    }
}
