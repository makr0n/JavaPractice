public class HW1_Task3 {
    public static void main(String[] args) {
        String s = "  hello world  ";
        int i = 0;
        int n = s.length();
        String result = new String();
        while (i < n) {
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }
            if (i >= n) {
                break;
            }
            int j = i + 1;
            while (j < n && s.charAt(j) != ' ') {
                j++;
            }
            String word = s.substring(i, j);
            if (result.length() == 0) {
                result = word;
            } else {
                result = word + " " + result;
            }
            i = j + 1;
        }

        System.out.println(result);
    }
}
