package org.dsaCourse1;

public class W02_PrintingPattern {
    public static  void printTrianglePattern1(int n) {

        int count = 0;
        for (int i = 1; i<=n;i++) {
            for (int j=1; j<=i;j++) {
                count ++;
                System.out.print(count + " ");
            }
            System.out.println();
        }

    }

    public static  void printPascalTriangle(int n) {


        for (int i = 1; i<=n;i++) {
            int count = 1;
            for (int j=1; j<=i;j++) {
                System.out.print(count + " ");
                count =  count * (i-j) /j;
            }
            System.out.println();
        }

    }
}
