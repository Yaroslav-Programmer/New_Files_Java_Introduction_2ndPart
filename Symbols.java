package com.company;

import java.util.*;
import java.lang.String;

public class Symbols {
    private static Random random = new Random();
    private static int QUANTITY_OF_CREATURES = 103;

    public static void main(String[] args) {
        creatures();
    }


    private static void creatures(){
        char[] creatures = new char[QUANTITY_OF_CREATURES];
        char[] template = {'М', 'Ж', 'В', 'О'};
        int temp_length = template.length;
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("М", 0);
        numbers.put("Ж", 0);
        numbers.put("В", 0);
        numbers.put("О", 0);

        for (int i = 0; i < QUANTITY_OF_CREATURES; i++) {
            creatures[i] = template[random.nextInt(temp_length)];


            System.out.printf("creatures[%d] = '%c'\n", i, creatures[i]);
            numbers.computeIfPresent(String.valueOf(creatures[i]), (k, v) -> v + 1);
        }

        int max = Collections.max(numbers.values());
        String employee = getByKey(numbers, max);

        System.out.println((employee == "М" ? "Мужчин" :
                (employee == "Ж" ? "Женщин" :
                        (employee == "В" ? "Вампиров" :
                                "Оборотней")
                )
        ) + ": " + max);
    }

    private static <K, V> K getByKey(Map<K, V> map, V value) {
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}