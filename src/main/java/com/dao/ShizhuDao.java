package com.dao;

import com.entity.ShizhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShizhuVO;
import com.entity.view.ShizhuView;


/**
 * 失主
 * 
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
public interface ShizhuDao extends BaseMapper<ShizhuEntity> {
	
	List<ShizhuVO> selectListVO(@Param("ew") Wrapper<ShizhuEntity> wrapper);
	
	ShizhuVO selectVO(@Param("ew") Wrapper<ShizhuEntity> wrapper);
	
	List<ShizhuView> selectListView(@Param("ew") Wrapper<ShizhuEntity> wrapper);

	List<ShizhuView> selectListView(Pagination page,@Param("ew") Wrapper<ShizhuEntity> wrapper);
	
	ShizhuView selectView(@Param("ew") Wrapper<ShizhuEntity> wrapper);
	
}
