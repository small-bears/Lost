package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShiwurenlingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShiwurenlingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiwurenlingView;


/**
 * 失物认领
 *
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
public interface ShiwurenlingService extends IService<ShiwurenlingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiwurenlingVO> selectListVO(Wrapper<ShiwurenlingEntity> wrapper);
   	
   	ShiwurenlingVO selectVO(@Param("ew") Wrapper<ShiwurenlingEntity> wrapper);
   	
   	List<ShiwurenlingView> selectListView(Wrapper<ShiwurenlingEntity> wrapper);
   	
   	ShiwurenlingView selectView(@Param("ew") Wrapper<ShiwurenlingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiwurenlingEntity> wrapper);
   	
}

