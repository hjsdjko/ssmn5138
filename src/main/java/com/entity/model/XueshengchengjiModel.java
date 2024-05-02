package com.entity.model;

import com.entity.XueshengchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学生成绩
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-12 14:30:11
 */
public class XueshengchengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 作业图片
	 */
	
	private String zuoyetupian;
		
	/**
	 * 学生成绩
	 */
	
	private Integer xueshengchengji;
		
	/**
	 * 评级
	 */
	
	private String pingji;
		
	/**
	 * 评语
	 */
	
	private String pingyu;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：作业图片
	 */
	 
	public void setZuoyetupian(String zuoyetupian) {
		this.zuoyetupian = zuoyetupian;
	}
	
	/**
	 * 获取：作业图片
	 */
	public String getZuoyetupian() {
		return zuoyetupian;
	}
				
	
	/**
	 * 设置：学生成绩
	 */
	 
	public void setXueshengchengji(Integer xueshengchengji) {
		this.xueshengchengji = xueshengchengji;
	}
	
	/**
	 * 获取：学生成绩
	 */
	public Integer getXueshengchengji() {
		return xueshengchengji;
	}
				
	
	/**
	 * 设置：评级
	 */
	 
	public void setPingji(String pingji) {
		this.pingji = pingji;
	}
	
	/**
	 * 获取：评级
	 */
	public String getPingji() {
		return pingji;
	}
				
	
	/**
	 * 设置：评语
	 */
	 
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
			
}
