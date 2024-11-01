package lesson044.practic;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static final String URL = "jdbc:mysql://localhost:3306/mydatabase";
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("указал неправильный путь к классу Driver");
        }
        try( var cn = DriverManager.getConnection(URL,"root","");
             var st = cn.createStatement()){
            var query = "CREATE TABLE lifeProduct(" +     //создал таблицу
                    "product_id BigInt UNSIGNED," +
                    " name_product varchar(15)," +
                    " model_product varchar(15)," +
                    " date_of_receipt date," +
                    " price_product double) " +
                    "CONSNAINT pk_product_id PRIMARY KEY(product_id)";
            //var query = "DROP TABLE lifeProduct";
            st.executeUpdate(query);
            System.out.println("операция выполнена успешно ");
        } catch (SQLException e) {
            System.out.println("неудалось выполнить операцию");
        }
    }
}
