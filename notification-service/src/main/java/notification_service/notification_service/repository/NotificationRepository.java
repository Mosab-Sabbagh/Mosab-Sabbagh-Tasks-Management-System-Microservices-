/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package notification_service.notification_service.repository;

import java.util.List;
import notification_service.notification_service.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author hp
 */
public interface NotificationRepository extends JpaRepository<Notification, Long> {
        List<Notification> findByUserId(Long userId);
}
