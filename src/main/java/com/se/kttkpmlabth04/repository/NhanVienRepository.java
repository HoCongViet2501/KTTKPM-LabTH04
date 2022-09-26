package com.se.kttkpmlabth04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.se.kttkpmlabth04.entity.Nhanvien;

import java.util.List;

@Repository
public interface NhanVienRepository extends JpaRepository<Nhanvien, String> {
    List<Nhanvien> getAllByLuongLessThan(double luong);
}
