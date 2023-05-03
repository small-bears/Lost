package com.entity.view;

import com.entity.YezhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 业主
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-24 13:10:43
 */
@TableName("yezhu")
public class YezhuView  extends YezhuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YezhuView(){
	}
 
 	public YezhuView(YezhuEntity yezhuEntity){
 	try {
			BeanUtils.copyProperties(this, yezhuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
