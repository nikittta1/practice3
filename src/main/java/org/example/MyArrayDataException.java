package org.example;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i, int j ,String value) {
        super(String.format("В позиции %d,%d исходного массива находится не целое число '%s'", i+1, j+1, value));
    }
}
