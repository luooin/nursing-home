package com.entity.view;

import com.entity.MeiyuecanyinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 每月餐饮
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
@TableName("meiyuecanyin")
public class MeiyuecanyinView  extends MeiyuecanyinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeiyuecanyinView(){
	}
 
 	public MeiyuecanyinView(MeiyuecanyinEntity meiyuecanyinEntity){
 	try {
			BeanUtils.copyProperties(this, meiyuecanyinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
