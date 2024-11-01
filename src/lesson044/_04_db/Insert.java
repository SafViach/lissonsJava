package lesson044._04_db;

import lombok.SneakyThrows;

import java.sql.Driver;
import java.sql.DriverManager;

public class Insert {
    public static final String URL = "jdbc:mysql://localhost:3306/po_2309_sl";
    @SneakyThrows
    public static void main(String[] args) {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try(var cn = DriverManager.getConnection(URL,"root","");
            var st = cn.createStatement()){
            var query = "INSERT INTO staff(name , age , department , project) VALUES ('employee11',25,5,3)";
            st.execute(query);

        }
    }

}
