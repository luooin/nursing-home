package com.entity.vo;

import com.entity.ChuangweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 床位
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-21 21:37:25
 */
public class ChuangweiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 楼房名称
	 */
	
	private String loufangmingcheng;
		
	/**
	 * 床位号
	 */
	
	private String chuangweihao;
		
	/**
	 * 床位状态
	 */
	
	private String chuangweizhuangtai;
				
	
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
	 * 设置：床位号
	 */
	 
	public void setChuangweihao(String chuangweihao) {
		this.chuangweihao = chuangweihao;
	}
	
	/**
	 * 获取：床位号
	 */
	public String getChuangweihao() {
		return chuangweihao;
	}
				
	
	/**
	 * 设置：床位状态
	 */
	 
	public void setChuangweizhuangtai(String chuangweizhuangtai) {
		this.chuangweizhuangtai = chuangweizhuangtai;
	}
	
	/**
	 * 获取：床位状态
	 */
	public String getChuangweizhuangtai() {
		return chuangweizhuangtai;
	}
			
}
