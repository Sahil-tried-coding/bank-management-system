package Bank.system;

import java.sql.*;

public class Conn {
    Connection connection;
    Statement statements;
    public Conn(){
        try{
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","Sahilharshada@1117~()~");
        statements = connection.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
