package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.WupinleixingEntity;
import com.entity.view.WupinleixingView;

import com.service.WupinleixingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 物品类型
 * 后端接口
 * @author 
 * @email 
 * @date 2021-02-24 13:10:44
 */
@RestController
@RequestMapping("/wupinleixing")
public class WupinleixingController {
    @Autowired
    private WupinleixingService wupinleixingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WupinleixingEntity wupinleixing, HttpServletRequest request){

        EntityWrapper<WupinleixingEntity> ew = new EntityWrapper<WupinleixingEntity>();
    	PageUtils page = wupinleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wupinleixing), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WupinleixingEntity wupinleixing, HttpServletRequest request){
        EntityWrapper<WupinleixingEntity> ew = new EntityWrapper<WupinleixingEntity>();
    	PageUtils page = wupinleixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wupinleixing), params), params));
		request.setAttribute("data", page);
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WupinleixingEntity wupinleixing){
       	EntityWrapper<WupinleixingEntity> ew = new EntityWrapper<WupinleixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wupinleixing, "wupinleixing")); 
        return R.ok().put("data", wupinleixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WupinleixingEntity wupinleixing){
        EntityWrapper< WupinleixingEntity> ew = new EntityWrapper< WupinleixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wupinleixing, "wupinleixing")); 
		WupinleixingView wupinleixingView =  wupinleixingService.selectView(ew);
		return R.ok("查询物品类型成功").put("data", wupinleixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WupinleixingEntity wupinleixing = wupinleixingService.selectById(id);
        return R.ok().put("data", wupinleixing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WupinleixingEntity wupinleixing = wupinleixingService.selectById(id);
        return R.ok().put("data", wupinleixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WupinleixingEntity wupinleixing, HttpServletRequest request){
    	wupinleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wupinleixing);

        wupinleixingService.insert(wupinleixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WupinleixingEntity wupinleixing, HttpServletRequest request){
    	wupinleixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wupinleixing);

        wupinleixingService.insert(wupinleixing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody WupinleixingEntity wupinleixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wupinleixing);
        wupinleixingService.updateById(wupinleixing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wupinleixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<WupinleixingEntity> wrapper = new EntityWrapper<WupinleixingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = wupinleixingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	


}
