package com.eric.messageBoardApi;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.eric.messageBoardApi.data.messageBoardDb.dao.messagesdb.entity.Messages;

@Component
public interface MessageBoardRepository extends JpaRepository<Messages, String> {
	
	@Query(value = "Select * from messages m where m.userid = ?1", nativeQuery = true)
	public List<Messages> findByUser(String userid);
}
