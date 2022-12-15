// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.util.*;

public class task {
    public static void main(String[] args) {

        List<Notebook> notebooks = Arrays.asList(
                new Notebook(102, 20000, "win8.1", "light gray"),
                new Notebook(106, 2500, "kali", "black"),
                new Notebook(80, 10000, "dos", "yellow"),
                new Notebook(160, 5000, "debian", "black"),
                new Notebook(302, 5000, "solaris", "gray"));

        filter(notebooks);
    }

    public static void filter(List<Notebook> notebooks) {
        System.out.println("ноутбуки с оперативной памятью от:");
        Scanner scanner = new Scanner(System.in);
        Integer ram = Integer.valueOf(scanner.nextLine());
        System.out.println("ноутбуки с жестким диском от:");
        Integer hdd = Integer.valueOf(scanner.nextLine());
        for (var i : notebooks) {
            if (i.getRAM() >= ram && i.getHDD() >= hdd)
                System.out.println(i);
        }
    }
}
