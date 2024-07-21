package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 病历档案
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
@TableName("binglidangan")
public class BinglidanganEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BinglidanganEntity() {
		
	}
	
	public BinglidanganEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 老人姓名
	 */
					
	private String laorenxingming;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：老人姓名
	 */
	public void setLaorenxingming(String laorenxingming) {
		this.laorenxingming = laorenxingming;
	}
	/**
	 * 获取：老人姓名
	 */
	public String getLaorenxingming() {
		return laorenxingming;
	}
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
