package com.thc.realspr.mapper;

import com.thc.realspr.dto.TbuserDto;

import java.util.List;

public interface TbuserMapper {
	TbuserDto.TbuserSelectDto detail(String id);
	List<TbuserDto.TbuserSelectDto> list();
}