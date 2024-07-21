package com.dao;

import com.entity.FangkejiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangkejiluVO;
import com.entity.view.FangkejiluView;


/**
 * 访客记录
 * 
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public interface FangkejiluDao extends BaseMapper<FangkejiluEntity> {
	
	List<FangkejiluVO> selectListVO(@Param("ew") Wrapper<FangkejiluEntity> wrapper);
	
	FangkejiluVO selectVO(@Param("ew") Wrapper<FangkejiluEntity> wrapper);
	
	List<FangkejiluView> selectListView(@Param("ew") Wrapper<FangkejiluEntity> wrapper);

	List<FangkejiluView> selectListView(Pagination page,@Param("ew") Wrapper<FangkejiluEntity> wrapper);
	
	FangkejiluView selectView(@Param("ew") Wrapper<FangkejiluEntity> wrapper);
	

}
