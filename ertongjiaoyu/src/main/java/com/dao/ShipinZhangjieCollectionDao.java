package com.dao;

import com.entity.ShipinZhangjieCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShipinZhangjieCollectionView;

/**
 * 章节收藏 Dao 接口
 *
 * @author 
 */
public interface ShipinZhangjieCollectionDao extends BaseMapper<ShipinZhangjieCollectionEntity> {

   List<ShipinZhangjieCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
