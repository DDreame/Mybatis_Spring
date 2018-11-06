import mapper.StudentMapper;
import mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.Student;
import pojo.User;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")

public class UserDaoImplTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StudentMapper studentMapper;



    @Test
    public void testList() {
        System.out.println(userMapper);
        try {
            User cs=userMapper.findUserById(1);
            Student stu = studentMapper.findStudentById(5);
            System.out.println(cs.getId()+":"+cs.getUsername());
            System.out.println(stu.getId()+":"+stu.getNick_name());
//            for (Student s : stu
//                 ) {
//                System.out.println(s.getId()+":"+s.getNick_name());
//            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}