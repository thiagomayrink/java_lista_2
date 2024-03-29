package com.tweteroo.api.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.tweteroo.api.dtos.TweetDTO;
import com.tweteroo.api.models.TweetModel;
import com.tweteroo.api.models.UserModel;
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

    public List<TweetModel> findAll() {
        return tweetRepository.findAll();
    }

    public List<TweetModel> findAllByUserId(Long id) {
        UserModel user = new UserModel();
        user.setId(id);
        return tweetRepository.findAllByUser(user);
    }
}
