package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BinglidanganEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BinglidanganVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BinglidanganView;


/**
 * 病历档案
 *
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public interface BinglidanganService extends IService<BinglidanganEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BinglidanganVO> selectListVO(Wrapper<BinglidanganEntity> wrapper);
   	
   	BinglidanganVO selectVO(@Param("ew") Wrapper<BinglidanganEntity> wrapper);
   	
   	List<BinglidanganView> selectListView(Wrapper<BinglidanganEntity> wrapper);
   	
   	BinglidanganView selectView(@Param("ew") Wrapper<BinglidanganEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BinglidanganEntity> wrapper);
   	

}

