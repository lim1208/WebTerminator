package edu.scut.ibm.dao;

import edu.scut.ibm.dao.provider.UserDynaSqlProvider;
import edu.scut.ibm.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.Map;

import static edu.scut.ibm.util.common.SysConstants.USERTABLE;

/**
 * Created by limin on 2017/7/24.
 */
public interface UserDao {
    @Select("SELECT * FROM " + USERTABLE + " WHERE loginname = #{loginname} AND password = #{password}")
    User selectByLoginnameAndPassword(@Param("loginname") String loginname, @Param("password") String password);

    @Select("SELECT * FROM " + USERTABLE + " WHERE id = #{id}")
    User selectById(Integer id);

    @Delete("SELECT FROM " + USERTABLE + " WHERE id = #{id}")
    void deleteById(Integer id);

    @UpdateProvider(type = UserDynaSqlProvider.class, method = "updateUser")
    void update(User user);

    @SelectProvider(type = UserDynaSqlProvider.class, method = "count")
    Integer count(Map<String, Object> params);

    @SelectProvider(type = UserDynaSqlProvider.class, method = "insertUser")
    void save(User user);

}
