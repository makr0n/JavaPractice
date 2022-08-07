public class HW1_Task3 {
    public static void main(String[] args) {
        String s = "   hello        world   ";
        s = s.trim();
        s = s.replaceAll("\\s+", " ");
        String[] words = s.split(" ");
        printArray(words);
        String k = " ";
        int l = words.length;
        for (int i = 0; i < l / 2; i++) {
            k = words[i];
            words[i] = words[l - 1 - i];
            words[l - 1 - i] = k;
        }

        printArray(words);
        s = String.join(" ", words);
        s = s.trim();
        System.out.println(s);
    }

    static public void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print("|");
        }
        System.out.println();
    }

}
