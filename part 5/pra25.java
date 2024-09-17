public class pra25 {
    public static void main(String[] args) {
        try {
            int[] a = {1, 2, 3};
            System.out.println(a[10]); 
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
