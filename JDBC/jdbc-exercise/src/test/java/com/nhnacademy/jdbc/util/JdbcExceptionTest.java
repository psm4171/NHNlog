package com.nhnacademy.jdbc.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Slf4j
public class JdbcExceptionTest {
    static Connection connection;
    @BeforeAll
    static void setUp(){
        connection = DbUtils.getConnection();
    }

    @Test
    @DisplayName("sqlExceptionTest")
    void insert_trhow_sqlException(){

        String sql = "insert into jdbc_students (student_id,student_name,gender,age) values(100,'마르코','M','39')";

        SQLException sqlException = Assertions.assertThrows(SQLException.class,()->{
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
        });

        log.info("errorCode:{}",sqlException.getErrorCode());
        log.info("message:{}",sqlException.getMessage());
        log.info("sqlState:{}",sqlException.getSQLState());
    }

    @AfterAll
    static void release(){

        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
