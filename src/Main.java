import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PetThermometer t = new PetThermometer();
        Scanner in = new Scanner(System.in);
        double temperature;
        temperature = in.nextDouble();
        System.out.println(t.getMessage(temperature));
    }
}
