package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Lambda {
    public int transformAndAdd(List<Integer> l, Function<Integer, Integer> ops) {

        int result = 0;

        for (Integer s : l)

            result += ops.apply(s);

        return result;

    }

// Operations utility class

    class OpsUtil {

        // Method 1

        // To half the variable

        public  Integer doHalf(Integer x) {

            return x / 2;

        }

        // Method 2

        // Square up the integer number

        public static Integer doSquare(Integer x) {

            return x * x;

        }



    }

    List<Integer> list = new ArrayList<>();


    transformAndAdd(list, new Function<Integer, Integer>() {

        public Integer apply(Integer i) {

            // The method

            return OpsUtil.doHalf(i);

        }

    });



    tranformAndAdd(list, ....TODO...);

// Apply a method reference for  getting square of a number

    tranformAndAdd(list, doSquare::);
}
