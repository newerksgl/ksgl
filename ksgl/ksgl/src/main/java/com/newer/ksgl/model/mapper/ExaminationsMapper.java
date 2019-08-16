package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Examinations;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ExaminationsMapper extends ExaminationsMapperImpl {
    //查询所有
    @Select("select * from examinations")
    public List<Examinations> findAll();

    //根据id查询数据
    @Select("select * from examinations where id=#{id}")
    public Examinations findById(Long id);

    //添加数据
    @Insert("insert into examinations(sid,reid,number,stateTest,name) values(#{sid},#{reid},#{number},#{statetest},#{name})")
    public void add(Examinations e);

    //通过id修改数据
    @Update("update examinations set sid=#{sid},reid=#{reid},number=#{number},statetest=#{statetest},name=#{name} where id=#{id}")
    public void update(Examinations e);

    //根据id删除数据
    @Delete("delete from examinations where id = #{id}")
    public void del(Long id);
}
