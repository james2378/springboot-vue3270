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
 * 文章目录
 *
 * @author 
 * @email
 */
@TableName("wenzhang_mulu")
public class WenzhangMuluEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public WenzhangMuluEntity() {

	}

	public WenzhangMuluEntity(T t) {
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
     * 文章
     */
    @TableField(value = "wenzhang_id")

    private Integer wenzhangId;


    /**
     * 文章目录名称
     */
    @TableField(value = "wenzhang_mulu_name")

    private String wenzhangMuluName;


    /**
     * 文章目录照片
     */
    @TableField(value = "wenzhang_mulu_photo")

    private String wenzhangMuluPhoto;


    /**
     * 内容
     */
    @TableField(value = "wenzhang_mulu_content")

    private String wenzhangMuluContent;


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
	 * 设置：文章
	 */
    public Integer getWenzhangId() {
        return wenzhangId;
    }
    /**
	 * 获取：文章
	 */

    public void setWenzhangId(Integer wenzhangId) {
        this.wenzhangId = wenzhangId;
    }
    /**
	 * 设置：文章目录名称
	 */
    public String getWenzhangMuluName() {
        return wenzhangMuluName;
    }
    /**
	 * 获取：文章目录名称
	 */

    public void setWenzhangMuluName(String wenzhangMuluName) {
        this.wenzhangMuluName = wenzhangMuluName;
    }
    /**
	 * 设置：文章目录照片
	 */
    public String getWenzhangMuluPhoto() {
        return wenzhangMuluPhoto;
    }
    /**
	 * 获取：文章目录照片
	 */

    public void setWenzhangMuluPhoto(String wenzhangMuluPhoto) {
        this.wenzhangMuluPhoto = wenzhangMuluPhoto;
    }
    /**
	 * 设置：内容
	 */
    public String getWenzhangMuluContent() {
        return wenzhangMuluContent;
    }
    /**
	 * 获取：内容
	 */

    public void setWenzhangMuluContent(String wenzhangMuluContent) {
        this.wenzhangMuluContent = wenzhangMuluContent;
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
        return "WenzhangMulu{" +
            "id=" + id +
            ", wenzhangId=" + wenzhangId +
            ", wenzhangMuluName=" + wenzhangMuluName +
            ", wenzhangMuluPhoto=" + wenzhangMuluPhoto +
            ", wenzhangMuluContent=" + wenzhangMuluContent +
            ", createTime=" + createTime +
        "}";
    }
}
