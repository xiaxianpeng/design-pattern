package com.example.designprinciple.compositereuse;

public class MySQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "MySQL连接";
    }
}
