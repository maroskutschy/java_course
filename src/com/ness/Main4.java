package com.ness;

import java.util.ArrayList;

class IntClass {
    private int value;

    public IntClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}



public class Main4 {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("test");

        //ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);

        ArrayList<Integer> intArrayList =  new ArrayList<Integer>();
        for (int i=0; i <=10; i++) {
            //boxing = from primitive to wrapper
            intArrayList.add(Integer.valueOf(i));

            //Autoboxing = boxing done in the background
            //intArrayList.add(i);
        }

        for (int i=0; i <=10; i++) {
            // Unboxing = from wrapper to primitive
            System.out.println(intArrayList.get(i).intValue());
        }



        //boxing = from primitive to wrapper
        Integer myIntValue2 = Integer.valueOf(56);

        //Autoboxing = boxing done in the background
        Integer myIntValue = 56;


        // Unboxing = from wrapper to primitive
        int myInt2 = myIntValue.intValue();

        // AutoUnboxing = unboxing done in the background
        int myInt = myIntValue;









    }

}
