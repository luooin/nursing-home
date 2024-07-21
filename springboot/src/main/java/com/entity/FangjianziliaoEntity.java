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
 * 房间资料
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
@TableName("fangjianziliao")
public class FangjianziliaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangjianziliaoEntity() {
		
	}
	
	public FangjianziliaoEntity(T t) {
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
	 * 房间号
	 */
					
	private String fangjianhao;
	
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
	 * 设置：房间号
	 */
	public void setFangjianhao(String fangjianhao) {
		this.fangjianhao = fangjianhao;
	}
	/**
	 * 获取：房间号
	 */
	public String getFangjianhao() {
		return fangjianhao;
	}
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
