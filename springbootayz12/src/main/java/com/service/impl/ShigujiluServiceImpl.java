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


import com.dao.ShigujiluDao;
import com.entity.ShigujiluEntity;
import com.service.ShigujiluService;
import com.entity.vo.ShigujiluVO;
import com.entity.view.ShigujiluView;

@Service("shigujiluService")
public class ShigujiluServiceImpl extends ServiceImpl<ShigujiluDao, ShigujiluEntity> implements ShigujiluService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShigujiluEntity> page = this.selectPage(
                new Query<ShigujiluEntity>(params).getPage(),
                new EntityWrapper<ShigujiluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShigujiluEntity> wrapper) {
		  Page<ShigujiluView> page =new Query<ShigujiluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShigujiluVO> selectListVO(Wrapper<ShigujiluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShigujiluVO selectVO(Wrapper<ShigujiluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShigujiluView> selectListView(Wrapper<ShigujiluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShigujiluView selectView(Wrapper<ShigujiluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
