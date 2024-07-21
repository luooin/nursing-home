package com.dao;

import com.entity.RuyuanzhinanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuyuanzhinanVO;
import com.entity.view.RuyuanzhinanView;


/**
 * 入院指南
 * 
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public interface RuyuanzhinanDao extends BaseMapper<RuyuanzhinanEntity> {
	
	List<RuyuanzhinanVO> selectListVO(@Param("ew") Wrapper<RuyuanzhinanEntity> wrapper);
	
	RuyuanzhinanVO selectVO(@Param("ew") Wrapper<RuyuanzhinanEntity> wrapper);
	
	List<RuyuanzhinanView> selectListView(@Param("ew") Wrapper<RuyuanzhinanEntity> wrapper);

	List<RuyuanzhinanView> selectListView(Pagination page,@Param("ew") Wrapper<RuyuanzhinanEntity> wrapper);
	
	RuyuanzhinanView selectView(@Param("ew") Wrapper<RuyuanzhinanEntity> wrapper);
	

}
