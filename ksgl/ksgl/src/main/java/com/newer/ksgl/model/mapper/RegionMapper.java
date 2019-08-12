package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Region;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RegionMapper {
    //查询所有
    @Select("select * from Region")
    public List<Region> findAll();

    //根据id查询
    @Select("select * from Region where reid=#{reid}")
    public Region findById(Long reid);

    //添加数据
    @Insert("insert into region(name,areacode) values(#{name},#{areacode})")
    public void add(Region region);

    //通过id修改数据
    @Update("update region set name=#{name},areacode=#{areacode} where reid=#{reid}")
    public void updateById(Region region);

    //根据id删除
    @Delete("delete from region where reid=#{id}")
    public void deleteById(Long id);
}
