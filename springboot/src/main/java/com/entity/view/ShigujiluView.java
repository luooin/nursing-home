package com.entity.view;

import com.entity.ShigujiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 事故记录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
@TableName("shigujilu")
public class ShigujiluView  extends ShigujiluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShigujiluView(){
	}
 
 	public ShigujiluView(ShigujiluEntity shigujiluEntity){
 	try {
			BeanUtils.copyProperties(this, shigujiluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
