package edu.scut.ibm.dao.provider;

import edu.scut.ibm.domain.User;
import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

import static edu.scut.ibm.util.common.SysConstants.USERTABLE;
/**
 * Created by limin on 2017/7/24.
 */
public class UserDynaSqlProvider {
    public String count(final Map<String,Object> params) {
        return new SQL(){
            {
                SELECT("*");
                FROM(USERTABLE);
                if (params.get("user") != null) {
                    User user = (User) params.get("user");
                    if (user.getUsername() != null && !user.getUsername().equals("")){
                        WHERE(" username LIKE CONCAT ('%', #{user.username}, '%') ");
                    }

                    if (user.getStatus() != null && !user.getStatus().equals("")){
                        WHERE(" status LIKE CONCAT ('%', #{user.status}, '%') ");
                    }
                }
            }
        }.toString();
    }

    public String insertUser(final User user){
        return new SQL(){
            {
                INSERT_INTO(USERTABLE);
                if (user.getUsername() != null && !user.getUsername().equals("")) {
                    VALUES("username", "#{username}");
                }

                if (user.getLoginname() != null && !user.getLoginname().equals("")) {
                    VALUES("loginname", "#{loginname}");
                }

                if (user.getPassword() != null && !user.getPassword().equals("")) {
                    VALUES("userpassword", "#{password}");
                }

                if (user.getStatus() != null && !user.getStatus().equals("")) {
                    VALUES("status", "#{status}");
                }
            }
        }.toString();
    }

    //动态更新
    public String updateUser(final User user){
        return new SQL(){
            {
                UPDATE(USERTABLE);
                if (user.getUsername() != null) {
                    SET(" username = #{username} ");
                }

                if (user.getLoginname() != null) {
                    SET(" loginname = #{loginname} ");
                }

                if (user.getPassword() != null) {
                    SET(" userpassword = #{password} ");
                }

                if (user.getStatus() != null) {
                    SET(" status = #{status}");
                }

                if (user.getCreateDate() != null) {
                    SET(" createDate = #{createDate}");
                }

                WHERE(" id = #{id} ");
            }
        }.toString();
    }
}
