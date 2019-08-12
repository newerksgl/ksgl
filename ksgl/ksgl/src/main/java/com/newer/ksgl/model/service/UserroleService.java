package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.Userrole;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserroleService {

    /**
     * 添加角色方法
     * @param userrole 角色类
     * @return Integer
     * */
    Integer insert(Userrole userrole);

    /**
     * 删除角色方法
     * @param rid 角色id
     * @return Integer
     * */
    Integer deleteById(Integer rid);

    /**
     * 修改角色方法
     * @param userrole
     * @return Integer
     * */
    Integer update(Userrole userrole);

    /**
     * 查询所有角色方法
     * @return List<Userrole>
     * */
    List<Userrole> findAll();

    /**
     * 查询单个角色方法
     * @param rid 角色id
     * @return Userrole
     * */
    Userrole selectById(Integer rid);

}
