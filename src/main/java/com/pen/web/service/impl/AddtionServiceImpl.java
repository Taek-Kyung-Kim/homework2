package com.pen.web.service.impl;

import org.springframework.stereotype.Service;

import com.pen.web.service.AddtionService;

@Service("AddtionService")
public class AddtionServiceImpl implements AddtionService {
	public int AddSum(int num1, int num2){
		int sum = num1 + num2;
		return sum;
	}
}
