package Classes;

import Databases.DBproccessor;
import Databases.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

/**
 * Created by Denis on 17.09.2016.
 */
public class Car  {
    private static final String URL = "jdbc:mysql://localhost:3306/basechat?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";


    static String answer = "";
    static String answers;


    static String answer() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        DBproccessor db = new DBproccessor();
        Connection connection = db.getConnection(URL, USERNAME, PASSWORD);
        Statement statrm = connection.createStatement();
        String query = "select * from basechat.id_car ORDER  BY  RAND() LIMIT 1";
        ResultSet resultSet = statrm.executeQuery(query);
        while (resultSet.next()) {
            answers = resultSet.getString("car_say");
            Product product = new Product(answers);
            System.out.println(product);
        }
        answer = answers;
        return answer;
    }
}

