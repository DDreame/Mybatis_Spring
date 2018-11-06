package mapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.User;


//用户管理的Dao接口
public interface UserMapper {

    //根据Id查询用户信息
    public User findUserById(int id) throws Exception;
}