package com.entity.vo;

import com.entity.ShipinZhangjieEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 章节
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shipin_zhangjie")
public class ShipinZhangjieVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 视频
     */

    @TableField(value = "shipin_id")
    private Integer shipinId;


    /**
     * 章节名称
     */

    @TableField(value = "shipin_zhangjie_name")
    private String shipinZhangjieName;


    /**
     * 章节照片
     */

    @TableField(value = "shipin_zhangjie_photo")
    private String shipinZhangjiePhoto;


    /**
     * 章节视频
     */

    @TableField(value = "shipin_zhangjie_video")
    private String shipinZhangjieVideo;


    /**
     * 章节介绍
     */

    @TableField(value = "shipin_zhangjie_content")
    private String shipinZhangjieContent;


    /**
     * 创建时间 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：视频
	 */
    public Integer getShipinId() {
        return shipinId;
    }


    /**
	 * 获取：视频
	 */

    public void setShipinId(Integer shipinId) {
        this.shipinId = shipinId;
    }
    /**
	 * 设置：章节名称
	 */
    public String getShipinZhangjieName() {
        return shipinZhangjieName;
    }


    /**
	 * 获取：章节名称
	 */

    public void setShipinZhangjieName(String shipinZhangjieName) {
        this.shipinZhangjieName = shipinZhangjieName;
    }
    /**
	 * 设置：章节照片
	 */
    public String getShipinZhangjiePhoto() {
        return shipinZhangjiePhoto;
    }


    /**
	 * 获取：章节照片
	 */

    public void setShipinZhangjiePhoto(String shipinZhangjiePhoto) {
        this.shipinZhangjiePhoto = shipinZhangjiePhoto;
    }
    /**
	 * 设置：章节视频
	 */
    public String getShipinZhangjieVideo() {
        return shipinZhangjieVideo;
    }


    /**
	 * 获取：章节视频
	 */

    public void setShipinZhangjieVideo(String shipinZhangjieVideo) {
        this.shipinZhangjieVideo = shipinZhangjieVideo;
    }
    /**
	 * 设置：章节介绍
	 */
    public String getShipinZhangjieContent() {
        return shipinZhangjieContent;
    }


    /**
	 * 获取：章节介绍
	 */

    public void setShipinZhangjieContent(String shipinZhangjieContent) {
        this.shipinZhangjieContent = shipinZhangjieContent;
    }
    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
