package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class GenericsClassRunner {
    public static void main(String[] args) {

        /* Parameterized Class
        var box = new Box<String>("Hello");
        System.out.println(box.getT());
        */

        /*Item.printItem("ABC");
        Item.printItems(1,2);*/

        /* Generic Interface
        Pair<Integer,String> pair1 = new Order<>(100, "Tortoise");
        System.out.println(pair1.getValue() +" live around " +pair1.getKey() + " years");
         */

        /* Restrict the types that can be used as an argument in a generic class or method*/
        //Bounded class
        Sum<Integer, Integer> integerSum = new Sum<>(100, 100);
        System.out.println(integerSum.getSum());

        var square = new Square();
        System.out.println("Mean Val :"+square.getMean(100,50));



        /* Wildcard Generics : to ease the restrictions in generics
        * 1: <?> : Accepts any Type
        * 2: <? extends T> Accepts T or subclass of T
        * 3: <? super T> Accepts T or any super class of Tss
        * */

        WildCard wildCard = new WildCard();

        var strings = new ArrayList<String>();
        strings.add("Sunday");
        strings.add("MOnday");
        var integers = new ArrayList<Integer>();
        integers.add(31);
        integers.add(28);

        var doubles = new ArrayList<Double>();
        doubles.add(31.0);
        doubles.add(28.0);

        wildCard.printListOfAnyType(strings);
        wildCard.printListOfAnyType(integers);

        /* compilation error*/
        //wildCard.printDoubleTypeList(integers);
        wildCard.printDoubleTypeList(doubles);

        wildCard.printIntegerTypeList(integers);


        /* Generic Constructor */
        System.out.println("Generic Constructor Example :"+new GenericConstructor(100.0).getValue());
    }
}