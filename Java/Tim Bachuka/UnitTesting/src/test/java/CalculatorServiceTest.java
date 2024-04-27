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
        int expected = 50;
        Assertions.assertEquals(expected,result);
    }

}

