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
 * 事故记录
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
@TableName("shigujilu")
public class ShigujiluEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShigujiluEntity() {
		
	}
	
	public ShigujiluEntity(T t) {
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
	 * 事故名称
	 */
					
	private String shigumingcheng;
	
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
	 * 设置：事故名称
	 */
	public void setShigumingcheng(String shigumingcheng) {
		this.shigumingcheng = shigumingcheng;
	}
	/**
	 * 获取：事故名称
	 */
	public String getShigumingcheng() {
		return shigumingcheng;
	}
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
