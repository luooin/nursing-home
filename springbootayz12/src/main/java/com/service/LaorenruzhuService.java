package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LaorenruzhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LaorenruzhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LaorenruzhuView;


/**
 * 老人入住
 *
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public interface LaorenruzhuService extends IService<LaorenruzhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LaorenruzhuVO> selectListVO(Wrapper<LaorenruzhuEntity> wrapper);
   	
   	LaorenruzhuVO selectVO(@Param("ew") Wrapper<LaorenruzhuEntity> wrapper);
   	
   	List<LaorenruzhuView> selectListView(Wrapper<LaorenruzhuEntity> wrapper);
   	
   	LaorenruzhuView selectView(@Param("ew") Wrapper<LaorenruzhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LaorenruzhuEntity> wrapper);
   	

}

