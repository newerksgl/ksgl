package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Ccertificatestatus;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CcertificateStatusMapper {

    //查询所有
    @Select("select * from ccertificatestatus")
    public List<Ccertificatestatus> findAll();

    //通过id查询
    @Select("select * from Ccertificatestatus where csid = #{id} ")
    public Ccertificatestatus findById(Long id);

    //添加数据
    @Insert("insert into Ccertificatestatus(Status) values(#{status})")
    public Integer add(Ccertificatestatus ccer);

    //通过id修改数据
    @Update("update Ccertificatestatus set Status = #{status} where csid = #{csid} ")
    public Integer updateById(Ccertificatestatus ccer);

    //通过id删除数据
    @Delete("delete Ccertificatestatus where csid = #{csid} ")
    public Integer delete(Long csid);

}
