package org.example;

import java.util.List;

public class WildCard {

    public void printListOfAnyType(List<?> list){
        System.out.println("Print any Object Type List objects "+list);
    }


    public void printIntegerTypeList(List<? extends Number> list){
        System.out.println("Print List objects of Type Number of Subclass of Number "+list);
    }

    public void printDoubleTypeList(List<? super Double> list){
        System.out.println("Print List objects of Type Double or Superclass of Double "+list);
    }

}
