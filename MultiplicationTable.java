package multiplicationtable;

public class MultiplicationTable {

    public static void main(String[] args) {
        final int A=9;
        int j, i, k;
        System.out.println("          MULTIPLICATION TABLE");
        System.out.print("\n   ");
        for (j = 1; j <= A; j++) {
            System.out.print("   " + j);
        }
        System.out.print("\n     ----------------------------------");
        for (i = 1; i <= A; i++) {
            System.out.print("\n " + i + "|");
            for (k = 1; k <= A; k++) {
                System.out.printf("%4d", i * k);

            }
        }
        System.out.print("\n");
    }

}
