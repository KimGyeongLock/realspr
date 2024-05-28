package com.thc.realspr.controller;

import com.thc.realspr.dto.TbpostDto;
import com.thc.realspr.service.TbpostService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/tbpost")
@RestController
public class TbpostRestController {

    private final TbpostService tbpostService;
    public TbpostRestController(
            TbpostService tbpostService
    ) {
        this.tbpostService = tbpostService;
    }

    @PostMapping("")
    public ResponseEntity<TbpostDto.CreateResDto> create(@RequestBody TbpostDto.CreateReqDto param){
        System.out.println("param : " + param);
        return ResponseEntity.status(HttpStatus.CREATED).body(tbpostService.create(param));
    }
    @PutMapping("")
    public ResponseEntity<TbpostDto.CreateResDto> update(@RequestBody TbpostDto.UpdateReqDto param){
        System.out.println(param);
        return ResponseEntity.status(HttpStatus.OK).body(tbpostService.update(param));
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<TbpostDto.SelectResDto> detail(@PathVariable("id") String id){
        System.out.println(id);
        return ResponseEntity.status(HttpStatus.OK).body(tbpostService.get(id));
    }
    @GetMapping("/list")
    public ResponseEntity<List<TbpostDto.SelectResDto>> list(@Valid TbpostDto.ListReqDto param){
        return ResponseEntity.status(HttpStatus.OK).body(tbpostService.list(param));
    }

    @GetMapping("/plist")
    public ResponseEntity<TbpostDto.PagedListResDto> plist(@Valid TbpostDto.PagedListReqDto param){
        return ResponseEntity.status(HttpStatus.OK).body(tbpostService.pagedlist(param));
    }
}
