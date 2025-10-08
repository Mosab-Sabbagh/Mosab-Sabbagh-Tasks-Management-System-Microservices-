/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report_service.report_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

import java.util.*;

/**
 *
 * @author hp
 */
@Service
public class ReportService  {
    @Autowired
    private RestTemplate restTemplate;

    private final String TASK_SERVICE_URL = "http://localhost:8082/tasks"; // رابط TaskService

    public List<Map<String, Object>> getTasksReport() {
        ResponseEntity<List> response = restTemplate.getForEntity(TASK_SERVICE_URL, List.class);
        List<Map<String, Object>> tasks = response.getBody();

        Map<Long, Map<String, Object>> report = new HashMap<>();

        for (Map<String, Object> task : tasks) {
            Long userId = Long.valueOf(task.get("userId").toString());
            String status = task.get("status").toString(); // فرض: Pending / Completed

            report.putIfAbsent(userId, new HashMap<>());
            Map<String, Object> userStats = report.get(userId);

            userStats.put("userId", userId);
            userStats.put("totalTasks", ((int)userStats.getOrDefault("totalTasks", 0)) + 1);
            if (status.equals("Completed")) {
                userStats.put("completedTasks", ((int)userStats.getOrDefault("completedTasks", 0)) + 1);
            } else {
                userStats.put("pendingTasks", ((int)userStats.getOrDefault("pendingTasks", 0)) + 1);
            }
        }

        return new ArrayList<>(report.values());
    }
}
