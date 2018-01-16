package cn.kun.SyClass.service.serviceImpl;

import cn.kun.SyClass.Constant.RoleConstant;
import cn.kun.SyClass.Reposiroty.UserRepository;
import cn.kun.SyClass.model.User;
import cn.kun.SyClass.service.StudentService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j
public class StudentServiceImpl implements StudentService{

//    @Autowired
//    private void setStudentDao() {
//        setStudentDao();
//    }

    @Autowired
    private UserRepository studentDao;


    @Override
    public User getStudentByName(String name) {
        return studentDao.findByName(name);
    }

    @Override
    public boolean insert(User student) {
        String name = student.getName();
        if (exit(name))
            return false;
//        student.setRole(RoleConstant.ROLE_USER);
        studentDao.save(student);
        return true;
    }

    public boolean exit(String name) {
        User student = studentDao.findByName(name);
        return (student!=null);

    }
}
