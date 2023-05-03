package com.dao;

import com.entity.ZaixiantousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixiantousuVO;
import com.entity.view.ZaixiantousuView;


/**
 * 在线投诉
 * 
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
public interface ZaixiantousuDao extends BaseMapper<ZaixiantousuEntity> {
	
	List<ZaixiantousuVO> selectListVO(@Param("ew") Wrapper<ZaixiantousuEntity> wrapper);
	
	ZaixiantousuVO selectVO(@Param("ew") Wrapper<ZaixiantousuEntity> wrapper);
	
	List<ZaixiantousuView> selectListView(@Param("ew") Wrapper<ZaixiantousuEntity> wrapper);

	List<ZaixiantousuView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixiantousuEntity> wrapper);
	
	ZaixiantousuView selectView(@Param("ew") Wrapper<ZaixiantousuEntity> wrapper);
	
}
