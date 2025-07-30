public class CharFreq {
    public static void main(String[] args) {
        String s = "java";
        int[] freq = new int[256];
        for (char c : s.toCharArray())
            freq[c]++;
        for (char c = 0; c < 256; c++)
            if (freq[c] > 0)
                System.out.println(c + ": " + freq[c]);
    }
}
