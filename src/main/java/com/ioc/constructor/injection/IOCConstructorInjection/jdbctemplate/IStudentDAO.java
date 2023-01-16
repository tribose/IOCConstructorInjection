package com.ioc.constructor.injection.IOCConstructorInjection.jdbctemplate;

import javax.sql.DataSource;
import java.util.List;

public interface IStudentDAO {
    public void setDataSource(DataSource dataSource);

    public List<Student> getStudents();
}
