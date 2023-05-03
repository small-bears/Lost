package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixiantousuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixiantousuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixiantousuView;


/**
 * 在线投诉
 *
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
public interface ZaixiantousuService extends IService<ZaixiantousuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixiantousuVO> selectListVO(Wrapper<ZaixiantousuEntity> wrapper);
   	
   	ZaixiantousuVO selectVO(@Param("ew") Wrapper<ZaixiantousuEntity> wrapper);
   	
   	List<ZaixiantousuView> selectListView(Wrapper<ZaixiantousuEntity> wrapper);
   	
   	ZaixiantousuView selectView(@Param("ew") Wrapper<ZaixiantousuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixiantousuEntity> wrapper);
   	
}

