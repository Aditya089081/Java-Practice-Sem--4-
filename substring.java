public class substring {
    char []arrch;
    public static void findSubstrings(String str1) {
        int n = str1.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.println(str1.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        
        findSubstrings("abc");
    }
}
