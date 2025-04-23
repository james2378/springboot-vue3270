package com.entity.view;

import com.entity.ShipinZhangjieCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 章节收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shipin_zhangjie_collection")
public class ShipinZhangjieCollectionView extends ShipinZhangjieCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String shipinZhangjieCollectionValue;



		//级联表 shipin_zhangjie
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

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;
			/**
			* 是否vip
			*/
			private Integer vipTypes;
				/**
				* 是否vip的值
				*/
				private String vipValue;

	public ShipinZhangjieCollectionView() {

	}

	public ShipinZhangjieCollectionView(ShipinZhangjieCollectionEntity shipinZhangjieCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, shipinZhangjieCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getShipinZhangjieCollectionValue() {
				return shipinZhangjieCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setShipinZhangjieCollectionValue(String shipinZhangjieCollectionValue) {
				this.shipinZhangjieCollectionValue = shipinZhangjieCollectionValue;
			}



















				//级联表的get和set shipin_zhangjie


					/**
					* 获取： 章节名称
					*/
					public String getShipinZhangjieName() {
						return shipinZhangjieName;
					}
					/**
					* 设置： 章节名称
					*/
					public void setShipinZhangjieName(String shipinZhangjieName) {
						this.shipinZhangjieName = shipinZhangjieName;
					}

					/**
					* 获取： 章节照片
					*/
					public String getShipinZhangjiePhoto() {
						return shipinZhangjiePhoto;
					}
					/**
					* 设置： 章节照片
					*/
					public void setShipinZhangjiePhoto(String shipinZhangjiePhoto) {
						this.shipinZhangjiePhoto = shipinZhangjiePhoto;
					}

					/**
					* 获取： 章节视频
					*/
					public String getShipinZhangjieVideo() {
						return shipinZhangjieVideo;
					}
					/**
					* 设置： 章节视频
					*/
					public void setShipinZhangjieVideo(String shipinZhangjieVideo) {
						this.shipinZhangjieVideo = shipinZhangjieVideo;
					}

					/**
					* 获取： 章节介绍
					*/
					public String getShipinZhangjieContent() {
						return shipinZhangjieContent;
					}
					/**
					* 设置： 章节介绍
					*/
					public void setShipinZhangjieContent(String shipinZhangjieContent) {
						this.shipinZhangjieContent = shipinZhangjieContent;
					}






















				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}

					/**
					* 获取： 是否vip
					*/
					public Integer getVipTypes() {
						return vipTypes;
					}
					/**
					* 设置： 是否vip
					*/
					public void setVipTypes(Integer vipTypes) {
						this.vipTypes = vipTypes;
					}


						/**
						* 获取： 是否vip的值
						*/
						public String getVipValue() {
							return vipValue;
						}
						/**
						* 设置： 是否vip的值
						*/
						public void setVipValue(String vipValue) {
							this.vipValue = vipValue;
						}



}
