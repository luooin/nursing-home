package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeiyuecanyinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeiyuecanyinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeiyuecanyinView;


/**
 * 每月餐饮
 *
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public interface MeiyuecanyinService extends IService<MeiyuecanyinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeiyuecanyinVO> selectListVO(Wrapper<MeiyuecanyinEntity> wrapper);
   	
   	MeiyuecanyinVO selectVO(@Param("ew") Wrapper<MeiyuecanyinEntity> wrapper);
   	
   	List<MeiyuecanyinView> selectListView(Wrapper<MeiyuecanyinEntity> wrapper);
   	
   	MeiyuecanyinView selectView(@Param("ew") Wrapper<MeiyuecanyinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeiyuecanyinEntity> wrapper);
   	

}

