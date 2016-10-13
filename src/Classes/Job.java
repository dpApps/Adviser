package Classes;

import java.util.Random;

/**
 * Created by Павел on 12.10.2016.
 */
public class Job {
    static String[] answers ={
        "Ты любишь свою работу(шутка)","Как же меня задолбала твоя работа","У тебя лучшая работа на свете(шутка)","Тебя ожидает прятный сюрприз на работе",
            "Твоя работа лучше моей","А каково мне от твоих вопросов?"
    };
    static String answer = "";

    static String answer(){
        Random random = new Random();
        answer = answers[random.nextInt(answers.length)];
        System.out.println(answer);
        return answer;
    }
}
