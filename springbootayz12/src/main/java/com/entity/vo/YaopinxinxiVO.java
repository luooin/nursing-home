package com.entity.vo;

import com.entity.YaopinxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 药品信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public class YaopinxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药品名称
	 */
	
	private String yaopinmingcheng;
		
	/**
	 * 剂型
	 */
	
	private String jixing;
		
	/**
	 * 批次号
	 */
	
	private String picihao;
		
	/**
	 * 生产日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shengchanriqi;
		
	/**
	 * 药品说明
	 */
	
	private String yaopinshuoming;
		
	/**
	 * 生产单位
	 */
	
	private String shengchandanwei;
		
	/**
	 * 药品图片
	 */
	
	private String yaopintupian;
		
	/**
	 * 药品价格
	 */
	
	private Float yaopinjiage;
				
	
	/**
	 * 设置：药品名称
	 */
	 
	public void setYaopinmingcheng(String yaopinmingcheng) {
		this.yaopinmingcheng = yaopinmingcheng;
	}
	
	/**
	 * 获取：药品名称
	 */
	public String getYaopinmingcheng() {
		return yaopinmingcheng;
	}
				
	
	/**
	 * 设置：剂型
	 */
	 
	public void setJixing(String jixing) {
		this.jixing = jixing;
	}
	
	/**
	 * 获取：剂型
	 */
	public String getJixing() {
		return jixing;
	}
				
	
	/**
	 * 设置：批次号
	 */
	 
	public void setPicihao(String picihao) {
		this.picihao = picihao;
	}
	
	/**
	 * 获取：批次号
	 */
	public String getPicihao() {
		return picihao;
	}
				
	
	/**
	 * 设置：生产日期
	 */
	 
	public void setShengchanriqi(Date shengchanriqi) {
		this.shengchanriqi = shengchanriqi;
	}
	
	/**
	 * 获取：生产日期
	 */
	public Date getShengchanriqi() {
		return shengchanriqi;
	}
				
	
	/**
	 * 设置：药品说明
	 */
	 
	public void setYaopinshuoming(String yaopinshuoming) {
		this.yaopinshuoming = yaopinshuoming;
	}
	
	/**
	 * 获取：药品说明
	 */
	public String getYaopinshuoming() {
		return yaopinshuoming;
	}
				
	
	/**
	 * 设置：生产单位
	 */
	 
	public void setShengchandanwei(String shengchandanwei) {
		this.shengchandanwei = shengchandanwei;
	}
	
	/**
	 * 获取：生产单位
	 */
	public String getShengchandanwei() {
		return shengchandanwei;
	}
				
	
	/**
	 * 设置：药品图片
	 */
	 
	public void setYaopintupian(String yaopintupian) {
		this.yaopintupian = yaopintupian;
	}
	
	/**
	 * 获取：药品图片
	 */
	public String getYaopintupian() {
		return yaopintupian;
	}
				
	
	/**
	 * 设置：药品价格
	 */
	 
	public void setYaopinjiage(Float yaopinjiage) {
		this.yaopinjiage = yaopinjiage;
	}
	
	/**
	 * 获取：药品价格
	 */
	public Float getYaopinjiage() {
		return yaopinjiage;
	}
			
}
