package com.entity.view;

import com.entity.WenzhangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 文章
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("wenzhang")
public class WenzhangView extends WenzhangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 文章类型的值
		*/
		private String wenzhangValue;
		/**
		* 是否vip文章的值
		*/
		private String vipwenzhangValue;
		/**
		* 适合年龄段的值
		*/
		private String nianlingduanValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public WenzhangView() {

	}

	public WenzhangView(WenzhangEntity wenzhangEntity) {
		try {
			BeanUtils.copyProperties(this, wenzhangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
















}
