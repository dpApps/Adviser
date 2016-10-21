package Classes;



import Databases.DBproccessor;
import Databases.Product;

import java.io.IOException;
import java.sql.*;

/**
 * Created by Павел on 12.10.2016.
 */
public class Job {
    private static final String URL = "jdbc:mysql://localhost:3306/basechat?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";


   public static void main(String args[]) throws SQLException{

           System.out.println(answer());

   }
     static String answer;
    static String answers;

          static String answer() throws SQLException {
               DBproccessor db = new DBproccessor();
             Connection conn = db.getConnection(URL, USERNAME, PASSWORD);
               Statement statrm = conn.createStatement();
             String query = "select * from basechat.id_job ORDER  BY  RAND() LIMIT 1";
             ResultSet resultSet = statrm.executeQuery(query);
               while (resultSet.next()) {
                   String name;
                   name = resultSet.getString("job_say");
                   Product product = new Product(name);
                   answers = product.toString();
               }
               answer = answers;
              return answer;
          }
          }


  /*  static String[] answers = {
            "Машина 1", "Машина 2", "Машина 3"
    };
    static String answer = "";

    static String answer() {
        Random random = new Random();
        answer = answers[random.nextInt(answers.length)];
        System.out.println(answer);
        return answer;
    }*/


   /* public static void CloseDB() throws ClassNotFoundException, SQLException
    {
        conn.close();
        statmt.close();
        resSet.close();

        System.out.println("Соединения закрыты");
    }*/
   /* static String[] answers ={
            "Ты любишь свою работу(шутка)","Как же меня задолбала твоя работа","У тебя лучшая работа на свете(шутка)","Тебя ожидает прятный сюрприз на работе",
            "Твоя работа лучше моей","А каково мне от твоих вопросов?"
    };*/

  /*  static String answer(){
        Random random = new Random();
        answer = answers[random.nextInt(answers.length)];
        System.out.println(answer);
        return answer;
    }
    }*/

    /* public static Connection getConnection() throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.jdbc.Driver");
        return   DriverManager.getConnection("jdbc:mysql://localhost:3306/basechat","root","123456");
    }

        public static String Post() throws SQLException,ClassNotFoundException {
            Connection c = getConnection();
            PreparedStatement ps = c.prepareStatement("SELECT id_number FROM id_job");

            ResultSet resultSet = ps.executeQuery("SELECT id_number FROM id_job");

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String txt = resultSet.getString(2);
                answers.add(new Post(id, txt));
            }
        }*/
   /* public List answers = new ArrayList(){
    };

    static String answer = "";

    static String answer(){
        Random random = new Random();
        answer = answers[random.nextInt(answers.length)];
        System.out.println(answer);
        return answer;
    }
}
  /*  static String[] answers ={
            "Ты любишь свою работу(шутка)","Как же меня задолбала твоя работа","У тебя лучшая работа на свете(шутка)","Тебя ожидает прятный сюрприз на работе",
            "Твоя работа лучше моей","А каково мне от твоих вопросов?"
    };*/