package org.dsaCourse1;

public class W04_PalindromeString {
    public static void reverseString(char[] s) {
        System.out.println(s);
        int i = 0, j = s.length - 1;
        char aux;
        while (i < j) {
            // chnage the chars
            aux = s[i];
            s[i] = s[j];
            s[j] = aux;

            // move forward
            i++;
            j--;
        }
        System.out.println(s);

    }
}
