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


import com.dao.YezhuDao;
import com.entity.YezhuEntity;
import com.service.YezhuService;
import com.entity.vo.YezhuVO;
import com.entity.view.YezhuView;

@Service("yezhuService")
public class YezhuServiceImpl extends ServiceImpl<YezhuDao, YezhuEntity> implements YezhuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YezhuEntity> page = this.selectPage(
                new Query<YezhuEntity>(params).getPage(),
                new EntityWrapper<YezhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YezhuEntity> wrapper) {
		  Page<YezhuView> page =new Query<YezhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YezhuVO> selectListVO(Wrapper<YezhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YezhuVO selectVO(Wrapper<YezhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YezhuView> selectListView(Wrapper<YezhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YezhuView selectView(Wrapper<YezhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
