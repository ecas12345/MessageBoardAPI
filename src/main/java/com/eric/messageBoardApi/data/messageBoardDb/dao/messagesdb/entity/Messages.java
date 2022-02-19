package com.eric.messageBoardApi.data.messageBoardDb.dao.messagesdb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "messages", schema="public")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Messages {
	
	@Id
	@Column(name="messageid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer messageid;

	@Column(name="userid")
	private String userid;
	
	@Column(name="title")
	private String title;
	
	@Column(name="message")
	private String message;
	
	public Integer getMessageId() {
		return this.messageid;
	}
	
	public String getUserid() {
		return this.userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
