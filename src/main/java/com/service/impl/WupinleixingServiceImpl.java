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


import com.dao.WupinleixingDao;
import com.entity.WupinleixingEntity;
import com.service.WupinleixingService;
import com.entity.vo.WupinleixingVO;
import com.entity.view.WupinleixingView;

@Service("wupinleixingService")
public class WupinleixingServiceImpl extends ServiceImpl<WupinleixingDao, WupinleixingEntity> implements WupinleixingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WupinleixingEntity> page = this.selectPage(
                new Query<WupinleixingEntity>(params).getPage(),
                new EntityWrapper<WupinleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WupinleixingEntity> wrapper) {
		  Page<WupinleixingView> page =new Query<WupinleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WupinleixingVO> selectListVO(Wrapper<WupinleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WupinleixingVO selectVO(Wrapper<WupinleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WupinleixingView> selectListView(Wrapper<WupinleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WupinleixingView selectView(Wrapper<WupinleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
