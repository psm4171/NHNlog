package com.nhnacademy.jdbc.util;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import java.sql.Connection;
import java.sql.SQLException;

@Slf4j
class DbUtilsTest {
    private static Connection connection = null;

    @BeforeAll
    static void setUp(){
        log.info("connection open()");
        connection = DbUtils.getConnection();
    }

    @Test
    @DisplayName("connected")
    void connectionTest(){
        Assertions.assertNotNull(connection);
    }

    @Test
    @DisplayName("mysql driver load : success")
    void mtsql_driverLoadTest(){
        try {
            Class<?> driver = Class.forName("com.mysql.cj.jdbc.Driver");
            log.info("driver:{}", driver.getName());
            Assertions.assertEquals(driver.getName(),com.mysql.cj.jdbc.Driver.class.getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("mariadb driver load :fail")
    void mariadb_driverLoadTest(){
        Assertions.assertThrows(ClassNotFoundException.class,()->{
            Class.forName("org.mariadb.jdbc.Driver");
        });
    }

    @AfterAll
    static void release() {
        log.info("connection close()");
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}