package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshiwuzhanshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshiwuzhanshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshiwuzhanshiView;


/**
 * 失物展示评论表
 *
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
public interface DiscussshiwuzhanshiService extends IService<DiscussshiwuzhanshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshiwuzhanshiVO> selectListVO(Wrapper<DiscussshiwuzhanshiEntity> wrapper);
   	
   	DiscussshiwuzhanshiVO selectVO(@Param("ew") Wrapper<DiscussshiwuzhanshiEntity> wrapper);
   	
   	List<DiscussshiwuzhanshiView> selectListView(Wrapper<DiscussshiwuzhanshiEntity> wrapper);
   	
   	DiscussshiwuzhanshiView selectView(@Param("ew") Wrapper<DiscussshiwuzhanshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshiwuzhanshiEntity> wrapper);
   	
}

