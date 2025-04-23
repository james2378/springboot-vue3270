package com.dao;

import com.entity.WenzhangMuluCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WenzhangMuluCollectionView;

/**
 * 文章目录收藏 Dao 接口
 *
 * @author 
 */
public interface WenzhangMuluCollectionDao extends BaseMapper<WenzhangMuluCollectionEntity> {

   List<WenzhangMuluCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
