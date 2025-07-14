package com.test.domain;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardVO {

	private int bno;
	private String name;
	private String title;
	private String content;
	private Date regiDate;
	private Date updaDate;
	
	
}
