package com.se.kttkpmlabth04.controller;

import com.se.kttkpmlabth04.service.MayBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/maybay/")
public class MayBayController {
    @Autowired
    private MayBayService mayBayService;
    
    @GetMapping("/cau2/{tamBay}")
    public ResponseEntity<Object> cau2(@PathVariable int tamBay) {
        return ResponseEntity.ok().body(this.mayBayService.cau2(tamBay));
    }
    
    @GetMapping("/cau7/{loai}")
    public ResponseEntity<Object> cau7(@PathVariable String loai) {
        return ResponseEntity.ok().body(this.mayBayService.cau7(loai));
    }
}
