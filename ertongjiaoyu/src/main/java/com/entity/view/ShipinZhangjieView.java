package com.entity.view;

import com.entity.ShipinZhangjieEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 章节
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shipin_zhangjie")
public class ShipinZhangjieView extends ShipinZhangjieEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 shipin
			/**
			* 视频编号
			*/
			private String shipinUuidNumber;
			/**
			* 视频名称
			*/
			private String shipinName;
			/**
			* 视频照片
			*/
			private String shipinPhoto;
			/**
			* 视频试看
			*/
			private String shipinVideo;
			/**
			* 视频类型
			*/
			private Integer shipinTypes;
				/**
				* 视频类型的值
				*/
				private String shipinValue;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 是否vip视频
			*/
			private Integer vipshipinTypes;
				/**
				* 是否vip视频的值
				*/
				private String vipshipinValue;
			/**
			* 适合年龄段
			*/
			private Integer nianlingduanTypes;
				/**
				* 适合年龄段的值
				*/
				private String nianlingduanValue;
			/**
			* 视频介绍
			*/
			private String shipinContent;
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
			private Integer shipinDelete;

	public ShipinZhangjieView() {

	}

	public ShipinZhangjieView(ShipinZhangjieEntity shipinZhangjieEntity) {
		try {
			BeanUtils.copyProperties(this, shipinZhangjieEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}











				//级联表的get和set shipin

					/**
					* 获取： 视频编号
					*/
					public String getShipinUuidNumber() {
						return shipinUuidNumber;
					}
					/**
					* 设置： 视频编号
					*/
					public void setShipinUuidNumber(String shipinUuidNumber) {
						this.shipinUuidNumber = shipinUuidNumber;
					}

					/**
					* 获取： 视频名称
					*/
					public String getShipinName() {
						return shipinName;
					}
					/**
					* 设置： 视频名称
					*/
					public void setShipinName(String shipinName) {
						this.shipinName = shipinName;
					}

					/**
					* 获取： 视频照片
					*/
					public String getShipinPhoto() {
						return shipinPhoto;
					}
					/**
					* 设置： 视频照片
					*/
					public void setShipinPhoto(String shipinPhoto) {
						this.shipinPhoto = shipinPhoto;
					}

					/**
					* 获取： 视频试看
					*/
					public String getShipinVideo() {
						return shipinVideo;
					}
					/**
					* 设置： 视频试看
					*/
					public void setShipinVideo(String shipinVideo) {
						this.shipinVideo = shipinVideo;
					}

					/**
					* 获取： 视频类型
					*/
					public Integer getShipinTypes() {
						return shipinTypes;
					}
					/**
					* 设置： 视频类型
					*/
					public void setShipinTypes(Integer shipinTypes) {
						this.shipinTypes = shipinTypes;
					}


						/**
						* 获取： 视频类型的值
						*/
						public String getShipinValue() {
							return shipinValue;
						}
						/**
						* 设置： 视频类型的值
						*/
						public void setShipinValue(String shipinValue) {
							this.shipinValue = shipinValue;
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
					* 获取： 是否vip视频
					*/
					public Integer getVipshipinTypes() {
						return vipshipinTypes;
					}
					/**
					* 设置： 是否vip视频
					*/
					public void setVipshipinTypes(Integer vipshipinTypes) {
						this.vipshipinTypes = vipshipinTypes;
					}


						/**
						* 获取： 是否vip视频的值
						*/
						public String getVipshipinValue() {
							return vipshipinValue;
						}
						/**
						* 设置： 是否vip视频的值
						*/
						public void setVipshipinValue(String vipshipinValue) {
							this.vipshipinValue = vipshipinValue;
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
					* 获取： 视频介绍
					*/
					public String getShipinContent() {
						return shipinContent;
					}
					/**
					* 设置： 视频介绍
					*/
					public void setShipinContent(String shipinContent) {
						this.shipinContent = shipinContent;
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
					public Integer getShipinDelete() {
						return shipinDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setShipinDelete(Integer shipinDelete) {
						this.shipinDelete = shipinDelete;
					}






















}
