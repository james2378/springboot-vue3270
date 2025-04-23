package com.entity.model;

import com.entity.ShipinZhangjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 章节
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShipinZhangjieModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 视频
     */
    private Integer shipinId;


    /**
     * 章节名称
     */
    private String shipinZhangjieName;


    /**
     * 章节照片
     */
    private String shipinZhangjiePhoto;


    /**
     * 章节视频
     */
    private String shipinZhangjieVideo;


    /**
     * 章节介绍
     */
    private String shipinZhangjieContent;


    /**
     * 创建时间 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：视频
	 */
    public Integer getShipinId() {
        return shipinId;
    }


    /**
	 * 设置：视频
	 */
    public void setShipinId(Integer shipinId) {
        this.shipinId = shipinId;
    }
    /**
	 * 获取：章节名称
	 */
    public String getShipinZhangjieName() {
        return shipinZhangjieName;
    }


    /**
	 * 设置：章节名称
	 */
    public void setShipinZhangjieName(String shipinZhangjieName) {
        this.shipinZhangjieName = shipinZhangjieName;
    }
    /**
	 * 获取：章节照片
	 */
    public String getShipinZhangjiePhoto() {
        return shipinZhangjiePhoto;
    }


    /**
	 * 设置：章节照片
	 */
    public void setShipinZhangjiePhoto(String shipinZhangjiePhoto) {
        this.shipinZhangjiePhoto = shipinZhangjiePhoto;
    }
    /**
	 * 获取：章节视频
	 */
    public String getShipinZhangjieVideo() {
        return shipinZhangjieVideo;
    }


    /**
	 * 设置：章节视频
	 */
    public void setShipinZhangjieVideo(String shipinZhangjieVideo) {
        this.shipinZhangjieVideo = shipinZhangjieVideo;
    }
    /**
	 * 获取：章节介绍
	 */
    public String getShipinZhangjieContent() {
        return shipinZhangjieContent;
    }


    /**
	 * 设置：章节介绍
	 */
    public void setShipinZhangjieContent(String shipinZhangjieContent) {
        this.shipinZhangjieContent = shipinZhangjieContent;
    }
    /**
	 * 获取：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
