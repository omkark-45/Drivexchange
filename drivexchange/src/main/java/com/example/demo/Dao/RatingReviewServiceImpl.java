package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.RatingReview;
import com.example.demo.Repo.RatingReviewRepo;
import com.example.demo.Services.IRatingReviewService;

@Service
public class RatingReviewServiceImpl implements IRatingReviewService {

    @Autowired
    private RatingReviewRepo ratingReviewRepository;

    @Override
    public RatingReview saveReview(RatingReview review) {
        return ratingReviewRepository.save(review);
    }

    @Override
    public List<RatingReview> getReviewsByCar(Long carId) {
        return ratingReviewRepository.findByCarCarId(carId);
    }

    @Override
    public List<RatingReview> getReviewsBySeller(Long sellerId) {
        return ratingReviewRepository.findBySellerUserId(sellerId);
    }
}
