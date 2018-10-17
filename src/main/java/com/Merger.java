package com;
/*Задание 2.
*
* Есть два отсортированных массива, необходимо объеденить в один отсортированный массив.
   Пример:
    a1 [1,3,6,8,9]
	a2 [1,2,4,5]

	r  [1,1,2,3,4,5,6,8,9]
* */



/**
 * The <code>Merger</code> class provides methods <tt>mergeTwoSortedArrays</tt>
 * that merge two sorted arrays of <code>int</code> in a new one
 * and <tt>printElementsFromArrayOfIntegers<tt/>
 * that simply printing given arrays elements one by one.
 *
 * @author Anton Tsurkanu
 */
public class Merger {

    /**
     * Merge two sorted arrays of <code>int</code> in a new one.
     *
     * @param firstArray  array of <code>int</code> to be merged.
     * @param secondArray array of <code>int</code> to be merged.
     * @return new merged and sorted by "Merge algorithm" array of <code>int</code>.
     */
    public int[] mergeTwoSortedArrays(int[] firstArray, int[] secondArray) {
        if (firstArray == null && secondArray == null) {
            //Что делать? try catch?

            //Warning:(34, 42) Condition 'secondArray != null' is always 'true' when reached
        } else if (firstArray == null && secondArray != null) {
            return secondArray;
        } else if (secondArray == null) {
            return firstArray;
        }

        int[] combinedArray = new int[firstArray.length + secondArray.length];

        int i = 0, j = 0;
        int index = 0;

        while (i < firstArray.length && j < secondArray.length) {
            if (firstArray[i] < secondArray[j]) {
                combinedArray[index] = firstArray[i];
                i++;
            } else {
                combinedArray[index] = secondArray[j];
                j++;
            }
            index++;
        }

        while (i < firstArray.length) {
            combinedArray[index] = firstArray[i];
            index++;
            i++;
        }

        while (j < secondArray.length) {
            combinedArray[index] = secondArray[j];
            index++;
            j++;
        }

        return combinedArray;
    }

    /**
     * Print <code>int<code/> values from given array of <code>int</code>.
     *
     * @param arrayForPrinting values of elements of given array should be printed on the console.
     */
    public void printElementsFromArrayOfIntegers(int[] arrayForPrinting) {
        if (arrayForPrinting == null) {
            System.out.println("Array for printing is null!");
            return;
        }

        if (arrayForPrinting.length == 0) {
            System.out.println("Array for printing is empty!");
            return;
        }

        for (int element : arrayForPrinting
        ) {
            System.out.print(element + " ");
        }
    }
}