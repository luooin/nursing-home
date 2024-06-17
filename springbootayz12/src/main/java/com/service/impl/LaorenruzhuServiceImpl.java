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


import com.dao.LaorenruzhuDao;
import com.entity.LaorenruzhuEntity;
import com.service.LaorenruzhuService;
import com.entity.vo.LaorenruzhuVO;
import com.entity.view.LaorenruzhuView;

@Service("laorenruzhuService")
public class LaorenruzhuServiceImpl extends ServiceImpl<LaorenruzhuDao, LaorenruzhuEntity> implements LaorenruzhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LaorenruzhuEntity> page = this.selectPage(
                new Query<LaorenruzhuEntity>(params).getPage(),
                new EntityWrapper<LaorenruzhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LaorenruzhuEntity> wrapper) {
		  Page<LaorenruzhuView> page =new Query<LaorenruzhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LaorenruzhuVO> selectListVO(Wrapper<LaorenruzhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LaorenruzhuVO selectVO(Wrapper<LaorenruzhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LaorenruzhuView> selectListView(Wrapper<LaorenruzhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LaorenruzhuView selectView(Wrapper<LaorenruzhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
