package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiwuzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiwuzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiwuzhanshiView;


/**
 * 失物展示
 *
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
public interface ShiwuzhanshiService extends IService<ShiwuzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiwuzhanshiVO> selectListVO(Wrapper<ShiwuzhanshiEntity> wrapper);
   	
   	ShiwuzhanshiVO selectVO(@Param("ew") Wrapper<ShiwuzhanshiEntity> wrapper);
   	
   	List<ShiwuzhanshiView> selectListView(Wrapper<ShiwuzhanshiEntity> wrapper);
   	
   	ShiwuzhanshiView selectView(@Param("ew") Wrapper<ShiwuzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiwuzhanshiEntity> wrapper);
   	
}

