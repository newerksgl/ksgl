package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Ccertificatestatus;
import com.newer.ksgl.model.pojo.Certificate;
import com.newer.ksgl.model.pojo.pojopage.UsercertificatePage;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UsercertificatePageMapper {
    @Select("select * from Usercertificate")
    @Results({
            @Result(property = "ucid", column = "ucid"),
            @Result(property ="certificate",column="cid",one = @One(select = "com.newer.ksgl.model.mapper.UsercertificatePageMapper.getCertificate")),
            @Result(property = "ccertificatestatus",column = "csid",one = @One(select = "com.newer.ksgl.model.mapper.UsercertificatePageMapper.getCertificatestatus")),
            @Result(property = "name",column = "name")
    })
    UsercertificatePage selectAll();
    @Select("select * from Certificate where cid = #{cid}")
    Certificate getCertificate(@Param("cid") long cid);
    @Select("select * from Ccertificatestatus where csid = #{csid}")
    Ccertificatestatus getCertificatestatus(@Param("csid") long csid);
}
