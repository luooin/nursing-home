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


import com.dao.FangjianziliaoDao;
import com.entity.FangjianziliaoEntity;
import com.service.FangjianziliaoService;
import com.entity.vo.FangjianziliaoVO;
import com.entity.view.FangjianziliaoView;

@Service("fangjianziliaoService")
public class FangjianziliaoServiceImpl extends ServiceImpl<FangjianziliaoDao, FangjianziliaoEntity> implements FangjianziliaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangjianziliaoEntity> page = this.selectPage(
                new Query<FangjianziliaoEntity>(params).getPage(),
                new EntityWrapper<FangjianziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangjianziliaoEntity> wrapper) {
		  Page<FangjianziliaoView> page =new Query<FangjianziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangjianziliaoVO> selectListVO(Wrapper<FangjianziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangjianziliaoVO selectVO(Wrapper<FangjianziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangjianziliaoView> selectListView(Wrapper<FangjianziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangjianziliaoView selectView(Wrapper<FangjianziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
