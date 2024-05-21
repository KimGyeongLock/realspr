package com.thc.realspr.service;

import com.thc.realspr.dto.TbuserDto;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface TbuserService {
    /*
    public Map<String, Object> create(Map<String, Object> param);
    public Map<String, Object> get(String id);
    public Map<String, Object> update(Map<String, Object> param);
    */
    public TbuserDto.TbuserAfterCreateDto create(TbuserDto.TbuserCreateDto param);
    public TbuserDto.TbuserAfterCreateDto update(TbuserDto.TbuserUpdateDto param);
    public TbuserDto.TbuserSelectDto get(String id);
}
