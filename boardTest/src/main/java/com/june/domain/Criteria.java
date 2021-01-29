package com.june.domain;

import lombok.Data;

@Data
public class Criteria {

	private int pageNum;
	private int amount;
	
	private String type;
	private String keyword;
}
