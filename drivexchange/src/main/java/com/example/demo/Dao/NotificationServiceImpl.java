package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Notification;
import com.example.demo.Repo.NotificationRepo;
import com.example.demo.Services.INotificationService;

@Service
public class NotificationServiceImpl implements INotificationService {

    @Autowired
    private NotificationRepo notificationRepository;

    @Override
    public Notification saveNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public List<Notification> getNotificationsByUser(Long userId) {
        return notificationRepository.findByUserUserId(userId);
    }
}
