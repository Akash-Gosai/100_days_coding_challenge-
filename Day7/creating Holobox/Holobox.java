import javax.lang.model.util.ElementScanner14;

public class Holobox {
    public static void main(String[] args) {
        int n;
        int m;
        System.out.print("Enter the value of m And n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
