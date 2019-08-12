package com.newer.ksgl.model.mapper;

import org.apache.ibatis.annotations.*;
import com.newer.ksgl.model.pojo.Users;

import java.util.List;

/**
 * 用户操作类
 * @author 谢涛
 * */
@Mapper
public interface UsersMapper {

    /**
     * 添加用户
     * @author 谢涛
     * @param users 用户类
     * @return Integer
     * */
    @Insert("insert into users values(#{name},#{email},#{users_ip},#{integral},#{register},#{password},#{rid},null)")
    Integer insert(Users users);

    /**
     * 删除用户
     * @author 谢涛
     * @param pri_id 隐私id
     * @return Integer
     * */
    @Delete("delete from Users where pri_Id=#{pri_id}")
    Integer deleteById(Integer pri_id);

    /**
     * 修改用户
     * @author 谢涛
     * @param users 用户类
     * @return Integer
     * */
    @Update("update Users set name=#{name},email=#{email},users_ip=#{users_ip},integral=#{integral},register=#{register},password=#{password},rid=#{rid} where pri_id=#{pri_id}")
    Integer update(Users users);

    /**
     * 修改用户密码
     * @author 谢涛
     * @param priId 隐私id
     * @param password 密码
     * @return Integer
     * */
    @Update("update Users set passWord=#{password} where pri_Id=#{pri_id}")
    Integer upPass(@Param("pri_Id") Integer priId,@Param("password") String password);

    /**
     * 查询所有用户
     * @author 谢涛
     * @return List<Users>
     * */
    @Select("select * from Users")
    List<Users> findAll();

    /**
     * 查询用户表数据
     * @author 谢涛
     * @return Integer
     * */
    @Select("select count(*) from Users")
    Integer selectCount();

    /**
     * 用户名是否存在
     * @author 谢涛
     * @param name 用户名
     * @return Integer
     * */
    @Select("select count(*) from Users where name=#{name}")
    Integer selectByName(String name);

    /**
     * 用户登录
     * @author 谢涛
     * @param name 用户名
     * @param password 密码
     * @return Users
     * */
    @Select("select * from Users where name=#{name} and password=#{password}")
    Users login(
        @Param("name") String name,
        @Param("password") String password
    );

    /**
     * 分页查询用户表
     * @author 谢涛
     * @param start 开始
     * @param end 结束
     * @return List<Users>
     * */
    @Select("select * from Users order by pri_id asc limit #{start},#{end}")
    List<Users> pagingFindAll(
        @Param("start") Integer start,
        @Param("end") Integer end
    );

}
