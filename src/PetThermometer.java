public class PetThermometer {

    public String getMessage(double temperature) {
        if (temperature < 24.0) {
            return "寒い";
        } else if (temperature < 26.0) {
            return "快適";
        } else {
            return "暑い";
        }
    }
}