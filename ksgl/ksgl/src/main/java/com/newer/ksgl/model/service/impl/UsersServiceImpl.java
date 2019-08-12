package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.UsersMapper;
import com.newer.ksgl.model.pojo.Users;
import com.newer.ksgl.model.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户操作封装实现类
 *
 * @author 谢涛
 */
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper mapper;

    @Override
    public Integer insert(Users users) {
        return mapper.insert(users);
    }

    @Override
    public Integer deleteById(Integer pri_Id) {
        return mapper.deleteById(pri_Id);
    }

    @Override
    public Integer update(Users users) {
        return mapper.update(users);
    }

    @Override
    public Integer upPass(Integer pri_Id, String password) {
        return mapper.upPass(pri_Id,password);
    }

    @Override
    public Integer selectByName(String name) {
        return mapper.selectByName(name);
    }

    @Override
    public List<Users> findAll() {
        return mapper.findAll();
    }

    @Override
    public Integer selectCount() {
        return mapper.selectCount();
    }

    @Override
    public Users login(String name, String password) {
        return mapper.login(name, password);
    }

    @Override
    public List<Users> pagingFindAll(Integer pageNo, Integer pageSize) {
        // 开始行号:(页码-1)*大小+1
        int start = (pageNo - 1) * pageSize;
        // 结束行号:页码*大小
        int end = pageNo * pageSize;
        return mapper.pagingFindAll(start, end);
    }
}
