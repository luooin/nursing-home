package com.entity.model;

import com.entity.FangjianziliaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 房间资料
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public class FangjianziliaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 楼房名称
	 */
	
	private String loufangmingcheng;
		
	/**
	 * 房间面积
	 */
	
	private String fangjianmianji;
		
	/**
	 * 房间设施
	 */
	
	private String fangjiansheshi;
		
	/**
	 * 房间图片
	 */
	
	private String fangjiantupian;
				
	
	/**
	 * 设置：楼房名称
	 */
	 
	public void setLoufangmingcheng(String loufangmingcheng) {
		this.loufangmingcheng = loufangmingcheng;
	}
	
	/**
	 * 获取：楼房名称
	 */
	public String getLoufangmingcheng() {
		return loufangmingcheng;
	}
				
	
	/**
	 * 设置：房间面积
	 */
	 
	public void setFangjianmianji(String fangjianmianji) {
		this.fangjianmianji = fangjianmianji;
	}
	
	/**
	 * 获取：房间面积
	 */
	public String getFangjianmianji() {
		return fangjianmianji;
	}
				
	
	/**
	 * 设置：房间设施
	 */
	 
	public void setFangjiansheshi(String fangjiansheshi) {
		this.fangjiansheshi = fangjiansheshi;
	}
	
	/**
	 * 获取：房间设施
	 */
	public String getFangjiansheshi() {
		return fangjiansheshi;
	}
				
	
	/**
	 * 设置：房间图片
	 */
	 
	public void setFangjiantupian(String fangjiantupian) {
		this.fangjiantupian = fangjiantupian;
	}
	
	/**
	 * 获取：房间图片
	 */
	public String getFangjiantupian() {
		return fangjiantupian;
	}
			
}
