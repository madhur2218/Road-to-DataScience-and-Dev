import org.example.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {

//test two methods of sum
    @Test
    public void addTest(){
        int result = CalculatorService.add(2,3);
        //actual result
        //expected result
        int expected = 5;
        Assertions.assertEquals(expected,result);
    }

    @Test
    public void multTest(){
        int result = CalculatorService.mult(2,4);
        int expected = 8;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void divTest(){
        double result = CalculatorService.div(2.0,2.0);
        int expected =1 ;
        Assertions.assertEquals(expected, result);

    }

}

