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


import com.dao.DiscussshiwuzhanshiDao;
import com.entity.DiscussshiwuzhanshiEntity;
import com.service.DiscussshiwuzhanshiService;
import com.entity.vo.DiscussshiwuzhanshiVO;
import com.entity.view.DiscussshiwuzhanshiView;

@Service("discussshiwuzhanshiService")
public class DiscussshiwuzhanshiServiceImpl extends ServiceImpl<DiscussshiwuzhanshiDao, DiscussshiwuzhanshiEntity> implements DiscussshiwuzhanshiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshiwuzhanshiEntity> page = this.selectPage(
                new Query<DiscussshiwuzhanshiEntity>(params).getPage(),
                new EntityWrapper<DiscussshiwuzhanshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshiwuzhanshiEntity> wrapper) {
		  Page<DiscussshiwuzhanshiView> page =new Query<DiscussshiwuzhanshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshiwuzhanshiVO> selectListVO(Wrapper<DiscussshiwuzhanshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshiwuzhanshiVO selectVO(Wrapper<DiscussshiwuzhanshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshiwuzhanshiView> selectListView(Wrapper<DiscussshiwuzhanshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshiwuzhanshiView selectView(Wrapper<DiscussshiwuzhanshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
