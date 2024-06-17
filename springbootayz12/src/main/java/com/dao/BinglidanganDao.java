package com.dao;

import com.entity.BinglidanganEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BinglidanganVO;
import com.entity.view.BinglidanganView;


/**
 * 病历档案
 * 
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public interface BinglidanganDao extends BaseMapper<BinglidanganEntity> {
	
	List<BinglidanganVO> selectListVO(@Param("ew") Wrapper<BinglidanganEntity> wrapper);
	
	BinglidanganVO selectVO(@Param("ew") Wrapper<BinglidanganEntity> wrapper);
	
	List<BinglidanganView> selectListView(@Param("ew") Wrapper<BinglidanganEntity> wrapper);

	List<BinglidanganView> selectListView(Pagination page,@Param("ew") Wrapper<BinglidanganEntity> wrapper);
	
	BinglidanganView selectView(@Param("ew") Wrapper<BinglidanganEntity> wrapper);
	

}
