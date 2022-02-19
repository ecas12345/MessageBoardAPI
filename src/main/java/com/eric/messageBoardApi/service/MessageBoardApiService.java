package com.eric.messageBoardApi.service;

import java.util.List;

import com.eric.messageBoardApi.data.messageBoardDb.dao.messagesdb.entity.Messages;

public interface MessageBoardApiService {
	
	public void postMessage(Messages message);

}
