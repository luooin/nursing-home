package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShigujiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShigujiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShigujiluView;


/**
 * 事故记录
 *
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public interface ShigujiluService extends IService<ShigujiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShigujiluVO> selectListVO(Wrapper<ShigujiluEntity> wrapper);
   	
   	ShigujiluVO selectVO(@Param("ew") Wrapper<ShigujiluEntity> wrapper);
   	
   	List<ShigujiluView> selectListView(Wrapper<ShigujiluEntity> wrapper);
   	
   	ShigujiluView selectView(@Param("ew") Wrapper<ShigujiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShigujiluEntity> wrapper);
   	

}

