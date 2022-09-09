package com.vthinkDynamics.couponMicroService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vthinkDynamics.couponMicroService.Repos.CouponRepo;
import com.vthinkDynamics.couponMicroService.model.Coupon;

@RestController
@RequestMapping("/couponapi")
public class CouponRestController {
	
	@Autowired
	CouponRepo Repos;
	
	@PostMapping(path = "/coupons")
	public Coupon CreateCoupon(@RequestBody Coupon coupon)
	{
		return Repos.save(coupon);
	}
	
	@GetMapping(path = "/coupons/{code}")
	public Coupon getCoupon(@PathVariable String code)
	{
		return Repos.findAllByCode(code);
	}

}
