package com.platzi.javatests.util;

public class StringUtilTest {

    public static void main(String[] args) {

        assertEquals(StringUtil.repeat("hola",3),"holaholahola");
      //  System.out.println(result);


        String result2 = StringUtil.repeat("hola",1);
     //   System.out.println(result2);
        assertEquals(result2,"hola");


    }

    private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)){
            //System.out.println("ERROR");
            throw new RuntimeException(actual+" is not equal to expected "+ expected);
        }
    }

}