package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Certificate;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CertificateMapperImpl {
    @Select("select * from certificate where cid not in (select cid from usercertificate where name = #{name})")
    public List<Certificate> selectByName(String name);
}
