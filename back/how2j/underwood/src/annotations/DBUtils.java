package annotations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@JDBCConfig(ip = "127.0.0.1",database = "test",encoding = "UTF-8", loginName = "root", password = "root"
)
public class DBUtils {

    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        JDBCConfig config = DBUtils.class.getAnnotation(JDBCConfig.class);
        String ip = config.ip();
        int port = config.port();
        String database = config.database();
        String encoding = config.encoding();
        String loginName = config.loginName();
        String password = config.password();

        String url = String.format("jdbc:mysql://%s:%d/%s?characterEncoding=%s", ip, port, database, encoding);
        return DriverManager.getConnection(url, loginName, password);
    }
    public static void main(String[] args) throws SQLException,NoSuchMethodException, SecurityException {
        Connection c = getConnection();
        System.out.println(getConnection());
    }
}
