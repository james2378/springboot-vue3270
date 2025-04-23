package com.entity.vo;

import com.entity.WenzhangMuluEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 文章目录
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("wenzhang_mulu")
public class WenzhangMuluVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
