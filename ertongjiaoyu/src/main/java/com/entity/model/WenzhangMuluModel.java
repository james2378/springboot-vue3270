package com.entity.model;

import com.entity.WenzhangMuluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 文章目录
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class WenzhangMuluModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 文章
     */
    private Integer wenzhangId;


    /**
     * 文章目录名称
     */
    private String wenzhangMuluName;


    /**
     * 文章目录照片
     */
    private String wenzhangMuluPhoto;


    /**
     * 内容
     */
    private String wenzhangMuluContent;


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
	 * 获取：文章
	 */
    public Integer getWenzhangId() {
        return wenzhangId;
    }


    /**
	 * 设置：文章
	 */
    public void setWenzhangId(Integer wenzhangId) {
        this.wenzhangId = wenzhangId;
    }
    /**
	 * 获取：文章目录名称
	 */
    public String getWenzhangMuluName() {
        return wenzhangMuluName;
    }


    /**
	 * 设置：文章目录名称
	 */
    public void setWenzhangMuluName(String wenzhangMuluName) {
        this.wenzhangMuluName = wenzhangMuluName;
    }
    /**
	 * 获取：文章目录照片
	 */
    public String getWenzhangMuluPhoto() {
        return wenzhangMuluPhoto;
    }


    /**
	 * 设置：文章目录照片
	 */
    public void setWenzhangMuluPhoto(String wenzhangMuluPhoto) {
        this.wenzhangMuluPhoto = wenzhangMuluPhoto;
    }
    /**
	 * 获取：内容
	 */
    public String getWenzhangMuluContent() {
        return wenzhangMuluContent;
    }


    /**
	 * 设置：内容
	 */
    public void setWenzhangMuluContent(String wenzhangMuluContent) {
        this.wenzhangMuluContent = wenzhangMuluContent;
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
