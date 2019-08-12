package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户操作封装类
 * @author 谢涛
 * */
@Service
public interface UsersService {

    /**
     * 添加用户
     * @author 谢涛
     * @param users 用户类
     * @return Integer
     * */
    Integer insert(Users users);

    /**
     * 删除用户
     * @author 谢涛
     * @param pri_Id 隐私id
     * @return Integer
     * */
    Integer deleteById(Integer pri_Id);

    /**
     * 修改用户
     * @author 谢涛
     * @param users 用户类
     * @return Integer
     * */
    Integer update(Users users);

    /**
     * 修改用户密码
     * @author 谢涛
     * @param pri_Id 隐私id
     * @param password 密码
     * @return Integer
     * */
    Integer upPass(Integer pri_Id,String password);

    /**
     * 用户名是否存在
     * @author 谢涛
     * @param name 用户名
     * @return Integer
     * */
    Integer selectByName(String name);

    /**
     * 查询所有用户
     * @author 谢涛
     * @return List<Users>
     * */
    List<Users> findAll();

    /**
     * 查询用户表数据
     * @author 谢涛
     * @return Integer
     * */
    Integer selectCount();

    /**
     * 用户登录
     * @author 谢涛
     * @param name 用户名
     * @param password 密码
     * @return Users
     * */
    Users login(String name,String password);

    /**
     * 分页查询用户表
     * @author 谢涛
     * @param pageNo 页码
     * @param pageSize 展示数量
     * @return List<Users>
     * */
    List<Users> pagingFindAll(Integer pageNo,Integer pageSize);

}
