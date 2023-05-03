package com.dao;

import com.entity.ShiwuzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiwuzhanshiVO;
import com.entity.view.ShiwuzhanshiView;


/**
 * 失物展示
 * 
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
public interface ShiwuzhanshiDao extends BaseMapper<ShiwuzhanshiEntity> {
	
	List<ShiwuzhanshiVO> selectListVO(@Param("ew") Wrapper<ShiwuzhanshiEntity> wrapper);
	
	ShiwuzhanshiVO selectVO(@Param("ew") Wrapper<ShiwuzhanshiEntity> wrapper);
	
	List<ShiwuzhanshiView> selectListView(@Param("ew") Wrapper<ShiwuzhanshiEntity> wrapper);

	List<ShiwuzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<ShiwuzhanshiEntity> wrapper);
	
	ShiwuzhanshiView selectView(@Param("ew") Wrapper<ShiwuzhanshiEntity> wrapper);
	
}
