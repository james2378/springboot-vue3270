package com.entity.vo;

import com.entity.WenzhangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 文章
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("wenzhang")
public class WenzhangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 文章编号
     */

    @TableField(value = "wenzhang_uuid_number")
    private String wenzhangUuidNumber;


    /**
     * 文章名称
     */

    @TableField(value = "wenzhang_name")
    private String wenzhangName;


    /**
     * 文章照片
     */

    @TableField(value = "wenzhang_photo")
    private String wenzhangPhoto;


    /**
     * 文章类型
     */

    @TableField(value = "wenzhang_types")
    private Integer wenzhangTypes;


    /**
     * 赞
     */

    @TableField(value = "zan_number")
    private Integer zanNumber;


    /**
     * 踩
     */

    @TableField(value = "cai_number")
    private Integer caiNumber;


    /**
     * 是否vip文章
     */

    @TableField(value = "vipwenzhang_types")
    private Integer vipwenzhangTypes;


    /**
     * 适合年龄段
     */

    @TableField(value = "nianlingduan_types")
    private Integer nianlingduanTypes;


    /**
     * 文章介绍
     */

    @TableField(value = "wenzhang_content")
    private String wenzhangContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "wenzhang_delete")
    private Integer wenzhangDelete;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：文章编号
	 */
    public String getWenzhangUuidNumber() {
        return wenzhangUuidNumber;
    }


    /**
	 * 获取：文章编号
	 */

    public void setWenzhangUuidNumber(String wenzhangUuidNumber) {
        this.wenzhangUuidNumber = wenzhangUuidNumber;
    }
    /**
	 * 设置：文章名称
	 */
    public String getWenzhangName() {
        return wenzhangName;
    }


    /**
	 * 获取：文章名称
	 */

    public void setWenzhangName(String wenzhangName) {
        this.wenzhangName = wenzhangName;
    }
    /**
	 * 设置：文章照片
	 */
    public String getWenzhangPhoto() {
        return wenzhangPhoto;
    }


    /**
	 * 获取：文章照片
	 */

    public void setWenzhangPhoto(String wenzhangPhoto) {
        this.wenzhangPhoto = wenzhangPhoto;
    }
    /**
	 * 设置：文章类型
	 */
    public Integer getWenzhangTypes() {
        return wenzhangTypes;
    }


    /**
	 * 获取：文章类型
	 */

    public void setWenzhangTypes(Integer wenzhangTypes) {
        this.wenzhangTypes = wenzhangTypes;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：是否vip文章
	 */
    public Integer getVipwenzhangTypes() {
        return vipwenzhangTypes;
    }


    /**
	 * 获取：是否vip文章
	 */

    public void setVipwenzhangTypes(Integer vipwenzhangTypes) {
        this.vipwenzhangTypes = vipwenzhangTypes;
    }
    /**
	 * 设置：适合年龄段
	 */
    public Integer getNianlingduanTypes() {
        return nianlingduanTypes;
    }


    /**
	 * 获取：适合年龄段
	 */

    public void setNianlingduanTypes(Integer nianlingduanTypes) {
        this.nianlingduanTypes = nianlingduanTypes;
    }
    /**
	 * 设置：文章介绍
	 */
    public String getWenzhangContent() {
        return wenzhangContent;
    }


    /**
	 * 获取：文章介绍
	 */

    public void setWenzhangContent(String wenzhangContent) {
        this.wenzhangContent = wenzhangContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getWenzhangDelete() {
        return wenzhangDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setWenzhangDelete(Integer wenzhangDelete) {
        this.wenzhangDelete = wenzhangDelete;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
