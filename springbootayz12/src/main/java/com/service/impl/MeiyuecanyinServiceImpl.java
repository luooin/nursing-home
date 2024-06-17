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


import com.dao.MeiyuecanyinDao;
import com.entity.MeiyuecanyinEntity;
import com.service.MeiyuecanyinService;
import com.entity.vo.MeiyuecanyinVO;
import com.entity.view.MeiyuecanyinView;

@Service("meiyuecanyinService")
public class MeiyuecanyinServiceImpl extends ServiceImpl<MeiyuecanyinDao, MeiyuecanyinEntity> implements MeiyuecanyinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeiyuecanyinEntity> page = this.selectPage(
                new Query<MeiyuecanyinEntity>(params).getPage(),
                new EntityWrapper<MeiyuecanyinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeiyuecanyinEntity> wrapper) {
		  Page<MeiyuecanyinView> page =new Query<MeiyuecanyinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeiyuecanyinVO> selectListVO(Wrapper<MeiyuecanyinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeiyuecanyinVO selectVO(Wrapper<MeiyuecanyinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeiyuecanyinView> selectListView(Wrapper<MeiyuecanyinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeiyuecanyinView selectView(Wrapper<MeiyuecanyinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
