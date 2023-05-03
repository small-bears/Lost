package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WupinleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WupinleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WupinleixingView;


/**
 * 物品类型
 *
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
public interface WupinleixingService extends IService<WupinleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WupinleixingVO> selectListVO(Wrapper<WupinleixingEntity> wrapper);
   	
   	WupinleixingVO selectVO(@Param("ew") Wrapper<WupinleixingEntity> wrapper);
   	
   	List<WupinleixingView> selectListView(Wrapper<WupinleixingEntity> wrapper);
   	
   	WupinleixingView selectView(@Param("ew") Wrapper<WupinleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WupinleixingEntity> wrapper);
   	
}

