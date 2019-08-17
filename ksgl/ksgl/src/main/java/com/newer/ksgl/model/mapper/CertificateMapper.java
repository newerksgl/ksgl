package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Certificate;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CertificateMapper {

    //查询所有
    @Select("select * from Certificate")
    public List<Certificate> findAll();

    //通过id查询
    @Select("select * from Certificate where csid = #{id} ")
    public Certificate findById(Long id);

    //分页多样查询
    @Select("<script>" + "select * from certificate where 1=1 " +
            "<if test='c.thumbnail!=null'> and thumbnail like #{e.thumbnail}</if> " +
            "<if test='c.title!=null'>and title like #{c.title}</if> " +
            "<if test='c.price!=null'>and price like #{c.price}</if>" +
            "<if test='c.addtime!=null'>and addtime like #{c.addtime}</if>" +
            "<if test='c.brief!=null'>and brief like #{c.brief}</if>" +
            "limit #{row},#{pageSize}</script>")
    public List<Certificate> find(@Param("c") Certificate cert, @Param("row") Integer row, @Param("pageSize") Integer pageSize);

    //查询总数据行数
    @Select("<script>" + "select count(*) from certificate where 1=1 " +
            "<if test='c.thumbnail!=null'> and thumbnail like #{e.thumbnail}</if> " +
            "<if test='c.title!=null'>and title like #{c.title}</if> " +
            "<if test='c.price!=null'>and price like #{c.price}</if>" +
            "<if test='c.addtime!=null'>and addtime like #{c.addtime}</if>" +
            "<if test='c.brief!=null'>and brief like #{c.brief}</if>" +
            "limit #{row},#{pageSize}</script>")
    public Integer findRowCount(@Param("c") Certificate cert);

    //添加数据
    @Insert("insert into Certificate(thumnail,title,price,addtime,brief) values(#{thumnail},#{title},#{price},#{addtime},#{brief})")
    public Integer add(Certificate cert);

    //通过id修改
    @Update("update Certificate set thumbnail=#{thumnail},title=#{title},price=#{price},addtime=#{addtime},brief=#{brief} where CID = #{cid}")
    public Integer updateById(Certificate cert);

    //通过id删除
    @Delete("delete from Certificate where CID = #{id}")
    public Integer deleteById(@Param("id") Long id);

}
