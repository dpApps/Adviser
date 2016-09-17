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
    private String question = qHandler.getQuestion(); //вопрос заданый юзером
    int a =19;
//    метод searchSubjects, который осуществляет поиск ключевых слов в строке
//    и передает решение о формировании ответа пользователю
//    соответствующему классу

    void searchSubjects() {

    }
}