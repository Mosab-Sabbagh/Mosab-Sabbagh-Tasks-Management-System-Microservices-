/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report_service.report_service.controller;
//import com.example.report.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import report_service.report_service.service.ReportService;


/**
 *
 * @author hp
 */
@RestController
@RequestMapping("/reports")
public class ReportController {
    @Autowired
    private ReportService reportService;

    // تقرير المهام لكل مستخدم
    @GetMapping("/tasks")
    public ResponseEntity<List<Map<String, Object>>> getTasksReport() {
        return ResponseEntity.ok(reportService.getTasksReport());
    }
}
