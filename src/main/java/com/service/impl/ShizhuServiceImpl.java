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


import com.dao.ShizhuDao;
import com.entity.ShizhuEntity;
import com.service.ShizhuService;
import com.entity.vo.ShizhuVO;
import com.entity.view.ShizhuView;

@Service("shizhuService")
public class ShizhuServiceImpl extends ServiceImpl<ShizhuDao, ShizhuEntity> implements ShizhuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShizhuEntity> page = this.selectPage(
                new Query<ShizhuEntity>(params).getPage(),
                new EntityWrapper<ShizhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShizhuEntity> wrapper) {
		  Page<ShizhuView> page =new Query<ShizhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShizhuVO> selectListVO(Wrapper<ShizhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShizhuVO selectVO(Wrapper<ShizhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShizhuView> selectListView(Wrapper<ShizhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShizhuView selectView(Wrapper<ShizhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
