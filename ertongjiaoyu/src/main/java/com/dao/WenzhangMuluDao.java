package com.dao;

import com.entity.WenzhangMuluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.WenzhangMuluView;

/**
 * 文章目录 Dao 接口
 *
 * @author 
 */
public interface WenzhangMuluDao extends BaseMapper<WenzhangMuluEntity> {

   List<WenzhangMuluView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
