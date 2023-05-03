package com.dao;

import com.entity.ShiwurenlingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShiwurenlingVO;
import com.entity.view.ShiwurenlingView;


/**
 * 失物认领
 * 
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
public interface ShiwurenlingDao extends BaseMapper<ShiwurenlingEntity> {
	
	List<ShiwurenlingVO> selectListVO(@Param("ew") Wrapper<ShiwurenlingEntity> wrapper);
	
	ShiwurenlingVO selectVO(@Param("ew") Wrapper<ShiwurenlingEntity> wrapper);
	
	List<ShiwurenlingView> selectListView(@Param("ew") Wrapper<ShiwurenlingEntity> wrapper);

	List<ShiwurenlingView> selectListView(Pagination page,@Param("ew") Wrapper<ShiwurenlingEntity> wrapper);
	
	ShiwurenlingView selectView(@Param("ew") Wrapper<ShiwurenlingEntity> wrapper);
	
}
