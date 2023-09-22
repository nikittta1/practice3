package org.example;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(int arrDim) {
        super(String.format("Размерность массива должна быть %d на %d", arrDim, arrDim));
    }
}
