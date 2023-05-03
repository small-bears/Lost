package com.dao;

import com.entity.DiscussshiwuzhanshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshiwuzhanshiVO;
import com.entity.view.DiscussshiwuzhanshiView;


/**
 * 失物展示评论表
 * 
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
public interface DiscussshiwuzhanshiDao extends BaseMapper<DiscussshiwuzhanshiEntity> {
	
	List<DiscussshiwuzhanshiVO> selectListVO(@Param("ew") Wrapper<DiscussshiwuzhanshiEntity> wrapper);
	
	DiscussshiwuzhanshiVO selectVO(@Param("ew") Wrapper<DiscussshiwuzhanshiEntity> wrapper);
	
	List<DiscussshiwuzhanshiView> selectListView(@Param("ew") Wrapper<DiscussshiwuzhanshiEntity> wrapper);

	List<DiscussshiwuzhanshiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshiwuzhanshiEntity> wrapper);
	
	DiscussshiwuzhanshiView selectView(@Param("ew") Wrapper<DiscussshiwuzhanshiEntity> wrapper);
	
}
