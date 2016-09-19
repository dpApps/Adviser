package Classes;

import java.util.Random;

/**
 * Created by Denis on 17.09.2016.
 */
public class Car {
    static String[] answers = {
            "Машина 1", "Машина 2", "Машина 3"
    };
    static String answer = "";

    static String answer() {
        Random random = new Random();
        answer = answers[random.nextInt(answers.length)];
        System.out.println(answer);
        return answer;
    }
}
