package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShiwurenlingDao;
import com.entity.ShiwurenlingEntity;
import com.service.ShiwurenlingService;
import com.entity.vo.ShiwurenlingVO;
import com.entity.view.ShiwurenlingView;

@Service("shiwurenlingService")
public class ShiwurenlingServiceImpl extends ServiceImpl<ShiwurenlingDao, ShiwurenlingEntity> implements ShiwurenlingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiwurenlingEntity> page = this.selectPage(
                new Query<ShiwurenlingEntity>(params).getPage(),
                new EntityWrapper<ShiwurenlingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiwurenlingEntity> wrapper) {
		  Page<ShiwurenlingView> page =new Query<ShiwurenlingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiwurenlingVO> selectListVO(Wrapper<ShiwurenlingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiwurenlingVO selectVO(Wrapper<ShiwurenlingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiwurenlingView> selectListView(Wrapper<ShiwurenlingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiwurenlingView selectView(Wrapper<ShiwurenlingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
