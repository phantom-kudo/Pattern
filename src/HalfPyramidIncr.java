public class HalfPyramidIncr {
    static int n = 5;

    public static void pat1() {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static int x = 1;
    public static void pat2() {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(x++ + " ");
            }
            System.out.println();
        }
    }
}
