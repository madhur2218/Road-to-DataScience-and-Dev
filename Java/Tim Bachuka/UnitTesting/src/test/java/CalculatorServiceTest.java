import org.example.CalculatorService;
import org.junit.jupiter.api.*;

import java.util.Date;

public class CalculatorServiceTest {

    int counter = 1;


    @BeforeAll  //before all test cases
    public static void init(){
        System.out.println("run all test cases");
        System.out.println("started all tests" + new Date());
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("Runs before each test cases");
    }

//test two methods of sum
    @Test
    public void addTest(){

        for(int i=0; i<=20;i++){
            counter = counter+1;
        }

        int result = CalculatorService.add(2,3);
        //actual result
        //expected result
        int expected = 5;
        Assertions.assertEquals(expected,result);
        System.out.println("counter after first test case is  "+ counter);
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

    @AfterAll  //after all test cases
    public static void cleanup(){
        System.out.println("All test cases end");
        System.out.println("End test cases " + new Date());

    }

    //@Test
    //@BeforeAll
    //@BeforeEach
    //@AfterAll
    //@AfterEach

}

