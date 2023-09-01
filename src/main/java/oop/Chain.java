package oop;

import java.util.Locale;

public class Chain {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        a = sum();// вызываем метод sum(), он отрабатывает и возвращает результат 5 в переменную a (к месту своего вызова)
        b = a + sum();

        a = sum1(3, 4); // в скобочках аргументы
        b = a + sum1(2, 6); // в скобочках аргументы

        String str = "       Hello, World     "; // STRING - неизменяемый класс
        char c = str.toLowerCase().trim().substring(3, 8).charAt(2);// в отношение объекта примени toLowerCase() - ЦЕПОЧКА ВЫЗОВОВ (CHAIN)
        // str = str.trim();
        // str = str.toLowerCase();
        // System.out.println(str);
        System.out.println(str);
        System.out.println(c);
    }

   /* str c = str.toLowerCase().trim() – получили строку (объект класса String),
    когда я обращаюсь к переменной str мы идем в область памяти heap, где лежит наша строка.
    Я говорю: в отношение этого объекта примени toLowerCase(). Метод возвращает новый объект класса
    STRING как результат работы метода и возвращает его к месту своего вызова, то есть в str.toLowerCase().
    И поскольку это объект класса STRING, то мы можем к нему применить нестатические методы (методы объекта)

    Это называется цепочка вызовов и ее можно продлевать солько угодно долго, например:
    char c = str.toLowerCase().trim().substring(3, 8).charAt(2);
    Надо понимать объект какого класса вернет метод, если вся цепочка методов в итоге возвращает,
    например, char, то итоговый результат работы цепочки мы должны положить в переменную типа char.

    После charAt(2) мы уже не сможем продолжить цепочку, так как метод возвращает объект char
    с маленькой буквы – примитивная переменная (не ссылочная, у них нет методов)
*/
    public static int sum() {
        return 2 + 3;
    }

    public static int sum1(int x, int y) { // в скобочках аргументы
        return x + y;
    }
}

