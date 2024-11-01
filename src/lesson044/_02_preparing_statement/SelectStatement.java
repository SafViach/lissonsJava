package lesson044._02_preparing_statement;

import lesson044._04_db.Staff;
import lombok.SneakyThrows;

import java.sql.DriverManager;
import java.util.ArrayList;

public class SelectStatement {
    public static final String URL = "jdbc:mysql://localhost:3306/po_2309_sl";
    @SneakyThrows
    public static void main(String[] args) {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try(var cn = DriverManager.getConnection(URL, "root","");
        var st = cn.createStatement()){
            var query = String.format("SELECT name , age , department FROM staff WHERE AGE >%d AND department = %d",Integer.parseInt(args[0]),Integer.parseInt(args[1]));
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
