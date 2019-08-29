package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Ccertificatestatus;
import com.newer.ksgl.model.pojo.Certificate;
import com.newer.ksgl.model.pojo.Usercertificate;
import com.newer.ksgl.model.pojo.pojopage.UsercertificatePage;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UsercertificatePageMapper {
    @Select("select * from Usercertificate where name = #{name}")
    @Results({
            @Result(property = "ucid", column = "ucid"),
            @Result(property ="certificate",column="cid",one = @One(select = "com.newer.ksgl.model.mapper.CertificateMapper.getCertificate")),
            @Result(property = "ccertificatestatus",column = "csid",one = @One(select = "com.newer.ksgl.model.mapper.CcertificatestatusMapper.findById")),
            @Result(property = "name",column = "name")
    })
    List<UsercertificatePage> selectAll(@Param("name")String name);
    @Insert("insert into usercertificate(cid,csid,`Name`) values(#{cid},#{csid},#{name})")
    Integer insert(Usercertificate usercertificate);
}
