package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.Privacy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PrivacyService {

    /**
     * 添加隐私
     * @param privacy 隐私类
     * @return Integer
     * */
    Integer insert(Privacy privacy);

    /**
     * 删除隐私
     * @param pri_id 隐私id
     * @return Integer
     * */
    Integer deleteById(Integer pri_id);

    /**
     * 修改隐私
     * @param privacy 隐私类
     * @return Integer
     * */
    Integer update(Privacy privacy);

    /**
     * 查询所有隐私
     * @return List<Privacy>
     * */
    List<Privacy> findAll();

    /**
     * 查询个人隐私
     * @param pri_id 隐私id
     * @return Privacy
     * */
    Privacy selectById(Integer pri_id);

}
