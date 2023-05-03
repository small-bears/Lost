package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShizhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShizhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShizhuView;


/**
 * 失主
 *
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
public interface ShizhuService extends IService<ShizhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShizhuVO> selectListVO(Wrapper<ShizhuEntity> wrapper);
   	
   	ShizhuVO selectVO(@Param("ew") Wrapper<ShizhuEntity> wrapper);
   	
   	List<ShizhuView> selectListView(Wrapper<ShizhuEntity> wrapper);
   	
   	ShizhuView selectView(@Param("ew") Wrapper<ShizhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShizhuEntity> wrapper);
   	
}

