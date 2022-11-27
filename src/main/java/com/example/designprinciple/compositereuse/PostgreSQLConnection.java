package com.example.designprinciple.compositereuse;

public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL连接";
    }
}
