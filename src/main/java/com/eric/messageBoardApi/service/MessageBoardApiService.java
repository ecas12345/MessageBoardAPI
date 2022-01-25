package com.eric.messageBoardApi.service;

import java.util.List;

import com.eric.messageBoardApi.data.Post;

public interface MessageBoardApiService {
	
	public List<Post> postMessage(Post post);

}
