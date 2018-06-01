package priv.bluerhino.java.playground.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import priv.bluerhino.java.playground.mybatis.dao.UserMapper;
import priv.bluerhino.java.playground.mybatis.model.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("niekl");
        user.setPassword("123456");
        user.setEmail("123@123.com");
        user.setCreateTime(new Date());
        userMapper.insert(user);
        sqlSession.commit();
        sqlSession.close();
    }
}
