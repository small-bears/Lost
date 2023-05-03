package com.entity.vo;

import com.entity.ZaixiantousuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 在线投诉
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
public class ZaixiantousuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
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
	 * 失主号
	 */
	
	private String shizhuhao;
		
	/**
	 * 失主名
	 */
	
	private String shizhuming;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 投诉标题
	 */
	
	private String tousubiaoti;
		
	/**
	 * 投诉时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tousushijian;
		
	/**
	 * 投诉说明
	 */
	
	private String tousushuoming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：失主号
	 */
	 
	public void setShizhuhao(String shizhuhao) {
		this.shizhuhao = shizhuhao;
	}
	
	/**
	 * 获取：失主号
	 */
	public String getShizhuhao() {
		return shizhuhao;
	}
				
	
	/**
	 * 设置：失主名
	 */
	 
	public void setShizhuming(String shizhuming) {
		this.shizhuming = shizhuming;
	}
	
	/**
	 * 获取：失主名
	 */
	public String getShizhuming() {
		return shizhuming;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：投诉标题
	 */
	 
	public void setTousubiaoti(String tousubiaoti) {
		this.tousubiaoti = tousubiaoti;
	}
	
	/**
	 * 获取：投诉标题
	 */
	public String getTousubiaoti() {
		return tousubiaoti;
	}
				
	
	/**
	 * 设置：投诉时间
	 */
	 
	public void setTousushijian(Date tousushijian) {
		this.tousushijian = tousushijian;
	}
	
	/**
	 * 获取：投诉时间
	 */
	public Date getTousushijian() {
		return tousushijian;
	}
				
	
	/**
	 * 设置：投诉说明
	 */
	 
	public void setTousushuoming(String tousushuoming) {
		this.tousushuoming = tousushuoming;
	}
	
	/**
	 * 获取：投诉说明
	 */
	public String getTousushuoming() {
		return tousushuoming;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
