package org.example;

public class Main {
    public static void main(String[] args) {
        String[][] myArray1 = new String[][] {
//                {"6", "13", "11", "13"},
//                {"7", "14", "19", "2"},
//                {"1", "26", "31", "6"},
//                {"34", "25", "9", "7"}
                {"19", "6", "7", "11"},
                {"19", "19", "7", "11"},
                {"19", "19", "7", "11"},
                {"19", "6", "7", "11"}
        };


        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(myArray1));
        } catch (MyArraySizeException | MyArrayDataException | MyHammingException e) {
            e.printStackTrace();
        }



    }
    private static int transformAndSum (String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int arrDim = 4;
        int sum = 0;

        if (arr.length != 4) {
            throw new MyArraySizeException(arrDim);
        }

        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new MyArraySizeException(arrDim);
            }
        }
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);

                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j ,arr[i][j]);
                }
                try {
                    num = Integer.parseInt(arr[i][j]);
                    if (MyHammingException.hamming(num))
                        throw new MyHammingException(num);
                } catch (MyHammingException ee){
                    ee.printStackTrace();
                }
            }
        }

        return sum;

    }

}

