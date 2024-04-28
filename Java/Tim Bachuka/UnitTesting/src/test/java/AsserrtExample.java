import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsserrtExample {

    //Assertions- validating actual result wuth expected recult

    @Test
    public void test(){
        System.out.println("Testing some assertions methods");
        double actual = 12;
        double expected = 12;
        //Overloaded
        Assertions.assertEquals(expected,actual);

        int actualArray[] = {1,2,3,4,5};
        int expectedArray[] = {1,2,3,4,5,8};
        Assertions.assertArrayEquals(expectedArray,actualArray);

        String actualStr = new String("Madhur");
        String expectedStr =new String("Madhur");
        Assertions.assertSame(expectedStr,actualStr);

        String actStr= "naman";
        String expStr= "naman";
        Assertions.assertEquals(expStr,actStr);

//        Assertions.assertNull();
//        Assertions.assertTrue();
//        Assertions.assertFalse();

        boolean a = true;
        Assertions.assertTrue(a);
        Assertions.assertFalse(a);

        List<Integer> l1= Arrays.asList(1,2,3,4,5);
        List<Integer> l2 = Arrays.asList(1,2,3,1,5);
        Assertions.assertIterableEquals(l1,l2);   //My test case fails as order is not same in l1 and l2

    }
}

