package com.entity.view;

import com.entity.ShizhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 失主
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
@TableName("shizhu")
public class ShizhuView  extends ShizhuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShizhuView(){
	}
 
 	public ShizhuView(ShizhuEntity shizhuEntity){
 	try {
			BeanUtils.copyProperties(this, shizhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
