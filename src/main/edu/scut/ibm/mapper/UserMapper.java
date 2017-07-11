package edu.scut.ibm.mapper;

import edu.scut.ibm.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Created by limin on 2017/7/10.
 */
public interface UserMapper {
    @Select("SELECT * FROM user WHERE id = #{id}")
    List<User> selectUserById(@Param("id") Integer id);
}
