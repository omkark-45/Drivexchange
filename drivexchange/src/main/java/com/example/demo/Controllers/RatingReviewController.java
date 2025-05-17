package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.RatingReview;
import com.example.demo.Services.IRatingReviewService;

@RestController
@RequestMapping("/api/reviews")
@CrossOrigin("*")
public class RatingReviewController {

    @Autowired
    private IRatingReviewService ratingReviewService;

    @PostMapping
    public RatingReview saveReview(@RequestBody RatingReview review) {
        return ratingReviewService.saveReview(review);
    }

    @GetMapping("/car/{carId}")
    public List<RatingReview> getByCar(@PathVariable Long carId) {
        return ratingReviewService.getReviewsByCar(carId);
    }

    @GetMapping("/seller/{sellerId}")
    public List<RatingReview> getBySeller(@PathVariable Long sellerId) {
        return ratingReviewService.getReviewsBySeller(sellerId);
    }
}
