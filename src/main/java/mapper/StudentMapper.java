package mapper;

import pojo.Student;
import pojo.StudentCustom;
import pojo.StudentQueryVo;

import java.util.List;

public interface StudentMapper {


    //根据Id查询用户信息
    public Student findStudentById(int id) throws Exception;

    //添加用户信息
    public void insertStudent(Student student) throws Exception;

    //更新用户信息
    public void updataStudent(Student student) throws  Exception;

    //根据姓名查找用户
    public List<Student> findStudentByNick_Name(String nick_name) throws Exception;


    //用户信息综合查询
    public List<StudentCustom> findStudentList(StudentQueryVo StudentQueryVo) throws Exception;

    //用户总数查询
    public List<StudentCustom> findUserCount(StudentQueryVo StudentQueryVo) throws Exception;
}
