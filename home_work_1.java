

import java.util.Scanner;

// 1.1 нахождении факториала

/* public class home_work_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите факториал: ");
        int x = iScanner.nextInt();

        factor(x);
        System.out.print(factor(x));
    }

static double factor(int n) {
    if(n==1) return 1;
    return n*factor(n-1);
}
} */

// 1.2 нахождение n-ого треугольного числа

/* public class home_work_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int x = iScanner.nextInt();

        triangle(x);
        System.out.print(triangle(x));
    }

static double triangle(int n) {
    if(n==1) return 1;
    return n + triangle(n-1);
}
} */


// 2. Вывести все простые числа от 1 до 1000 

/* public class home_work_1 {
    public static void main(String[] args) {
        boolean isSimple;
        for (int i = 2; i < 100; i++) {
            isSimple = true;
            for(int j = 2; j <= (i/j); j++)
                    if(i%j == 0){
                        isSimple = false;}
            if(isSimple) {
                System.out.println(i);}
        } 
    }
} */

// 3. Реализовать простой калькулятор
public class home_work_1 {
    public static void main(String[] args) {
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
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                System.out.println(x/y);
                break;
            default:
                text = "Что-то пошло не так...";
                break;
        }
    }
}








