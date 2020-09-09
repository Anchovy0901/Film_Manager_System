package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * clone 工具类
 */
public class CloneUtils {

    public static void clones(PreparedStatement preparedStatement, Connection connection){
        try {
            if(preparedStatement != null){
                preparedStatement.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            if(connection != null){
                connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
