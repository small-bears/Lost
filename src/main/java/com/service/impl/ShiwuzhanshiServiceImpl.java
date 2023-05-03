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


import com.dao.ShiwuzhanshiDao;
import com.entity.ShiwuzhanshiEntity;
import com.service.ShiwuzhanshiService;
import com.entity.vo.ShiwuzhanshiVO;
import com.entity.view.ShiwuzhanshiView;

@Service("shiwuzhanshiService")
public class ShiwuzhanshiServiceImpl extends ServiceImpl<ShiwuzhanshiDao, ShiwuzhanshiEntity> implements ShiwuzhanshiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShiwuzhanshiEntity> page = this.selectPage(
                new Query<ShiwuzhanshiEntity>(params).getPage(),
                new EntityWrapper<ShiwuzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShiwuzhanshiEntity> wrapper) {
		  Page<ShiwuzhanshiView> page =new Query<ShiwuzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShiwuzhanshiVO> selectListVO(Wrapper<ShiwuzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShiwuzhanshiVO selectVO(Wrapper<ShiwuzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShiwuzhanshiView> selectListView(Wrapper<ShiwuzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShiwuzhanshiView selectView(Wrapper<ShiwuzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
