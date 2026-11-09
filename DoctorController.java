package com.example.hospital.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    // 1. Lấy danh sách toàn bộ bác sĩ
    @GetMapping
    public String getAllDoctors() {
        return "Lấy danh sách toàn bộ bác sĩ";
    }

    // 2. Lấy thông tin chi tiết một bác sĩ theo ID
    @GetMapping("/{id}")
    public String getDoctorById(@PathVariable Long id) {
        return "Lấy thông tin bác sĩ có ID: " + id;
    }

    // 3. Thêm mới một bác sĩ
    @PostMapping
    public String createDoctor(@RequestBody String doctorData) {
        return "Thêm mới bác sĩ thành công";
    }

    // 4. Cập nhật thông tin bác sĩ
    @PutMapping("/{id}")
    public String updateDoctor(@PathVariable Long id, @RequestBody String doctorData) {
        return "Cập nhật thông tin bác sĩ có ID: " + id;
    }

    // 5. Xóa bác sĩ khỏi hệ thống
    @DeleteMapping("/{id}")
    public String deleteDoctor(@PathVariable Long id) {
        return "Xóa bác sĩ có ID: " + id;
    }
}