package com.entity.view;

import com.entity.WenzhangMuluEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 文章目录
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("wenzhang_mulu")
public class WenzhangMuluView extends WenzhangMuluEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 wenzhang
			/**
			* 文章编号
			*/
			private String wenzhangUuidNumber;
			/**
			* 文章名称
			*/
			private String wenzhangName;
			/**
			* 文章照片
			*/
			private String wenzhangPhoto;
			/**
			* 文章类型
			*/
			private Integer wenzhangTypes;
				/**
				* 文章类型的值
				*/
				private String wenzhangValue;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 是否vip文章
			*/
			private Integer vipwenzhangTypes;
				/**
				* 是否vip文章的值
				*/
				private String vipwenzhangValue;
			/**
			* 适合年龄段
			*/
			private Integer nianlingduanTypes;
				/**
				* 适合年龄段的值
				*/
				private String nianlingduanValue;
			/**
			* 文章介绍
			*/
			private String wenzhangContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer wenzhangDelete;

	public WenzhangMuluView() {

	}

	public WenzhangMuluView(WenzhangMuluEntity wenzhangMuluEntity) {
		try {
			BeanUtils.copyProperties(this, wenzhangMuluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





















				//级联表的get和set wenzhang

					/**
					* 获取： 文章编号
					*/
					public String getWenzhangUuidNumber() {
						return wenzhangUuidNumber;
					}
					/**
					* 设置： 文章编号
					*/
					public void setWenzhangUuidNumber(String wenzhangUuidNumber) {
						this.wenzhangUuidNumber = wenzhangUuidNumber;
					}

					/**
					* 获取： 文章名称
					*/
					public String getWenzhangName() {
						return wenzhangName;
					}
					/**
					* 设置： 文章名称
					*/
					public void setWenzhangName(String wenzhangName) {
						this.wenzhangName = wenzhangName;
					}

					/**
					* 获取： 文章照片
					*/
					public String getWenzhangPhoto() {
						return wenzhangPhoto;
					}
					/**
					* 设置： 文章照片
					*/
					public void setWenzhangPhoto(String wenzhangPhoto) {
						this.wenzhangPhoto = wenzhangPhoto;
					}

					/**
					* 获取： 文章类型
					*/
					public Integer getWenzhangTypes() {
						return wenzhangTypes;
					}
					/**
					* 设置： 文章类型
					*/
					public void setWenzhangTypes(Integer wenzhangTypes) {
						this.wenzhangTypes = wenzhangTypes;
					}


						/**
						* 获取： 文章类型的值
						*/
						public String getWenzhangValue() {
							return wenzhangValue;
						}
						/**
						* 设置： 文章类型的值
						*/
						public void setWenzhangValue(String wenzhangValue) {
							this.wenzhangValue = wenzhangValue;
						}

					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取： 是否vip文章
					*/
					public Integer getVipwenzhangTypes() {
						return vipwenzhangTypes;
					}
					/**
					* 设置： 是否vip文章
					*/
					public void setVipwenzhangTypes(Integer vipwenzhangTypes) {
						this.vipwenzhangTypes = vipwenzhangTypes;
					}


						/**
						* 获取： 是否vip文章的值
						*/
						public String getVipwenzhangValue() {
							return vipwenzhangValue;
						}
						/**
						* 设置： 是否vip文章的值
						*/
						public void setVipwenzhangValue(String vipwenzhangValue) {
							this.vipwenzhangValue = vipwenzhangValue;
						}

					/**
					* 获取： 适合年龄段
					*/
					public Integer getNianlingduanTypes() {
						return nianlingduanTypes;
					}
					/**
					* 设置： 适合年龄段
					*/
					public void setNianlingduanTypes(Integer nianlingduanTypes) {
						this.nianlingduanTypes = nianlingduanTypes;
					}


						/**
						* 获取： 适合年龄段的值
						*/
						public String getNianlingduanValue() {
							return nianlingduanValue;
						}
						/**
						* 设置： 适合年龄段的值
						*/
						public void setNianlingduanValue(String nianlingduanValue) {
							this.nianlingduanValue = nianlingduanValue;
						}

					/**
					* 获取： 文章介绍
					*/
					public String getWenzhangContent() {
						return wenzhangContent;
					}
					/**
					* 设置： 文章介绍
					*/
					public void setWenzhangContent(String wenzhangContent) {
						this.wenzhangContent = wenzhangContent;
					}

					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getWenzhangDelete() {
						return wenzhangDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setWenzhangDelete(Integer wenzhangDelete) {
						this.wenzhangDelete = wenzhangDelete;
					}












}
