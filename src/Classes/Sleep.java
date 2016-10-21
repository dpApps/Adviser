package Classes;

import java.sql.SQLException;
import java.util.Random;

/**
 * Created by Denis on 17.09.2016.
 */
public class Sleep {

    static String[] answers = {
            "Хватит спать, иди работай!!!", "Выпей бодрящего кофе", "Сон для слабаков!"
    };
    static String answer = "";

    static String answer() {
        Random random = new Random();
        answer = answers[random.nextInt(answers.length)];
        return answer;
    }

}
