package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность списка: ");
        int size = sc.nextInt();
        List<String> list = new ArrayList<>();
        System.out.println("Введите элементы списка: ");
        for(int i= -1; i<size; i++) {
            list.add(sc.nextLine());
        }
        HashSet<String> set = new HashSet<>(list);
        System.out.println("Создан :"+ list);
        System.out.println("Уникальные элементы: " + set);
    }
}
