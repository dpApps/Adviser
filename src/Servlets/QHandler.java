package Servlets;

import java.io.IOException;

/**
 * Created by Denis on 12.09.2016.
 */
public class QHandler extends javax.servlet.http.HttpServlet {
    private String question;

    public String getQuestion() {
        return question;
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        question =  request.getParameter("question"); // получаем вопрос, введеный юзером

    }
}
