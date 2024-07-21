package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.MeiyuecanyinEntity;
import com.entity.view.MeiyuecanyinView;

import com.service.MeiyuecanyinService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 每月餐饮
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
@RestController
@RequestMapping("/meiyuecanyin")
public class MeiyuecanyinController {
    @Autowired
    private MeiyuecanyinService meiyuecanyinService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,MeiyuecanyinEntity meiyuecanyin,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiashu")) {
			meiyuecanyin.setJiashuzhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("hugong")) {
			meiyuecanyin.setHugonggonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<MeiyuecanyinEntity> ew = new EntityWrapper<MeiyuecanyinEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);

		PageUtils page = meiyuecanyinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, meiyuecanyin), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,MeiyuecanyinEntity meiyuecanyin, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date riqiend,
		HttpServletRequest request){
        EntityWrapper<MeiyuecanyinEntity> ew = new EntityWrapper<MeiyuecanyinEntity>();
                if(riqistart!=null) ew.ge("riqi", riqistart);
                if(riqiend!=null) ew.le("riqi", riqiend);

		PageUtils page = meiyuecanyinService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, meiyuecanyin), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( MeiyuecanyinEntity meiyuecanyin){
       	EntityWrapper<MeiyuecanyinEntity> ew = new EntityWrapper<MeiyuecanyinEntity>();
      	ew.allEq(MPUtil.allEQMapPre( meiyuecanyin, "meiyuecanyin")); 
        return R.ok().put("data", meiyuecanyinService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(MeiyuecanyinEntity meiyuecanyin){
        EntityWrapper< MeiyuecanyinEntity> ew = new EntityWrapper< MeiyuecanyinEntity>();
 		ew.allEq(MPUtil.allEQMapPre( meiyuecanyin, "meiyuecanyin")); 
		MeiyuecanyinView meiyuecanyinView =  meiyuecanyinService.selectView(ew);
		return R.ok("查询每月餐饮成功").put("data", meiyuecanyinView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        MeiyuecanyinEntity meiyuecanyin = meiyuecanyinService.selectById(id);
        return R.ok().put("data", meiyuecanyin);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        MeiyuecanyinEntity meiyuecanyin = meiyuecanyinService.selectById(id);
        return R.ok().put("data", meiyuecanyin);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MeiyuecanyinEntity meiyuecanyin, HttpServletRequest request){
    	meiyuecanyin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(meiyuecanyin);
        meiyuecanyinService.insert(meiyuecanyin);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody MeiyuecanyinEntity meiyuecanyin, HttpServletRequest request){
    	meiyuecanyin.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(meiyuecanyin);
        meiyuecanyinService.insert(meiyuecanyin);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody MeiyuecanyinEntity meiyuecanyin, HttpServletRequest request){
        //ValidatorUtils.validateEntity(meiyuecanyin);
        meiyuecanyinService.updateById(meiyuecanyin);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        meiyuecanyinService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<MeiyuecanyinEntity> wrapper = new EntityWrapper<MeiyuecanyinEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiashu")) {
			wrapper.eq("jiashuzhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("hugong")) {
			wrapper.eq("hugonggonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = meiyuecanyinService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
