package com.ioc.constructor.injection.IOCConstructorInjection.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class StudentDAO implements IStudentDAO {

    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Student> getStudents() {
        String sql = "Select * from student s where s.age > ?";

        return jdbcTemplate.query(sql,
                ps -> ps.setInt(1, 15),
                new StudentMapper());
    }
}
