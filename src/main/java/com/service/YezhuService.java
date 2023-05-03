package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YezhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YezhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YezhuView;


/**
 * 业主
 *
 * @author 
 * @email 
 * @date 2021-02-24 13:10:43
 */
public interface YezhuService extends IService<YezhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YezhuVO> selectListVO(Wrapper<YezhuEntity> wrapper);
   	
   	YezhuVO selectVO(@Param("ew") Wrapper<YezhuEntity> wrapper);
   	
   	List<YezhuView> selectListView(Wrapper<YezhuEntity> wrapper);
   	
   	YezhuView selectView(@Param("ew") Wrapper<YezhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YezhuEntity> wrapper);
   	
}

