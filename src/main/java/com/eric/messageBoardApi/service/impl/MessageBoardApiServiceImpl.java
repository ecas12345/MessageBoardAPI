package com.eric.messageBoardApi.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		return messageBoardRepo.findAll();
	}

	public void postMessage(Messages message){
		messageBoardRepo.saveAndFlush(message);
	}
}