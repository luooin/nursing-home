package com.entity.view;

import com.entity.FangjianziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 房间资料
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
@TableName("fangjianziliao")
public class FangjianziliaoView  extends FangjianziliaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FangjianziliaoView(){
	}
 
 	public FangjianziliaoView(FangjianziliaoEntity fangjianziliaoEntity){
 	try {
			BeanUtils.copyProperties(this, fangjianziliaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
