import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dmoe1 {
    public static void main(String[] args) {
        // 2.注册驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        // 3.创建连接对象
        String url = "jdbc:mysql://localhost:3306/ksgl";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, "root", "123456");
            System.out.println(conn);
            System.out.println("----------------------");

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
