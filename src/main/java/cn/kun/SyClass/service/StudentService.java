package cn.kun.SyClass.service;

import cn.kun.SyClass.model.User;

public interface StudentService {
    User getStudentByName(String name);

    boolean insert(User student);

}
