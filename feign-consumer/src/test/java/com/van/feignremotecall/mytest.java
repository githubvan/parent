package com.van.feignremotecall;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class mytest {
    String driver = "oracle.jdbc.driver.OracleDriver";
    //String url = "jdbc:oracle:thin:@192.168.79.10:1521:orcl";
    String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    String username = "fbz";
    String password = "1624";

    @Test
    public void contextLoads() throws  Exception {
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT  * from  emp where empno=?");
        preparedStatement.setObject(1,7788);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            String ename = resultSet.getString("ename");
            System.out.println(ename);
        }
        connection.close();
        preparedStatement.close();
        resultSet.close();

    }

    @Test
    public void  tst(){
        try {
            int i =1/0;
        } catch (Exception e) {
            throw new RuntimeException("111");
        }finally {
            System.out.println(222);
        }


    }

}
