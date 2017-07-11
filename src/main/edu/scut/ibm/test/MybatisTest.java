package edu.scut.ibm.test;

import edu.scut.ibm.bean.User;
import edu.scut.ibm.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by limin on 2017/7/9.
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        User user = new User("limin", 26, "wuhan");
//        sqlSession.insert("edu.scut.ibm.mapper.UserMapper.saveUser", user);

//        User user = sqlSession.selectOne("edu.scut.ibm.mapper.UserMapper.selectUser", 1);
//        System.out.println(user.getAddress());
//        List<User> lists = sqlSession.selectList("edu.scut.ibm.mapper.UserMapper.selectAllUser");
//        for(User user : lists){
//            System.out.println(user);
//        }
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        Map<String,Object> params = new HashMap<String, Object>();
//        params.put("id", 1);
        List<User> users  = userMapper.selectUserById(5);
        for(User user : users){
            System.out.println(user);
        }
//
//        user.setAge(50);
//        sqlSession.update("edu.scut.ibm.mapper.UserMapper.modifyUser", user);
//        sqlSession.delete("edu.scut.ibm.mapper.UserMapper.deleteUser", 6);
        sqlSession.commit();
        sqlSession.close();
    }
}
