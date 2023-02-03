public class HalfPyramidAlpha {
    static char alpha = 'a';
    static int n = 5;

    public static void pat1() {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(alpha);
            }
            alpha++;
            System.out.println();
        }
    }

    public static void pat2() {
        for(int i=1;i<=n;i++) {
            alpha = 'a';
            for(int j=1;j<=i;j++) {
                System.out.print(alpha++);
            }
            System.out.println();
        }
    }

    static char letter = 'a';

    public static void pat3() {
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(letter);
                letter++;
            }
            System.out.println();
        }
    }
}
