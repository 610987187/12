package com.itmayiedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmayiedu.service.OrderMemberService;

@RestController
public class OrderController {
	@Autowired
	private OrderMemberService orderMemberService;

	@RequestMapping("/getOrderUserAll")
	public List<String> getOrderUserAll() {
		System.out.println("订单服务开始调用会员服务");
		return orderMemberService.getOrderUserAll();
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println("bbbbbbbbbbbbbbbbbbbbb");
		System.out.println("111111111111");
		System.out.println("222222222222222");
		System.out.println("4444444444444444444");
		System.out.println("7777777777777777777777777777777");


	}

}
