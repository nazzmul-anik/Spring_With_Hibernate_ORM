package org.anik.dao;

import org.anik.entites.Student;
import org.hibernate.Hibernate;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {
    private HibernateTemplate hibernateTemplate;
    public int insertObject(Student student){
        int result = (int) this.hibernateTemplate.save(student);
        return result;
    }
}
