import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PetThermometerTest {
    @Test
     void case1(){
        PetThermometer petThermometer = new PetThermometer();
        String expected="寒い";
        String actual=petThermometer.getMessage(20.0);
        assertEquals(expected,actual);
    }

    @Test
    void case2(){
        PetThermometer petThermometer = new PetThermometer();
        String expected="寒い";
        String actual=petThermometer.getMessage(23.9);
        assertEquals(expected,actual);
    }

    @Test
    void case3(){
        PetThermometer petThermometer = new PetThermometer();
        String expected="快適";
        String actual=petThermometer.getMessage(24.0);
        assertEquals(expected,actual);
    }

    @Test
    void case4(){
        PetThermometer petThermometer = new PetThermometer();
        String expected="快適";
        String actual=petThermometer.getMessage(25.0);
        assertEquals(expected,actual);
    }
}