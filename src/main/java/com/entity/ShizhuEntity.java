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
 * 失主
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
@TableName("shizhu")
public class ShizhuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShizhuEntity() {
		
	}
	
	public ShizhuEntity(T t) {
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
	 * 失主号
	 */
					
	private String shizhuhao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 失主名
	 */
					
	private String shizhuming;
	
	/**
	 * 门牌号
	 */
					
	private String menpaihao;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 电子邮箱
	 */
					
	private String dianziyouxiang;
	
	/**
	 * 个人照片
	 */
					
	private String gerenzhaopian;
	
	
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
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：门牌号
	 */
	public void setMenpaihao(String menpaihao) {
		this.menpaihao = menpaihao;
	}
	/**
	 * 获取：门牌号
	 */
	public String getMenpaihao() {
		return menpaihao;
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
	 * 设置：电子邮箱
	 */
	public void setDianziyouxiang(String dianziyouxiang) {
		this.dianziyouxiang = dianziyouxiang;
	}
	/**
	 * 获取：电子邮箱
	 */
	public String getDianziyouxiang() {
		return dianziyouxiang;
	}
	/**
	 * 设置：个人照片
	 */
	public void setGerenzhaopian(String gerenzhaopian) {
		this.gerenzhaopian = gerenzhaopian;
	}
	/**
	 * 获取：个人照片
	 */
	public String getGerenzhaopian() {
		return gerenzhaopian;
	}

}
