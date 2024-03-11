package esercizio_2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            logger.info("Insert kilometers travelled: ");
            int kilometers = scanner.nextInt();
            System.out.println("Insert liters consumed: ");
            int liters = scanner.nextInt();
            logger.info(" The km/lt traveled by the car are: " + kilometers / liters);
        } catch (ArithmeticException ex) {
            logger.error("liters are not divisible by 0!");
        }
        ;

    }
}
