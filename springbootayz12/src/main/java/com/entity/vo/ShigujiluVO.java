package com.entity.vo;

import com.entity.ShigujiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 事故记录
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public class ShigujiluVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 事故地点
	 */
	
	private String shigudidian;
		
	/**
	 * 事故原因
	 */
	
	private String shiguyuanyin;
		
	/**
	 * 严重性
	 */
	
	private String yanzhongxing;
		
	/**
	 * 事故时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shigushijian;
				
	
	/**
	 * 设置：事故地点
	 */
	 
	public void setShigudidian(String shigudidian) {
		this.shigudidian = shigudidian;
	}
	
	/**
	 * 获取：事故地点
	 */
	public String getShigudidian() {
		return shigudidian;
	}
				
	
	/**
	 * 设置：事故原因
	 */
	 
	public void setShiguyuanyin(String shiguyuanyin) {
		this.shiguyuanyin = shiguyuanyin;
	}
	
	/**
	 * 获取：事故原因
	 */
	public String getShiguyuanyin() {
		return shiguyuanyin;
	}
				
	
	/**
	 * 设置：严重性
	 */
	 
	public void setYanzhongxing(String yanzhongxing) {
		this.yanzhongxing = yanzhongxing;
	}
	
	/**
	 * 获取：严重性
	 */
	public String getYanzhongxing() {
		return yanzhongxing;
	}
				
	
	/**
	 * 设置：事故时间
	 */
	 
	public void setShigushijian(Date shigushijian) {
		this.shigushijian = shigushijian;
	}
	
	/**
	 * 获取：事故时间
	 */
	public Date getShigushijian() {
		return shigushijian;
	}
			
}
