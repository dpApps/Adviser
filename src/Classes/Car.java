package Classes;

import java.sql.SQLException;
import java.util.Random;

/**
 * Created by Denis on 17.09.2016.
 */
public class Car  {
    public static void main(String args[]){
        System.out.println(answer());
    }
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
