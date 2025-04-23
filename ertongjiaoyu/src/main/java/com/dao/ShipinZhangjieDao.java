package com.dao;

import com.entity.ShipinZhangjieEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinZhangjieView;

/**
 * 章节 Dao 接口
 *
 * @author 
 */
public interface ShipinZhangjieDao extends BaseMapper<ShipinZhangjieEntity> {

   List<ShipinZhangjieView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
