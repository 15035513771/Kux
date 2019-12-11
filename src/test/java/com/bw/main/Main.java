package com.bw.main;

import java.util.Date;

import org.junit.Test;

import com.bw.utils.DateUtils;

public class Main {

	
	/**
	 * 
	 * 根据传入的日期获取年龄*/
	  @Test
	  public void test1(){
		  int age = DateUtils.getAge("1999-10-10");
		  System.out.println(age);
	  }
	  
	  
	  /**
	   * 根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	   * */
	  @Test
	  public void test2(){
		  Date date = DateUtils.getMonthBegin(new Date());
		  String format = DateUtils.getDateFormat(date);
		  System.out.println(format);
	  }
	  
	  /**
	   * 根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	   * */
	  @Test
	  public void test3(){
		  Date date = DateUtils.getMonthEnd(new Date());
		  String format = DateUtils.getDateFormat(date);
		  System.out.println(format);
	  }
	  
	  
	  /**
	   * 求未来日期离今天还剩的天数
	   * */
	  @Test
	  public void test4(){
		  int i = DateUtils.getDaysByFuture(DateUtils.getDateFormat("2019-12-30"));
		  
		  System.out.println(i);
	  }
	  
	  /**
	   * ：求过去日期离今天过去的天数
	   * */
	  
	  @Test
	  public void test5(){
		  int i = DateUtils.getDaysByDeparted(DateUtils.getDateFormat("2018-12-11"));
		  System.out.println(i);
	  }
	    
	  
	  
	  
}
