package JAVA.OOP;

// Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на консоль.
// В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T. 
// Затем мы используем цикл for-each, чтобы пройти по всем элементам массива и вывести их на консоль.
// В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них. 
// В результате мы получаем вывод на консоль элементов каждого массива.
// Таким образом, обобщенные методы позволяют нам создавать код, который может работать с разными типами данных, обеспечивая повторное использование и гибкость.

import java.util.Arrays;

public class OOP42 {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
 
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"IT", "JUST", "WORKS"};
 
        System.out.println(" Массив Integer: ");
        printArray(intArray);
 
        System.out.println(" Массив String: ");
        printArray(stringArray);
    }
}
