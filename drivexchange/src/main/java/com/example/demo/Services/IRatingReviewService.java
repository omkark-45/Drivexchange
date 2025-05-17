package com.example.demo.Services;

import java.util.List;

import com.example.demo.Model.RatingReview;

public interface IRatingReviewService {
    RatingReview saveReview(RatingReview review);
    List<RatingReview> getReviewsByCar(Long carId);
    List<RatingReview> getReviewsBySeller(Long sellerId);
}
