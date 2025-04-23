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
 * 名师
 *
 * @author 
 * @email
 */
@TableName("laoshi")
public class LaoshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public LaoshiEntity() {

	}

	public LaoshiEntity(T t) {
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
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 老师姓名
     */
    @TableField(value = "laoshi_name")

    private String laoshiName;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 年龄
     */
    @TableField(value = "age")

    private Integer age;


    /**
     * 老师照片
     */
    @TableField(value = "laoshi_photo")

    private String laoshiPhoto;


    /**
     * 籍贯
     */
    @TableField(value = "jiguan")

    private String jiguan;


    /**
     * 毕业院校
     */
    @TableField(value = "biyeyuanxiao")

    private String biyeyuanxiao;


    /**
     * 毕业于哪一年
     */
    @TableField(value = "biyenian")

    private String biyenian;


    /**
     * 擅长
     */
    @TableField(value = "shanchang")

    private String shanchang;


    /**
     * 老师介绍
     */
    @TableField(value = "laoshi_content")

    private String laoshiContent;


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
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：老师姓名
	 */
    public String getLaoshiName() {
        return laoshiName;
    }
    /**
	 * 获取：老师姓名
	 */

    public void setLaoshiName(String laoshiName) {
        this.laoshiName = laoshiName;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：年龄
	 */
    public Integer getAge() {
        return age;
    }
    /**
	 * 获取：年龄
	 */

    public void setAge(Integer age) {
        this.age = age;
    }
    /**
	 * 设置：老师照片
	 */
    public String getLaoshiPhoto() {
        return laoshiPhoto;
    }
    /**
	 * 获取：老师照片
	 */

    public void setLaoshiPhoto(String laoshiPhoto) {
        this.laoshiPhoto = laoshiPhoto;
    }
    /**
	 * 设置：籍贯
	 */
    public String getJiguan() {
        return jiguan;
    }
    /**
	 * 获取：籍贯
	 */

    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }
    /**
	 * 设置：毕业院校
	 */
    public String getBiyeyuanxiao() {
        return biyeyuanxiao;
    }
    /**
	 * 获取：毕业院校
	 */

    public void setBiyeyuanxiao(String biyeyuanxiao) {
        this.biyeyuanxiao = biyeyuanxiao;
    }
    /**
	 * 设置：毕业于哪一年
	 */
    public String getBiyenian() {
        return biyenian;
    }
    /**
	 * 获取：毕业于哪一年
	 */

    public void setBiyenian(String biyenian) {
        this.biyenian = biyenian;
    }
    /**
	 * 设置：擅长
	 */
    public String getShanchang() {
        return shanchang;
    }
    /**
	 * 获取：擅长
	 */

    public void setShanchang(String shanchang) {
        this.shanchang = shanchang;
    }
    /**
	 * 设置：老师介绍
	 */
    public String getLaoshiContent() {
        return laoshiContent;
    }
    /**
	 * 获取：老师介绍
	 */

    public void setLaoshiContent(String laoshiContent) {
        this.laoshiContent = laoshiContent;
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
        return "Laoshi{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", laoshiName=" + laoshiName +
            ", sexTypes=" + sexTypes +
            ", age=" + age +
            ", laoshiPhoto=" + laoshiPhoto +
            ", jiguan=" + jiguan +
            ", biyeyuanxiao=" + biyeyuanxiao +
            ", biyenian=" + biyenian +
            ", shanchang=" + shanchang +
            ", laoshiContent=" + laoshiContent +
            ", createTime=" + createTime +
        "}";
    }
}
