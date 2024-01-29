package com.tweteroo.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dtos.TweetDTO;
import com.tweteroo.api.models.TweetModel;
import com.tweteroo.api.services.TweetService;

import jakarta.validation.Valid;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("api/tweets")
public class TweetController {

    final TweetService tweetService;

    TweetController(TweetService tweetService) {
        this.tweetService = tweetService;
    }

    @PostMapping
    public ResponseEntity<TweetModel> createTweet(@RequestBody @Valid TweetDTO body) {
        return new ResponseEntity<>(tweetService.create(body), new HttpHeaders(),
                HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TweetModel>> getTweets() {
        return ResponseEntity.status(HttpStatus.OK).body(tweetService.findAll());
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<List<TweetModel>> getTweetsByUserId(@PathVariable("id") Long id) {
        List<TweetModel> tweets = tweetService.findAllByUserId(id);
        return ResponseEntity.status(HttpStatus.OK).body(tweets);
    }

}
