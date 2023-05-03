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


import com.dao.ZaixiantousuDao;
import com.entity.ZaixiantousuEntity;
import com.service.ZaixiantousuService;
import com.entity.vo.ZaixiantousuVO;
import com.entity.view.ZaixiantousuView;

@Service("zaixiantousuService")
public class ZaixiantousuServiceImpl extends ServiceImpl<ZaixiantousuDao, ZaixiantousuEntity> implements ZaixiantousuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaixiantousuEntity> page = this.selectPage(
                new Query<ZaixiantousuEntity>(params).getPage(),
                new EntityWrapper<ZaixiantousuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaixiantousuEntity> wrapper) {
		  Page<ZaixiantousuView> page =new Query<ZaixiantousuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaixiantousuVO> selectListVO(Wrapper<ZaixiantousuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaixiantousuVO selectVO(Wrapper<ZaixiantousuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaixiantousuView> selectListView(Wrapper<ZaixiantousuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaixiantousuView selectView(Wrapper<ZaixiantousuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
