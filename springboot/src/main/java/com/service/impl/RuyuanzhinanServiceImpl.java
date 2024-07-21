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


import com.dao.RuyuanzhinanDao;
import com.entity.RuyuanzhinanEntity;
import com.service.RuyuanzhinanService;
import com.entity.vo.RuyuanzhinanVO;
import com.entity.view.RuyuanzhinanView;

@Service("ruyuanzhinanService")
public class RuyuanzhinanServiceImpl extends ServiceImpl<RuyuanzhinanDao, RuyuanzhinanEntity> implements RuyuanzhinanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuyuanzhinanEntity> page = this.selectPage(
                new Query<RuyuanzhinanEntity>(params).getPage(),
                new EntityWrapper<RuyuanzhinanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuyuanzhinanEntity> wrapper) {
		  Page<RuyuanzhinanView> page =new Query<RuyuanzhinanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuyuanzhinanVO> selectListVO(Wrapper<RuyuanzhinanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuyuanzhinanVO selectVO(Wrapper<RuyuanzhinanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuyuanzhinanView> selectListView(Wrapper<RuyuanzhinanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuyuanzhinanView selectView(Wrapper<RuyuanzhinanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
