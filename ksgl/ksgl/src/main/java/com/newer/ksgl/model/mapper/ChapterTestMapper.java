package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Chaptertest;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ChapterTestMapper {
    //查询所有
    @Select("select * from ChapterTest")
    public List<Chaptertest> findAll();

    //根据id查询
    @Select("select * from chapterTest where ctid = #{id}")
    public Chaptertest getChapterTestById(Long id);

    //添加数据
    @Insert("insert into chaptertest(catalog,sid) values(#{catalog},#{sid})")
    public void add(Chaptertest chaptertest);

    //通过id修改数据
    @Update("update chaptertest set catalog=#{catalog},sid=#{sid} where ctid=#{ctid}")
    public void updateById(Chaptertest chaptertest);

    //根据id删除
    @Delete("delete from chaptertest where ctid=#{id}")
    public void deleteById(Long id);
}
