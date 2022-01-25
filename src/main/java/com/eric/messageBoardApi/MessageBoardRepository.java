package com.eric.messageBoardApi;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eric.messageBoardApi.data.Post;


@Repository
public interface MessageBoardRepository extends MongoRepository<Post, String> {
	
}
