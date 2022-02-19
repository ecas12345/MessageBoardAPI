package com.eric.messageBoardApi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.eric.messageBoardApi.data.messageBoardDb.dao.messagesdb.entity.Messages;

public interface MessageBoardRepository extends JpaRepository<Messages, String> {

}
