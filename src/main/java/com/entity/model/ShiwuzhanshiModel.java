package com.entity.model;

import com.entity.ShiwuzhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 失物展示
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
public class ShiwuzhanshiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
