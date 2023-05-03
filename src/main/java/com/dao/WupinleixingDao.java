package com.dao;

import com.entity.WupinleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WupinleixingVO;
import com.entity.view.WupinleixingView;


/**
 * 物品类型
 * 
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
public interface WupinleixingDao extends BaseMapper<WupinleixingEntity> {
	
	List<WupinleixingVO> selectListVO(@Param("ew") Wrapper<WupinleixingEntity> wrapper);
	
	WupinleixingVO selectVO(@Param("ew") Wrapper<WupinleixingEntity> wrapper);
	
	List<WupinleixingView> selectListView(@Param("ew") Wrapper<WupinleixingEntity> wrapper);

	List<WupinleixingView> selectListView(Pagination page,@Param("ew") Wrapper<WupinleixingEntity> wrapper);
	
	WupinleixingView selectView(@Param("ew") Wrapper<WupinleixingEntity> wrapper);
	
}
