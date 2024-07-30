public class prasup11 {
    public static void main(String[] args) {
        String str = "resource";
        System.out.println("The given string is: " + str);
        System.out.println("The duplicate characters and counts are:");
        countduplicates(str);
    }

    public static void countduplicates(String str) {
        for (char c = 'a'; c <= 'z'; c++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(c + " appears " + count + " times");
            }
        }
    }
}
