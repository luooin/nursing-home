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


import com.dao.BinglidanganDao;
import com.entity.BinglidanganEntity;
import com.service.BinglidanganService;
import com.entity.vo.BinglidanganVO;
import com.entity.view.BinglidanganView;

@Service("binglidanganService")
public class BinglidanganServiceImpl extends ServiceImpl<BinglidanganDao, BinglidanganEntity> implements BinglidanganService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BinglidanganEntity> page = this.selectPage(
                new Query<BinglidanganEntity>(params).getPage(),
                new EntityWrapper<BinglidanganEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BinglidanganEntity> wrapper) {
		  Page<BinglidanganView> page =new Query<BinglidanganView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BinglidanganVO> selectListVO(Wrapper<BinglidanganEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BinglidanganVO selectVO(Wrapper<BinglidanganEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BinglidanganView> selectListView(Wrapper<BinglidanganEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BinglidanganView selectView(Wrapper<BinglidanganEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
