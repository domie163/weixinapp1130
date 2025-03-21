package com.dao;

import com.entity.LajixinxiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LajixinxiLiuyanView;

/**
 * 垃圾留言 Dao 接口
 *
 * @author 
 */
public interface LajixinxiLiuyanDao extends BaseMapper<LajixinxiLiuyanEntity> {

   List<LajixinxiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
