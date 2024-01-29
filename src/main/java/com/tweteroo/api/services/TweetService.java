package com.tweteroo.api.services;

import org.springframework.stereotype.Service;

import com.tweteroo.api.dtos.TweetDTO;
import com.tweteroo.api.models.TweetModel;
import com.tweteroo.api.repositories.TweetRepository;

@Service
public class TweetService {
    final TweetRepository tweetRepository;

    TweetService(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    public TweetModel create(TweetDTO dto) {
        TweetModel tweet = new TweetModel(dto);
        return tweetRepository.save(tweet);
    }
}
