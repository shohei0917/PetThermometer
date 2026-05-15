import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetThermometerTest {

    @Test

    void getTemperature5() {
        PetThermometer calc = new PetThermometer();
        String expected = "快適";
        String actual = calc . getMessage (25.9);
        assertEquals (expected, actual);
    }
    @Test

    void getTemperature6() {
        PetThermometer calc = new PetThermometer();
        String expected = "暑い";
        String actual = calc . getMessage (26.0);
        assertEquals (expected, actual);
    }
    @Test

    void getTemperature7() {
        PetThermometer calc = new PetThermometer();
        String expected = "暑い";
        String actual = calc . getMessage (30.0);
        assertEquals (expected, actual);
    }
}