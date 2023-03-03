/* Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.

Создать множество ноутбуков.

Написать метод, который будет запрашивать у пользователя критерий (или критерии) 
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Objects;
import java.util.stream.Collectors;

public class Home_work_06 {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.id = 0001;
        laptop1.brand = "MacBook";
        laptop1. randomAccessMemory = 32;
        laptop1.color = "grey";
        laptop1.operatingSystem = "Mac OS";


        Laptop laptop2 = new Laptop();
        laptop2.id = 0002;
        laptop2.brand = "Asus";
        laptop2. randomAccessMemory = 32;
        laptop2.color = "red";
        laptop2.operatingSystem = "Microsoft Windows";


        Laptop laptop3 = new Laptop();
        laptop3.id = 0003;
        laptop3.brand = "Lenovo";
        laptop3. randomAccessMemory = 16;
        laptop3.color = "black";
        laptop3.operatingSystem = "Microsoft Windows";

        Laptop laptop4 = new Laptop();
        laptop4.id = 0004;
        laptop4.brand = "Asus";
        laptop4. randomAccessMemory = 8;
        laptop4.color = "black";
        laptop4.operatingSystem = "Linux";

        Laptop laptop5 = new Laptop();
        laptop5.id = 0005;
        laptop5.brand = "MacBook";
        laptop5. randomAccessMemory = 32;
        laptop5.color = "black";
        laptop5.operatingSystem = "Mac OS";

        Set<Laptop> laptops = new HashSet<>();
        laptops = new HashSet<Laptop>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5));

        System.out.println(laptop1.brand);

        Map <Integer, String> filter = new HashMap<>();
        filter.put(1, "brand");
        filter.put(2, "randomAccessMemory");
        filter.put(3, "color");
        filter.put(4, "operatingSystem");

        Scanner iScanner = new Scanner(System.in);
   
        System.out.println("Введите номер параметра: ");
        

        for (var item : filter.entrySet()) {
                System.out.printf("%d. %s \n", item.getKey(),item.getValue());
            }
        int key = iScanner.nextInt();

        if (key == 1) {
            Map <Integer, String> brand = new HashMap<>();
            brand.put(1, "MacBook");
            brand.put(2, "Asus");
            brand.put(3, "Lenovo");

            System.out.println("Выберите бренд: ");

            for (var item : brand.entrySet()) {
                System.out.printf("%d. %s \n", item.getKey(),item.getValue());}

            int setbrand = iScanner.nextInt();

            if(setbrand == 1) {

                Set<Laptop> laptopSet = laptops.stream()
                                .filter(l -> l.brand.equals(brand.get(1)))
                                .collect(Collectors.toSet());
                System.out.println(laptopSet);
                
            } 
            if(setbrand == 2) {

                Set<Laptop> laptopSet = laptops.stream()
                                .filter(l -> l.brand.equals(brand.get(2)))
                                .collect(Collectors.toSet());
                System.out.println(laptopSet);
                
            }
            if(setbrand == 3) {

                Set<Laptop> laptopSet = laptops.stream()
                                .filter(l -> l.brand.equals(brand.get(3)))
                                .collect(Collectors.toSet());
                System.out.println(laptopSet);    
            } 
        
        }
        if (key == 2) {
            Map <Integer, Integer> randomAccessMemory = new HashMap<>();
            randomAccessMemory.put(1, 8);
            randomAccessMemory.put(2, 16);
            randomAccessMemory.put(3, 32);

            System.out.println("Выберите обьем памяти: ");

            for (var item : randomAccessMemory.entrySet()) {
                System.out.printf("%d. %s \n", item.getKey(),item.getValue());}

            int setmemory = iScanner.nextInt();

            if(setmemory == 1) {

                Set<Laptop> laptopSet = laptops.stream()
                                .filter(l -> l.randomAccessMemory.equals(randomAccessMemory.get(1)))
                                .collect(Collectors.toSet());
                System.out.println(laptopSet);    
            } 
            if(setmemory == 2) {

                Set<Laptop> laptopSet = laptops.stream()
                                .filter(l -> l.randomAccessMemory.equals(randomAccessMemory.get(2)))
                                .collect(Collectors.toSet());
                System.out.println(laptopSet);    
            } 
            if(setmemory == 3) {

                Set<Laptop> laptopSet = laptops.stream()
                                .filter(l -> l.randomAccessMemory.equals(randomAccessMemory.get(3)))
                                .collect(Collectors.toSet());
                System.out.println(laptopSet);    
            } 
        }
    }     
}
