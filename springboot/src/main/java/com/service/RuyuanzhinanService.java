package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuyuanzhinanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuyuanzhinanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuyuanzhinanView;


/**
 * 入院指南
 *
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public interface RuyuanzhinanService extends IService<RuyuanzhinanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuyuanzhinanVO> selectListVO(Wrapper<RuyuanzhinanEntity> wrapper);
   	
   	RuyuanzhinanVO selectVO(@Param("ew") Wrapper<RuyuanzhinanEntity> wrapper);
   	
   	List<RuyuanzhinanView> selectListView(Wrapper<RuyuanzhinanEntity> wrapper);
   	
   	RuyuanzhinanView selectView(@Param("ew") Wrapper<RuyuanzhinanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuyuanzhinanEntity> wrapper);
   	

}

