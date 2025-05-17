package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Notification;

public interface NotificationRepo extends JpaRepository<Notification, Long> {
    List<Notification> findByUserUserId(Long userId);
}
