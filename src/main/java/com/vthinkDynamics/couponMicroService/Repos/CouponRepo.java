package com.vthinkDynamics.couponMicroService.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vthinkDynamics.couponMicroService.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long>{

	Coupon findAllByCode(String code);

}
