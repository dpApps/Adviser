package Classes;

//Класс, который будет определять на какую тему задан вопрос.
//Значение переменной question отправляется в этот класс,
//он его обрабатывает, смотрит по ключевым словам и решает
//на какую тему выдавать ответ.

import Servlets.QHandler;

/**
 * Created by Denis on 12.09.2016.
 */
public class Situation {
    private QHandler qHandler = new QHandler();
    //    private String currentQuestion = qHandler.getQuestion(); //вопрос заданый юзером
//    private String question = currentQuestion.toLowerCase(); //вопрос, который будет обрабатывать, всё в нижнем регистре
    String currentQuestion = qHandler.getQuestion(); // присваиваем переменной вопрос пользователя, полученный QHandler
    private String question = currentQuestion.toLowerCase(); //переводим все в нижний регистр
    private static String answer = ""; // этой переменной присваиваем полученный ответ с помощью метода "тематического" класса

    public String getAnswer() {
        return answer;
    }


//    метод searchSubjects, который осуществляет поиск ключевых слов в строке
//    и передает решение о формировании ответа пользователю
//    соответствующему методу "тематического" класса

    public void searchSubjects() {
        if (question.contains("спать") || question.contains("не выспал") || question.contains("не высыпа"))
            answer = Sleep.answer();
        if (question.contains("машина") || question.contains("автомобиль") || question.contains("тачка"))
            answer = Car.answer();
    }
}