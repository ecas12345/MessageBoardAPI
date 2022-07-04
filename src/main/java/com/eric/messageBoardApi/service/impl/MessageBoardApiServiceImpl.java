package com.eric.messageBoardApi.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eric.messageBoardApi.MessageBoardRepository;
import com.eric.messageBoardApi.data.messageBoardDb.dao.messagesdb.entity.Messages;
import com.eric.messageBoardApi.service.MessageBoardApiService;

@Component
public class MessageBoardApiServiceImpl implements MessageBoardApiService {
	
	@Autowired MessageBoardRepository messageBoardRepo;
	
	public List<Messages> getAllMessagesByUser(String userid) {
		return messageBoardRepo.findByUser(userid);
	}
	
	public List<Messages> getAllMessages() {
		List<Messages> allPosts = messageBoardRepo.findAll();
		List<Messages> retList = allPosts.stream().sorted(Comparator.comparingInt(Messages::getMessageId)).collect(Collectors.toList());
		return retList;
	}

	public void postMessage(Messages message){
		messageBoardRepo.saveAndFlush(message);
	}
}