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
 * 失物展示
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
@TableName("shiwuzhanshi")
public class ShiwuzhanshiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShiwuzhanshiEntity() {
		
	}
	
	public ShiwuzhanshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 失物标题
	 */
					
	private String shiwubiaoti;
	
	/**
	 * 失物名称
	 */
					
	private String shiwumingcheng;
	
	/**
	 * 失物类型
	 */
					
	private String shiwuleixing;
	
	/**
	 * 拾遗数量
	 */
					
	private Integer shiyishuliang;
	
	/**
	 * 失物照片
	 */
					
	private String shiwuzhaopian;
	
	/**
	 * 拾遗时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date shiyishijian;
	
	/**
	 * 拾遗地点
	 */
					
	private String shiyididian;
	
	/**
	 * 失物详情
	 */
					
	private String shiwuxiangqing;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：失物标题
	 */
	public void setShiwubiaoti(String shiwubiaoti) {
		this.shiwubiaoti = shiwubiaoti;
	}
	/**
	 * 获取：失物标题
	 */
	public String getShiwubiaoti() {
		return shiwubiaoti;
	}
	/**
	 * 设置：失物名称
	 */
	public void setShiwumingcheng(String shiwumingcheng) {
		this.shiwumingcheng = shiwumingcheng;
	}
	/**
	 * 获取：失物名称
	 */
	public String getShiwumingcheng() {
		return shiwumingcheng;
	}
	/**
	 * 设置：失物类型
	 */
	public void setShiwuleixing(String shiwuleixing) {
		this.shiwuleixing = shiwuleixing;
	}
	/**
	 * 获取：失物类型
	 */
	public String getShiwuleixing() {
		return shiwuleixing;
	}
	/**
	 * 设置：拾遗数量
	 */
	public void setShiyishuliang(Integer shiyishuliang) {
		this.shiyishuliang = shiyishuliang;
	}
	/**
	 * 获取：拾遗数量
	 */
	public Integer getShiyishuliang() {
		return shiyishuliang;
	}
	/**
	 * 设置：失物照片
	 */
	public void setShiwuzhaopian(String shiwuzhaopian) {
		this.shiwuzhaopian = shiwuzhaopian;
	}
	/**
	 * 获取：失物照片
	 */
	public String getShiwuzhaopian() {
		return shiwuzhaopian;
	}
	/**
	 * 设置：拾遗时间
	 */
	public void setShiyishijian(Date shiyishijian) {
		this.shiyishijian = shiyishijian;
	}
	/**
	 * 获取：拾遗时间
	 */
	public Date getShiyishijian() {
		return shiyishijian;
	}
	/**
	 * 设置：拾遗地点
	 */
	public void setShiyididian(String shiyididian) {
		this.shiyididian = shiyididian;
	}
	/**
	 * 获取：拾遗地点
	 */
	public String getShiyididian() {
		return shiyididian;
	}
	/**
	 * 设置：失物详情
	 */
	public void setShiwuxiangqing(String shiwuxiangqing) {
		this.shiwuxiangqing = shiwuxiangqing;
	}
	/**
	 * 获取：失物详情
	 */
	public String getShiwuxiangqing() {
		return shiwuxiangqing;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
