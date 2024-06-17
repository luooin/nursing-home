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
 * 护工
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
@TableName("hugong")
public class HugongEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HugongEntity() {
		
	}
	
	public HugongEntity(T t) {
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
	 * 护工工号
	 */
					
	private String hugonggonghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 护工姓名
	 */
					
	private String hugongxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 护工照片
	 */
					
	private String hugongzhaopian;
	
	/**
	 * 年龄
	 */
					
	private Integer nianling;
	
	/**
	 * 护工电话
	 */
					
	private String hugongdianhua;
	
	/**
	 * 民族
	 */
					
	private String minzu;
	
	/**
	 * 学历
	 */
					
	private String xueli;
	
	/**
	 * 婚否
	 */
					
	private String hunfou;
	
	/**
	 * 护理级别
	 */
					
	private String hulijibie;
	
	
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
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：护工照片
	 */
	public void setHugongzhaopian(String hugongzhaopian) {
		this.hugongzhaopian = hugongzhaopian;
	}
	/**
	 * 获取：护工照片
	 */
	public String getHugongzhaopian() {
		return hugongzhaopian;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
	/**
	 * 设置：护工电话
	 */
	public void setHugongdianhua(String hugongdianhua) {
		this.hugongdianhua = hugongdianhua;
	}
	/**
	 * 获取：护工电话
	 */
	public String getHugongdianhua() {
		return hugongdianhua;
	}
	/**
	 * 设置：民族
	 */
	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}
	/**
	 * 获取：民族
	 */
	public String getMinzu() {
		return minzu;
	}
	/**
	 * 设置：学历
	 */
	public void setXueli(String xueli) {
		this.xueli = xueli;
	}
	/**
	 * 获取：学历
	 */
	public String getXueli() {
		return xueli;
	}
	/**
	 * 设置：婚否
	 */
	public void setHunfou(String hunfou) {
		this.hunfou = hunfou;
	}
	/**
	 * 获取：婚否
	 */
	public String getHunfou() {
		return hunfou;
	}
	/**
	 * 设置：护理级别
	 */
	public void setHulijibie(String hulijibie) {
		this.hulijibie = hulijibie;
	}
	/**
	 * 获取：护理级别
	 */
	public String getHulijibie() {
		return hulijibie;
	}

}
