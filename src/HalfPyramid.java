public class HalfPyramid {
    static int n = 5;

    public static void pat1() {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void pat2() {
        for(int i=n;i>=1;i--) {
            for(int j=i;j>0;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pat3() {
        for(int i=1;i<=n;i++) {
            for(int k=n-i;k>0;k--) System.out.print(" ");
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pat4() {
        for(int i=n;i>=1;i--) {
            for(int k=n-i;k>0;k--) System.out.print(" ");
            for(int j=i;j>=1;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
