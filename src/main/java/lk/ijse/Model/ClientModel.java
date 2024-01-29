package lk.ijse.Model;

import com.mysql.cj.Session;
import lk.ijse.Db.DbConnection;
import lk.ijse.Server.ClientTo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientModel {
    public static boolean save(ClientTo client) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String sql = "INSERT INTO Client VALUES (?, ?)";
        PreparedStatement pstm = connection.prepareStatement(sql);

        pstm.setString(1, client.getUserName());
        pstm.setString(2, client.getPassword());

        int rowsAffected = pstm.executeUpdate();
        return rowsAffected > 0;
    }

//    public ClientTo getAll() throws SQLException {
//        Connection connection = DbConnection.getInstance().getConnection ();
//
//        String sql = "SELECT * FROM Client";
//        PreparedStatement pstm = connection.prepareStatement(sql);
//
//        ResultSet resultSet = pstm.executeQuery();
//
//        ClientTo clientTo = null;
//
//        if(resultSet.next()) {
//            String username = resultSet.getString(1);
//            String password = resultSet.getString(2);
//
//            clientTo = new ClientTo(username,password);
//        }
//        return clientTo;
//    }
}
