package com.example.demo.Services;

import java.util.List;

import com.example.demo.Model.Notification;

public interface INotificationService {
    Notification saveNotification(Notification notification);
    List<Notification> getNotificationsByUser(Long userId);
}
