
import java.io.IOException;
import java.util.logging.*;
import java.util.Scanner;


/* 1 Реализуйте алгоритм сортировки пузырьком числового массива,
 результат после каждой итерации запишите в лог-файл. */
import java.util.*;

public class home_work_2 {
    static int[] randomArray (int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
            System.out.println(array[i]);}
        return array;    
    }
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(home_work_2.class.getName());
        FileHandler fh = new FileHandler("log_2.txt", true);

        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите размер массива из случайных чисел: ");
        int x = iScanner.nextInt();

        /* int[] arr = new int[] {3,2,4,3,2,3,8,5}; */

        int[] arr = randomArray(x);

         int temp;
         for (int i = 0; i < arr.length-1; i++)
         {logger.info((Arrays.toString(arr)));
            for(int j = i+1; j < arr.length; j++){
                if (arr[i] > arr[j]) {                
                    temp = arr[i];                
                    arr[i] = arr[j];
                    arr[j] = temp;}}

        }
        System.out.println(Arrays.toString(arr));     
    }    
}
 

/* 2. К калькулятору из предыдущего дз добавить логирование. */

/* public class home_work_2 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(home_work_2.class.getName());
        FileHandler fh = new FileHandler("log_1.txt", true);

        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        float x = iScanner.nextInt();

        System.out.printf("Введите второе число: ");
        float y = iScanner.nextInt();

        System.out.printf("Введите номер операции:\n 1.сложение\n 2.вычитание\n 3.умножение\n 4.деление\n  ");
        int z = iScanner.nextInt();

        String text = "";
        switch(z){
            case 1:
                System.out.println(x+y);

                logger.info("сложение: " + x + " + " + y + " ="+ (x+y));
                break;
            case 2:
                System.out.println(x-y);
    
                logger.info("вычитание: " + x + " - " + y + " ="+ (x-y));
                break;
            case 3:
                System.out.println(x*y);
              
                logger.info("умножение: " + x + " * " + y + " ="+ (x*y));
                break;
            case 4:
                System.out.println(x/y);
              
                logger.info("деление: " + x + " / " + y + " ="+ (x/y));
                break;
            default:
                text = "Что-то пошло не так...";
             
                logger.info("Что-то пошло не так...");
                break;
        }
    }
}
 */
