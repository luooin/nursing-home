package com.dao;

import com.entity.MeiyuecanyinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeiyuecanyinVO;
import com.entity.view.MeiyuecanyinView;


/**
 * 每月餐饮
 * 
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public interface MeiyuecanyinDao extends BaseMapper<MeiyuecanyinEntity> {
	
	List<MeiyuecanyinVO> selectListVO(@Param("ew") Wrapper<MeiyuecanyinEntity> wrapper);
	
	MeiyuecanyinVO selectVO(@Param("ew") Wrapper<MeiyuecanyinEntity> wrapper);
	
	List<MeiyuecanyinView> selectListView(@Param("ew") Wrapper<MeiyuecanyinEntity> wrapper);

	List<MeiyuecanyinView> selectListView(Pagination page,@Param("ew") Wrapper<MeiyuecanyinEntity> wrapper);
	
	MeiyuecanyinView selectView(@Param("ew") Wrapper<MeiyuecanyinEntity> wrapper);
	

}
