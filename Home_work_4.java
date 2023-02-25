
/* Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список. */

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

/* public class Home_work_4 {

    static LinkedList<String> revertList (LinkedList<String> list) {

        LinkedList<String> revertList = new LinkedList<String>();
        
        for (int i = 0; i < list.size(); i++) {
            revertList.add(list.removeLast());
            list.addFirst(revertList.getLast());
            }
        return revertList;
        }

    public static void main(String[] args) throws NoSuchElementException {  
        LinkedList<String> llist = new LinkedList<String>();
        llist.add(0,"zero");
        llist.add(1,"first");
        llist.add(2,"second");
        llist.add(3,"third");

        System.out.println("Список прямой: " + llist);

        System.out.println("Список перевернутый:" + revertList(llist));
    }
} */


/* 
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и 
удаляет его, first() - возвращает первый элемент из очереди, не удаляя. */

/*  public class Home_work_4 {
    
    public static class MyQueue<T> {

        private LinkedList<T> queue;

        public MyQueue() {
            queue = new LinkedList<>();
        }

        public void enqueue(T item) {
            queue.addLast(item);
        }

        public T dequeue() {
            return queue.removeFirst();
        }

        public T first() {
            return queue.getFirst();
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public int size() {
            return queue.size();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (T item : queue) {
                sb.append(item.toString()).append(", ");
            }
            if (!queue.isEmpty()) {
                sb.delete(sb.length() - 2, sb.length());
            }
            sb.append("]");
            return sb.toString();
        }

    }

    public static void main(String[] args) {  
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        System.out.println("Помещает элемент в конец очереди : ");
        System.out.println("Очередь: " + myQueue);
        System.out.println();
        
        System.out.println("Возвращает первый элемент из очереди и удалаяет его: " +  myQueue.dequeue());
        System.out.println("Возвращает первый элемент из очереди, не удаляя его: " + myQueue.first());
    }
} */

/* В калькулятор добавьте возможность отменить последнюю операцию. */

public class Home_work_4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        float x = iScanner.nextInt();

        System.out.printf("Введите второе число: ");
        float y = iScanner.nextInt();

        System.out.printf("Введите номер операции:\n 1.сложение\n 2.вычитание\n 3.умножение\n 4.деление\n  ");
        int z = iScanner.nextInt();

        Stack<Operation> stack = new Stack<>();
        float result = 0;

        switch(z){
            case 1:
                result = x+y;
                stack.push(new Operation('+', x, y, result));
                break;
            case 2:
                result = x-y;
                stack.push(new Operation('-', x, y, result));
                break;
            case 3:
                result = x*y;
                stack.push(new Operation('*', x, y, result));
                break;
            case 4:
                result = x/y;
                stack.push(new Operation('/', x, y, result));
                break;
            default:
                System.out.println("Что-то пошло не так...");
                return;
        }
        System.out.println(result);

        // Цикл для работы с отменой операций
        while (true) {
            System.out.print("Введите команду (1 - отменить операцию, 0 - выход): ");
            int command = iScanner.nextInt();
            if (command == 0) {
                break;
            } else if (command == 1) {
                if (stack.empty()) {
                    System.out.println("Стек пуст, нельзя выполнить операцию отмены!");
                    continue;
                }
                Operation lastOperation = stack.pop();
                float prevResult = lastOperation.prevResult;
                switch(lastOperation.operator){
                    case '+':
                        result = prevResult;
                        break;
                    case '-':
                        result = prevResult;
                        break;
                    case '*':
                        result = prevResult / lastOperation.operand2;
                        break;
                    case '/':
                        result = prevResult * lastOperation.operand2;
                        break;
                    default:
                        System.out.println("Что-то пошло не так...");
                        return;
                }
                System.out.println("Операция отменена");
                
            }
        }
    }

    // Класс для хранения операций
    private static class Operation {
        char operator;
        float operand1;
        float operand2;
        float prevResult;

       public Operation(char operator, float operand1, float operand2, float prevResult) {
            this.operator = operator;
            this.operand1 = operand1;
            this.operand2 = operand2;
            this.prevResult = prevResult;
        } 
    }
}
       
