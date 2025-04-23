package com.entity.model;

import com.entity.LaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 名师
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LaoshiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 老师姓名
     */
    private String laoshiName;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 年龄
     */
    private Integer age;


    /**
     * 老师照片
     */
    private String laoshiPhoto;


    /**
     * 籍贯
     */
    private String jiguan;


    /**
     * 毕业院校
     */
    private String biyeyuanxiao;


    /**
     * 毕业于哪一年
     */
    private String biyenian;


    /**
     * 擅长
     */
    private String shanchang;


    /**
     * 老师介绍
     */
    private String laoshiContent;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：账户
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 设置：密码
	 */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：老师姓名
	 */
    public String getLaoshiName() {
        return laoshiName;
    }


    /**
	 * 设置：老师姓名
	 */
    public void setLaoshiName(String laoshiName) {
        this.laoshiName = laoshiName;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 设置：性别
	 */
    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：年龄
	 */
    public Integer getAge() {
        return age;
    }


    /**
	 * 设置：年龄
	 */
    public void setAge(Integer age) {
        this.age = age;
    }
    /**
	 * 获取：老师照片
	 */
    public String getLaoshiPhoto() {
        return laoshiPhoto;
    }


    /**
	 * 设置：老师照片
	 */
    public void setLaoshiPhoto(String laoshiPhoto) {
        this.laoshiPhoto = laoshiPhoto;
    }
    /**
	 * 获取：籍贯
	 */
    public String getJiguan() {
        return jiguan;
    }


    /**
	 * 设置：籍贯
	 */
    public void setJiguan(String jiguan) {
        this.jiguan = jiguan;
    }
    /**
	 * 获取：毕业院校
	 */
    public String getBiyeyuanxiao() {
        return biyeyuanxiao;
    }


    /**
	 * 设置：毕业院校
	 */
    public void setBiyeyuanxiao(String biyeyuanxiao) {
        this.biyeyuanxiao = biyeyuanxiao;
    }
    /**
	 * 获取：毕业于哪一年
	 */
    public String getBiyenian() {
        return biyenian;
    }


    /**
	 * 设置：毕业于哪一年
	 */
    public void setBiyenian(String biyenian) {
        this.biyenian = biyenian;
    }
    /**
	 * 获取：擅长
	 */
    public String getShanchang() {
        return shanchang;
    }


    /**
	 * 设置：擅长
	 */
    public void setShanchang(String shanchang) {
        this.shanchang = shanchang;
    }
    /**
	 * 获取：老师介绍
	 */
    public String getLaoshiContent() {
        return laoshiContent;
    }


    /**
	 * 设置：老师介绍
	 */
    public void setLaoshiContent(String laoshiContent) {
        this.laoshiContent = laoshiContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
