package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 章节
 *
 * @author 
 * @email
 */
@TableName("shipin_zhangjie")
public class ShipinZhangjieEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShipinZhangjieEntity() {

	}

	public ShipinZhangjieEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
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
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ShipinZhangjie{" +
            "id=" + id +
            ", shipinId=" + shipinId +
            ", shipinZhangjieName=" + shipinZhangjieName +
            ", shipinZhangjiePhoto=" + shipinZhangjiePhoto +
            ", shipinZhangjieVideo=" + shipinZhangjieVideo +
            ", shipinZhangjieContent=" + shipinZhangjieContent +
            ", createTime=" + createTime +
        "}";
    }
}
