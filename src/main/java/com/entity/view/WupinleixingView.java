package com.entity.view;

import com.entity.WupinleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 物品类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
@TableName("wupinleixing")
public class WupinleixingView  extends WupinleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WupinleixingView(){
	}
 
 	public WupinleixingView(WupinleixingEntity wupinleixingEntity){
 	try {
			BeanUtils.copyProperties(this, wupinleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
