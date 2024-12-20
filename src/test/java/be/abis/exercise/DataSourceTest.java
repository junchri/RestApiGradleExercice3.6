package be.abis.exercise;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
public class DataSourceTest {
    @Autowired
    DataSource dataSource;

    @Test
    public void testConnectionDataSource() {
        try {
            Connection c = dataSource.getConnection();
            System.out.println("Connection ok");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
