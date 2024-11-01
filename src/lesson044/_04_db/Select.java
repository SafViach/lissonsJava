package lesson044._04_db;

import lombok.SneakyThrows;

import java.sql.DriverManager;
import java.util.ArrayList;

public class Select {
    public static final String URL = "jdbc:mysql://localhost:3306/po_2309_sl";
    @SneakyThrows
    public static void main(String[] args) {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try(var cn = DriverManager.getConnection(URL,"root","");
            var st = cn.createStatement()){
            var query = "SELECT name , age , department FROM staff";
            var staff = new ArrayList<Staff>();
            var rs = st.executeQuery(query);
            while (rs.next()){
                var name = rs.getString(1);
                var age = rs.getInt("age");
                var department = rs.getInt(3);
                staff.add(new Staff(name , age , department));
            }
            staff.forEach(System.out::println);



        }
    }

}
