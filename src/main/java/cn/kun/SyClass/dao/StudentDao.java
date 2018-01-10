package cn.kun.SyClass.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<StudentDao,Long> {

    StudentDao findByNameAndPassword(String name, String password);

    StudentDao findByName(String name);
}
