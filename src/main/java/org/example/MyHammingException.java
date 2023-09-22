package org.example;

final  class MyHammingException extends RuntimeException{

    public MyHammingException(int num) {
        super("В ячейке массива число из последовательности Хемминга: " + num);
    }

    public static boolean hamming(int n) {
        int[] h = new int[1000];
        h[0] = 1;
        int x2 = 2, x3 = 3, x5 = 5;
        int i = 0, j = 0, k = 0;
        for (int index = 1; index < h.length; index++) {
            h[index] = Math.min(x2, Math.min(x3, x5));
            if (h[index] == x2) x2 = 2 * h[++i];
            if (h[index] == x3) x3 = 3 * h[++j];
            if (h[index] == x5) x5 = 5 * h[++k];
        }
        for (long element : h) {
            if (element == n) {
                return true;
            }
            }
        return false;
    }
}




