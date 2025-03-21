package com.entity.model;

import com.entity.LajixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 垃圾信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LajixinxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 垃圾名称
     */
    private String lajixinxiName;


    /**
     * 垃圾类型
     */
    private Integer lajixinxiTypes;


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


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：垃圾名称
	 */
    public String getLajixinxiName() {
        return lajixinxiName;
    }


    /**
	 * 设置：垃圾名称
	 */
    public void setLajixinxiName(String lajixinxiName) {
        this.lajixinxiName = lajixinxiName;
    }
    /**
	 * 获取：垃圾类型
	 */
    public Integer getLajixinxiTypes() {
        return lajixinxiTypes;
    }


    /**
	 * 设置：垃圾类型
	 */
    public void setLajixinxiTypes(Integer lajixinxiTypes) {
        this.lajixinxiTypes = lajixinxiTypes;
    }
    /**
	 * 获取：垃圾图片
	 */
    public String getLajixinxiPhoto() {
        return lajixinxiPhoto;
    }


    /**
	 * 设置：垃圾图片
	 */
    public void setLajixinxiPhoto(String lajixinxiPhoto) {
        this.lajixinxiPhoto = lajixinxiPhoto;
    }
    /**
	 * 获取：浏览次数
	 */
    public Integer getLajixinxiClickNumber() {
        return lajixinxiClickNumber;
    }


    /**
	 * 设置：浏览次数
	 */
    public void setLajixinxiClickNumber(Integer lajixinxiClickNumber) {
        this.lajixinxiClickNumber = lajixinxiClickNumber;
    }
    /**
	 * 获取：垃圾详情
	 */
    public String getLajixinxiContent() {
        return lajixinxiContent;
    }


    /**
	 * 设置：垃圾详情
	 */
    public void setLajixinxiContent(String lajixinxiContent) {
        this.lajixinxiContent = lajixinxiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
