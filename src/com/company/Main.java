package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Connection conn = null;
              try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("数据库驱动加载成功");
        }catch (Exception e){
            System.out.println("数据库驱动加载失败");
        }

        try {
            DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "C##ROOT", "FREEDOM");
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }



        /**

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");
        }catch (Exception e){

        }

        try {
            DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "FREEDOM");
            System.out.println("数据库连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
         *
         */


    }
}
