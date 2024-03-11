package esercizio_1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        int[] numArray = new int[5];
        for (int i = 0; i < numArray.length; i++) {
            Random random = new Random();
            numArray[i] = random.nextInt(1, 10);
        }


        Scanner scanner = new Scanner(System.in);
        int value = 10;

        while (value != 0) {
            logger.info("Choose a number between 1 and 10, or press 0 if you want to close the application.");
            value = scanner.nextInt();
            if (value != 0) {
                if (value >= 1 && value <= 10) {
                    int position = 10;
                    logger.info("Choose where to insert the number between 1 and 5");
                    position = scanner.nextInt();
                    if (position >= 1 && position <= 5) {
                        numArray[position - 1] = value;
                        logger.info(Arrays.toString(numArray));
                    } else {
                        logger.error("error! choose a number between 1 and 5");
                    }
                } else {
                    logger.error("error! choose a number between 1 and 10");
                }
            }


        }
        scanner.close();

    }

}
