package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Recycle;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RecycleMapper {

    // 查询所有
    @Select("select * from Recycle")
    public List<Recycle> findAll();

    // 根据ID查询
    @Select("select * from Recycle where rid = #{rid}")
    public Recycle findById(Long rid);

    // 添加数据
    @Insert("insert into recycle(type, content, name, time, diffculty) value(#{type}, #{content}, #{name},sysdate(), #{diffculty})")
    public void add(Recycle recycle);

    // 通过ID修改数据
    @Update("update recycle set type=#{type}, content=#{content}, name=#{name}, time=#{time}, diffculty=#{diffculty}")
    public void update(Recycle recycle);

    // 根据ID删除
    @Delete("delete from recycle where rid=#{id}")
    public void deleteById(Long id);

}
