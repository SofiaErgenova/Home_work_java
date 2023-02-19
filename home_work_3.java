import java.util.ArrayList;
import java.util.Iterator;
import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

/* Реализовать алгоритм сортировки слиянием */

public class home_work_3 {
    static int[] randomArray (int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
            System.out.println(array[i]);}
        return array;    
    }

    static int[] sortArray (int [] array) {
       
        if (array.length == 1 || array.length == 0) {
            return array;     
        } else {
            int[] left_array = sortArray(Arrays.copyOfRange(array,0, array.length/2));
            int[] right_array = sortArray(Arrays.copyOfRange(array, array.length / 2, array.length));
            return merge(left_array ,right_array);
        }
    }
       
    private static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
            } else {
                result[k] = right[j];
                j++;
            }
            k++;
        }
        if (i == left.length) {
            while (j < right.length) {
                result[k] = right[j];
                j++;k++;
            }
        }
        if (j == right.length) {
            while (i < left.length) {
                result[k] = left[i];
                i++;k++;
            }
        }
        return result;
    }

        
    public static void main(String [] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите размер массива из случайных чисел: ");
        int x = iScanner.nextInt();

        int[] arr = randomArray(x);
        int[] arrayFinal = sortArray(arr);
        System.out.println("Результат сортировки");
        
        for (int i = 0; i < arrayFinal.length; i++) {
            System.out.println(arrayFinal[i]);}
           
    }   
} 


/* 2. Пусть дан произвольный список целых чисел, удалить из него четные числа */

/* public class home_work_3 {

    public static void main(String [] args)throws IOException  {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 10; i < 20; i++){
        list.add(i+1);
        }
        System.out.println(list);

        
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) { 
            int item = it.next();
            if(item%2 == 0 ) {
                it.remove();
            }
        }
        System.out.println(list);  
    } 
}  */


/* Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. */

 /* public class home_work_3 {
    public static void main(String [] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 5; i++){
        list.add(i+1);
        }
        System.out.println(list);

        System.out.println("Максимальное значение: " + Collections.max(list));
        System.out.println("Минимальное значение: " + Collections.min(list));

        Double average = list.stream().mapToInt(val -> val).average().orElse(0.0);
        System.out.println("Среднее значение: " + average);    
    }   
}  */