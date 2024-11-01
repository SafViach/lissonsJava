package lesson044._02_preparing_statement;

import lesson044._04_db.Staff;
import lombok.SneakyThrows;

import java.sql.DriverManager;
import java.util.ArrayList;

public class SelectPrepared {
    public static final String URL = "jdbc:mysql://localhost:3306/po_2309_sl";
    public static final String QUERY = "SELECT name , age , department FROM staff WHERE AGE >? AND department = ?";
    @SneakyThrows
    public static void main(String[] args) {

        Class.forName("com.mysql.cj.jdbc.Driver");

        try(var cn = DriverManager.getConnection(URL,"root","");
            var ps = cn.prepareStatement(QUERY)){
            var staff = new ArrayList<Staff>();
            ps.setInt(1,24);
            ps.setInt(2,3);
            var rs = ps.executeQuery();

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
