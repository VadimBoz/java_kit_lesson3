package org.task3;

import java.util.ArrayList;

/**3. Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
        Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из составляющих
        пары, а также переопределение метода toString(), возвращающее строковое представление пары.
        Работу сдать в виде ссылки на гит репозиторий.

**/
public class Pair <T1, T2, T3> {

    private final T1 first;
    private final T2 second;
    private final T3 third;

    public Pair(T1 first, T2 second, T3 third) {
        this.first = first;
        this.second = second;
        this.third  = third;
    }

    public T1 getFirst()  {
        return first;
    }

    public T2 getSecond()   {
        return second;
    }
    public T3 getThird()    {
        return third;
        }

    public String toString()   {
        return "Pair: first - " + first + "; second - " + second +  "; third  -  " + third;
    }


    public static void main(String[] args) {

        ArrayList<String> args1 = new ArrayList<>();
        args1.add("one");
        args1.add("two");
        Pair<Integer, String, ArrayList<String>> pair  = new Pair<>(1,  "one", args1);
        System.out.println(pair);
    }

}
