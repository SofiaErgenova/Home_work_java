import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

/* Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов. */

/* public class Home_work_5 {
    public static void main(String[] args) {

    Map<Integer, String> telbook = new HashMap<>();
    telbook.put(123456, "Колобок");
    telbook.put(234578900, "Колобок");
    telbook.put(1234562, "Колобок");
    telbook.put(123456, "Дуремар");
    telbook.put(223, "Айболит");
    telbook.put(456, "Айболит");
    telbook.put(3456, "Дуремар");

    Scanner iScanner = new Scanner(System.in);
   
    int key;

    do {
        System.out.println("Меню: \n 1. вывод телефонной книги \n 2. поиск по имени \n 3. поиск по номеру \n 4. удаление записи \n 5. добавление записи \n 6. выход \n"); 

        key = iScanner.nextInt();
        switch (key) {
            case 1:
                System.out.println("Вывод телефонной книги");

                for (var item: telbook.entrySet()) {
                    System.out.printf("[%d: %s]\n",item.getKey(), item.getValue());
                }
                break;

            case 2:
                System.out.println("Поиск по имени");
                System.out.printf("Введите имя: ");
        
                String searchName = iScanner.next();
                for (var item : telbook.entrySet()) {
                    if (item.getValue().equals(searchName)) {
                        System.out.printf("Номер телефона %s: %d\n", searchName, item.getKey());
                    }
                }
                break;

            case 3:
                System.out.println("Поиск имени по номеру телефона");
                System.out.printf("Введите номер телефона: ");
        
                int searchNumber = iScanner.nextInt();
                if (telbook.containsKey(searchNumber)) {
                    System.out.printf("Имя по номеру телефона %d: %s\n", searchNumber, telbook.get(searchNumber));
                } else {
                    System.out.println("Номер не найден");
                }
                break;

            case 4:
                System.out.printf("Удаление из телефонной книги. ");
                System.out.printf("Введите номер телефона: ");
            
                int removeKey = iScanner.nextInt();
                telbook.remove(removeKey);
                System.out.printf("Телефонный номер %d удален\n", removeKey);
                
                break;
            
            case 5:
                System.out.println("Добавить в телефонную книгу ");
                System.out.printf("Введите имя: ");
                String name = iScanner.next();
            
                System.out.printf("Введите номер телефона: ");
                int telnum = iScanner.nextInt();
            
                telbook.putIfAbsent(telnum, name);
                System.out.printf("Телефонный номер добавлен\n");
    
                break;

            
            case 6:
                System.out.printf("Выход из программы.");
                break;

            default:
                System.out.printf("Неверный выбор.");
                break;
        }

    } while (key != 6);

    }    
}  */
 

/* Пусть дан список сотрудников:Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности. */

/* public class Home_work_5 {
    public static void main(String[] args) {

    String str = new String("Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов");

    String[] words = str.split(" ");

    Map<String, Integer> map = new HashMap<>();
        
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        
        List <Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        
        for (Map.Entry<String, Integer> entry : list) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
} */




/* Реализовать алгоритм пирамидальной сортировки (HeapSort). */

import java.util.TreeMap;

public class Home_work_5 {

    static int[] randomArray (int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10);
            }
        System.out.println(Arrays.toString(array));
        return array;    
    }

    public static void main(String[] args) {

        int[] arr = randomArray(5);

        TreeMap<Integer, Integer> heap = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            heap.put(arr[i], i);
        }
        
        int i = 0;
        for (Integer key : heap.keySet()) {
            arr[i++] = key;   
        }
        System.out.println(Arrays.toString(arr));   
    } 
}


 