package com.eric.messageBoardApi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.eric.messageBoardApi.data.Post;
import com.eric.messageBoardApi.service.MessageBoardApiService;

@Component
public class MessageBoardApiServiceImpl implements MessageBoardApiService {

	public List<Post> postMessage(Post post){
		List<Post> returnPosts = new ArrayList<Post>();
		return returnPosts;
	}
}
