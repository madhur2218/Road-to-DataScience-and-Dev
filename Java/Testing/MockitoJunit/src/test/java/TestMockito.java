import org.example.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMockito {

    @BeforeAll
    public static void setup(){
        System.out.println("Before all is running");
    }
    @Disabled
    @DisplayName("Test 3/3= 1")
    @Test
    public void test_integerDisivion_WhenThreeisDividedByThree_ShouldReturnOne(){
        Calculator obj1 = new Calculator();
        int actual_result = obj1.division(3,3);

        int expected = 1;

        assertEquals(expected, actual_result);
        System.out.println("division");
    }

    @DisplayName("Test 3-3=0 ")
    @Test public void test_Subtraction_WherThreeisSubtractedFromThree_ShouldReturnZero(){
        Calculator obj1= new Calculator();
        int actual_result = obj1.subtraction(3,3);
        int expected = 0;
        assertEquals(expected, actual_result);
        System.out.println("subtraction");

    }

    @AfterAll
    public static void Cleanup(){
        System.out.println("After all is running");
    }


}
