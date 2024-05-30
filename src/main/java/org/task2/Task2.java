package org.task2;


/*** Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
        если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
        но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.

***/

public class Task2 {


    public static void main(String[] args) {
        Integer[] arr1 = new Integer[]{1, 2, 3, 4, 5};
        String[] arr2  = new String[]{"1",  "2",  "3",  "4",  "5"};
        String[] arr3  = new String[]{"1",  "2",  "3",  "444",  "5"};
        System.out.println(compareArrays(arr1, arr2));
        System.out.println(compareArrays(arr3, arr2));


    }


    public static <T> boolean  compareArrays(T[] arr1, T[] arr2){
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if  (!arr1[i].getClass().getName().equals(arr2[i].getClass().getName())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
