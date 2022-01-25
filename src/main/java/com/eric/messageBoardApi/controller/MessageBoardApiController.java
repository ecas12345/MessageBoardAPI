package com.eric.messageBoardApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eric.messageBoardApi.data.Post;
import com.eric.messageBoardApi.service.MessageBoardApiService;

@RestController
@RequestMapping("api/v1/Forum")
public class MessageBoardApiController {
	
	@Autowired
	MessageBoardApiService mbaService;

	@CrossOrigin
	@GetMapping("/AllPosts")
	public String fetchPosts () {
		return "Fetching Posts...";
	}
	
	@CrossOrigin
	@PostMapping("/PostMessage")
	public List<Post> postMessage (
			@RequestBody Post post) {
		return this.mbaService.postMessage(post);
	}


}
