package com.calculator.junit;

import com.calculator.junit.main.Calculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
@SpringBootTest
public class JunitApplicationTests {
    private Calculator sut;
    @Before
    public void setUp(){
        sut = new Calculator ();
    }

    @Test
    public void evaluateCalculator_Addition() {
        float result = sut.Addition (3,7);
        assertEquals (10,result,0);
    }
    @Test
    public void evaluateCalculator_Subtraction() {
        float result = sut.Substaction (5,1);
        assertEquals (4,result,0);
    }
    @Test
    public void evaluateCalculator_Multiplication() {
        float result = sut.Multiplication (3,7);
        assertEquals (21,result,0);
    }
    @Test
    public void evaluateCalculator_Division() {
        float result = sut.Division (10,2);
        assertEquals (5,result,0);
    }

    @Test
    public void evaluateCalculator_Square() {
        double result = sut.Square (9);
        assertEquals (3,result,0);
    }
    @Test
    public void evaluateCalculator_Percent() {
        double result = sut.Percent (10);
        assertEquals (0.1,result,0);
    }

}
