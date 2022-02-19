package com.eric.messageBoardApi.service;

import java.util.List;
import java.util.Optional;

import com.eric.messageBoardApi.data.messageBoardDb.dao.messagesdb.entity.Messages;

public interface MessageBoardApiService {
	
	public List<Messages> getAllMessagesByUser(String userid);
	
	public List<Messages> getAllMessages();
	
	public void postMessage(Messages message);

}
