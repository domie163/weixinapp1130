package com.entity.view;

import com.entity.LajixinxiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 垃圾留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("lajixinxi_liuyan")
public class LajixinxiLiuyanView extends LajixinxiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 lajixinxi
			/**
			* 垃圾名称
			*/
			private String lajixinxiName;
			/**
			* 垃圾类型
			*/
			private Integer lajixinxiTypes;
				/**
				* 垃圾类型的值
				*/
				private String lajixinxiValue;
			/**
			* 垃圾图片
			*/
			private String lajixinxiPhoto;
			/**
			* 浏览次数
			*/
			private Integer lajixinxiClickNumber;
			/**
			* 垃圾详情
			*/
			private String lajixinxiContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public LajixinxiLiuyanView() {

	}

	public LajixinxiLiuyanView(LajixinxiLiuyanEntity lajixinxiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, lajixinxiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

























				//级联表的get和set lajixinxi
					/**
					* 获取： 垃圾名称
					*/
					public String getLajixinxiName() {
						return lajixinxiName;
					}
					/**
					* 设置： 垃圾名称
					*/
					public void setLajixinxiName(String lajixinxiName) {
						this.lajixinxiName = lajixinxiName;
					}
					/**
					* 获取： 垃圾类型
					*/
					public Integer getLajixinxiTypes() {
						return lajixinxiTypes;
					}
					/**
					* 设置： 垃圾类型
					*/
					public void setLajixinxiTypes(Integer lajixinxiTypes) {
						this.lajixinxiTypes = lajixinxiTypes;
					}


						/**
						* 获取： 垃圾类型的值
						*/
						public String getLajixinxiValue() {
							return lajixinxiValue;
						}
						/**
						* 设置： 垃圾类型的值
						*/
						public void setLajixinxiValue(String lajixinxiValue) {
							this.lajixinxiValue = lajixinxiValue;
						}
					/**
					* 获取： 垃圾图片
					*/
					public String getLajixinxiPhoto() {
						return lajixinxiPhoto;
					}
					/**
					* 设置： 垃圾图片
					*/
					public void setLajixinxiPhoto(String lajixinxiPhoto) {
						this.lajixinxiPhoto = lajixinxiPhoto;
					}
					/**
					* 获取： 浏览次数
					*/
					public Integer getLajixinxiClickNumber() {
						return lajixinxiClickNumber;
					}
					/**
					* 设置： 浏览次数
					*/
					public void setLajixinxiClickNumber(Integer lajixinxiClickNumber) {
						this.lajixinxiClickNumber = lajixinxiClickNumber;
					}
					/**
					* 获取： 垃圾详情
					*/
					public String getLajixinxiContent() {
						return lajixinxiContent;
					}
					/**
					* 设置： 垃圾详情
					*/
					public void setLajixinxiContent(String lajixinxiContent) {
						this.lajixinxiContent = lajixinxiContent;
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
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
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
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}



}
