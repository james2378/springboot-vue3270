package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShipinZhangjieEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 章节 服务类
 */
public interface ShipinZhangjieService extends IService<ShipinZhangjieEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}