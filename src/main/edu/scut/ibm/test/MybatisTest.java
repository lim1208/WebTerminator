package edu.scut.ibm.test;

import edu.scut.ibm.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by limin on 2017/7/9.
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User("limin", 26, "武汉");
        sqlSession.insert("edu.scut.ibm.mapper.UserMapper.save", user);
        sqlSession.commit();
        sqlSession.close();
    }
}
