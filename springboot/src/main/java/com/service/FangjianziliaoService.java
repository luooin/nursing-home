package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangjianziliaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangjianziliaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangjianziliaoView;


/**
 * 房间资料
 *
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public interface FangjianziliaoService extends IService<FangjianziliaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangjianziliaoVO> selectListVO(Wrapper<FangjianziliaoEntity> wrapper);
   	
   	FangjianziliaoVO selectVO(@Param("ew") Wrapper<FangjianziliaoEntity> wrapper);
   	
   	List<FangjianziliaoView> selectListView(Wrapper<FangjianziliaoEntity> wrapper);
   	
   	FangjianziliaoView selectView(@Param("ew") Wrapper<FangjianziliaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangjianziliaoEntity> wrapper);
   	

}

