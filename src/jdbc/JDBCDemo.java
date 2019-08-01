package jdbc;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Java1July","root","melayer1");
        //Statement stmt=con.createStatement();

        PreparedStatement statement=con.prepareStatement("insert into students values(?,?,?,?)");
        statement.setInt(1,3);
        statement.setString(2,"sujit");
        statement.setString(3,"nagpur");
        statement.setLong(4,7894561230L);
        statement.executeUpdate();
        ResultSet rs=statement.executeQuery("select * from students");

        while(rs.next())
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+
                    " "+rs.getLong(4));
        con.close();

    }

}
