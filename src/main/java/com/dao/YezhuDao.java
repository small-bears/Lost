package com.dao;

import com.entity.YezhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YezhuVO;
import com.entity.view.YezhuView;


/**
 * 业主
 * 
 * @author 
 * @email 
 * @date 2021-02-24 13:10:43
 */
public interface YezhuDao extends BaseMapper<YezhuEntity> {
	
	List<YezhuVO> selectListVO(@Param("ew") Wrapper<YezhuEntity> wrapper);
	
	YezhuVO selectVO(@Param("ew") Wrapper<YezhuEntity> wrapper);
	
	List<YezhuView> selectListView(@Param("ew") Wrapper<YezhuEntity> wrapper);

	List<YezhuView> selectListView(Pagination page,@Param("ew") Wrapper<YezhuEntity> wrapper);
	
	YezhuView selectView(@Param("ew") Wrapper<YezhuEntity> wrapper);
	
}
