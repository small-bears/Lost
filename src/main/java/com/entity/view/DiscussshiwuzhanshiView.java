package com.entity.view;

import com.entity.DiscussshiwuzhanshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 失物展示评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
@TableName("discussshiwuzhanshi")
public class DiscussshiwuzhanshiView  extends DiscussshiwuzhanshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshiwuzhanshiView(){
	}
 
 	public DiscussshiwuzhanshiView(DiscussshiwuzhanshiEntity discussshiwuzhanshiEntity){
 	try {
			BeanUtils.copyProperties(this, discussshiwuzhanshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
