package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class dbUtils {
    public Connection con;

    dbUtils() {
        //直接过数据库clickhouse
        String driver = "ru.yandex.clickhouse.ClickHouseDriver";
        String url = "jdbc:clickhouse://10.125.193.221:19701/rum_log";
        String user = "bonree";
        String password = "Ay%0b2!";

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed()) {
                System.out.println("Open DB Connection success");
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        dbUtils c = new dbUtils();
        c.DBQuery("select * from burypoint_info");
        System.exit(0);
    }

    void DBExecute(String sqlStr) {
        try {
            Statement statement = con.createStatement();
            boolean result = statement.execute(sqlStr);
            System.out.println("+++++ execute sql: "+sqlStr);
            statement.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }

    void DBQuery(String sqlStr)  {
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sqlStr);

            int columnCount = rs.getMetaData().getColumnCount();
            while(rs.next()){
                String result = "";
                for (int i=0; i<columnCount; i++) {
                    result += "\t" + rs.getString(i+1);
                }
                System.out.println(result);
            }
            rs.close();
            statement.close();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}