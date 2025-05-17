package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.RatingReview;

public interface RatingReviewRepo extends JpaRepository<RatingReview, Long> {
    List<RatingReview> findBySellerUserId(Long sellerId);
    List<RatingReview> findByCarCarId(Long carId);
}
