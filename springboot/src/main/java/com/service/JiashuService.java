package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiashuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiashuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiashuView;


/**
 * 家属
 *
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public interface JiashuService extends IService<JiashuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiashuVO> selectListVO(Wrapper<JiashuEntity> wrapper);
   	
   	JiashuVO selectVO(@Param("ew") Wrapper<JiashuEntity> wrapper);
   	
   	List<JiashuView> selectListView(Wrapper<JiashuEntity> wrapper);
   	
   	JiashuView selectView(@Param("ew") Wrapper<JiashuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiashuEntity> wrapper);
   	

}

