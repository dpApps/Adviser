package Databases;




import java.sql.*;

/**
 * Created by Павел on 17.10.2016.
 */
public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/basechat?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";



   /* public static void main(String[] args) throws SQLException {
        DBproccessor db = new DBproccessor();
        Connection conn = db.getConnection(URL, USERNAME, PASSWORD);
        String query = "select * from basechat.id_job  ORDER  BY  RAND() LIMIT 1";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()){

            String name;
            name = resultSet.getString("job_say");

            Product product = new Product(name);
            System.out.println(product);
        }


        statement.close();
        conn.close();
    }*/
}




///Написание запроса в конкретную колонку или столбец а также его редактирование

/*  String ISERT = "insert into product.products(product_name, price, shop_id) values (?, ?, ?)";
        PreparedStatement preparedStatemen = conn.prepareStatement(ISERT);
        preparedStatemen.setString(1,"PreparedFood");
        preparedStatemen.setDouble(2,98.9);
        preparedStatemen.setInt(3,2);
        preparedStatemen.execute();

        PreparedStatement preparedStatement = conn.prepareStatement(query); // Извлекаем конкретную строку или столбел таблицы
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            System.out.println(resultSet.getInt("product_id") + " " + resultSet.getString("product_name"));
        }
        preparedStatement.close();
        conn.close();
    }
}*/
       /* try{
           Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
        }catch (SQLException ex){
            System.out.println("Ошибка регистрации драйвера");
            return;
        }
        try(Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            Statement statement = connection.createStatement()){

            //statement.execute("INSERT INTO product.products(product_name, price, shop_id) VALUES (\"Sosage\",44,2)");
            //statement.executeUpdate("UPDATE product.products SET product_name = \"Snicers\" WHERE product_id=6");//Меняем значения в таблице
           // statement.addBatch();//Запускает сразу несколько команд
            statement.executeQuery("SELECT * FROM product.products");//Извлекает что-то из таблицы

        }catch (SQLException ex){
            ex.printStackTrace();
            System.out.print("База подключена");
            return;
        }

    }
}*/