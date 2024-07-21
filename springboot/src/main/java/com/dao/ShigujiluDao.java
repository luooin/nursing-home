package com.dao;

import com.entity.ShigujiluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShigujiluVO;
import com.entity.view.ShigujiluView;


/**
 * 事故记录
 * 
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public interface ShigujiluDao extends BaseMapper<ShigujiluEntity> {
	
	List<ShigujiluVO> selectListVO(@Param("ew") Wrapper<ShigujiluEntity> wrapper);
	
	ShigujiluVO selectVO(@Param("ew") Wrapper<ShigujiluEntity> wrapper);
	
	List<ShigujiluView> selectListView(@Param("ew") Wrapper<ShigujiluEntity> wrapper);

	List<ShigujiluView> selectListView(Pagination page,@Param("ew") Wrapper<ShigujiluEntity> wrapper);
	
	ShigujiluView selectView(@Param("ew") Wrapper<ShigujiluEntity> wrapper);
	

}
