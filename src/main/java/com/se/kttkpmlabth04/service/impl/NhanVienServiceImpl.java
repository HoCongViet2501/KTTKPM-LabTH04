package com.se.kttkpmlabth04.service.impl;

import com.se.kttkpmlabth04.entity.Nhanvien;
import com.se.kttkpmlabth04.repository.NhanVienRepository;
import com.se.kttkpmlabth04.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImpl implements NhanVienService {
    
    @Autowired
    private NhanVienRepository nhanVienRepository;
    
    @Override
    public List<Nhanvien> cau2(double luong) {
        return this.nhanVienRepository.getAllByLuongLessThan(luong);
    }
}
