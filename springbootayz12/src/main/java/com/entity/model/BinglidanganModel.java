package com.entity.model;

import com.entity.BinglidanganEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 病历档案
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public class BinglidanganModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 药物过敏史
	 */
	
	private String yaowuguominshi;
		
	/**
	 * 家族遗传史
	 */
	
	private String jiazuyichuanshi;
		
	/**
	 * 身体情况
	 */
	
	private String shentiqingkuang;
		
	/**
	 * 护工工号
	 */
	
	private String hugonggonghao;
		
	/**
	 * 护工姓名
	 */
	
	private String hugongxingming;
		
	/**
	 * 添加时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tianjiashijian;
		
	/**
	 * 现病史
	 */
	
	private String xianbingshi;
		
	/**
	 * 既往史
	 */
	
	private String jiwangshi;
		
	/**
	 * 家族史
	 */
	
	private String jiazushi;
		
	/**
	 * 家属账号
	 */
	
	private String jiashuzhanghao;
		
	/**
	 * 家属姓名
	 */
	
	private String jiashuxingming;
				
	
	/**
	 * 设置：药物过敏史
	 */
	 
	public void setYaowuguominshi(String yaowuguominshi) {
		this.yaowuguominshi = yaowuguominshi;
	}
	
	/**
	 * 获取：药物过敏史
	 */
	public String getYaowuguominshi() {
		return yaowuguominshi;
	}
				
	
	/**
	 * 设置：家族遗传史
	 */
	 
	public void setJiazuyichuanshi(String jiazuyichuanshi) {
		this.jiazuyichuanshi = jiazuyichuanshi;
	}
	
	/**
	 * 获取：家族遗传史
	 */
	public String getJiazuyichuanshi() {
		return jiazuyichuanshi;
	}
				
	
	/**
	 * 设置：身体情况
	 */
	 
	public void setShentiqingkuang(String shentiqingkuang) {
		this.shentiqingkuang = shentiqingkuang;
	}
	
	/**
	 * 获取：身体情况
	 */
	public String getShentiqingkuang() {
		return shentiqingkuang;
	}
				
	
	/**
	 * 设置：护工工号
	 */
	 
	public void setHugonggonghao(String hugonggonghao) {
		this.hugonggonghao = hugonggonghao;
	}
	
	/**
	 * 获取：护工工号
	 */
	public String getHugonggonghao() {
		return hugonggonghao;
	}
				
	
	/**
	 * 设置：护工姓名
	 */
	 
	public void setHugongxingming(String hugongxingming) {
		this.hugongxingming = hugongxingming;
	}
	
	/**
	 * 获取：护工姓名
	 */
	public String getHugongxingming() {
		return hugongxingming;
	}
				
	
	/**
	 * 设置：添加时间
	 */
	 
	public void setTianjiashijian(Date tianjiashijian) {
		this.tianjiashijian = tianjiashijian;
	}
	
	/**
	 * 获取：添加时间
	 */
	public Date getTianjiashijian() {
		return tianjiashijian;
	}
				
	
	/**
	 * 设置：现病史
	 */
	 
	public void setXianbingshi(String xianbingshi) {
		this.xianbingshi = xianbingshi;
	}
	
	/**
	 * 获取：现病史
	 */
	public String getXianbingshi() {
		return xianbingshi;
	}
				
	
	/**
	 * 设置：既往史
	 */
	 
	public void setJiwangshi(String jiwangshi) {
		this.jiwangshi = jiwangshi;
	}
	
	/**
	 * 获取：既往史
	 */
	public String getJiwangshi() {
		return jiwangshi;
	}
				
	
	/**
	 * 设置：家族史
	 */
	 
	public void setJiazushi(String jiazushi) {
		this.jiazushi = jiazushi;
	}
	
	/**
	 * 获取：家族史
	 */
	public String getJiazushi() {
		return jiazushi;
	}
				
	
	/**
	 * 设置：家属账号
	 */
	 
	public void setJiashuzhanghao(String jiashuzhanghao) {
		this.jiashuzhanghao = jiashuzhanghao;
	}
	
	/**
	 * 获取：家属账号
	 */
	public String getJiashuzhanghao() {
		return jiashuzhanghao;
	}
				
	
	/**
	 * 设置：家属姓名
	 */
	 
	public void setJiashuxingming(String jiashuxingming) {
		this.jiashuxingming = jiashuxingming;
	}
	
	/**
	 * 获取：家属姓名
	 */
	public String getJiashuxingming() {
		return jiashuxingming;
	}
			
}
