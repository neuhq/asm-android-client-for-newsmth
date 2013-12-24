package com.athena.asm.data;

import java.io.Serializable;

public class Subject implements Serializable {
	private static final long serialVersionUID = 7351647738651826553L;
	public static final String TYPE_BOTTOM = "d"; // 置底所包含的标记字符
	private String subjectID;
	private String topicSubjectID;
	private String title;
	private String author;
	private String replies = "";
	private String boardID;
	private String boardEngName;
	private String boardChsName;
	//private Date date;
	private String dateString;
	private String type;

	private int totalPageNo;
	private int currentPageNo;
	
	public Subject() {
		
	}
	
	public Subject(Subject subject) {
		this.subjectID = subject.subjectID;
		this.topicSubjectID = subject.topicSubjectID;
		this.title = subject.title;
		this.author = subject.author;
		this.boardID = subject.boardID;
		this.boardEngName = subject.boardEngName;
		this.boardChsName = subject.boardChsName;
		this.dateString = subject.dateString;
		this.type = subject.type;
		this.totalPageNo = subject.totalPageNo;
		this.currentPageNo = subject.currentPageNo;
		this.replies = replies;
	}

	public String getSubjectID() {
		return subjectID;
	}

	public void setSubjectID(String subjectID) {
		this.subjectID = subjectID;
	}

	public void setTopicSubjectID(String topicSubjectID) {
		this.topicSubjectID = topicSubjectID;
	}

	public String getTopicSubjectID() {
		return topicSubjectID;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setBoardEngName(String boardEngName) {
		this.boardEngName = boardEngName;
	}

	public void setBoardID(String boardID) {
		this.boardID = boardID;
	}

	public String getBoardID() {
		return boardID;
	}

	public String getBoardEngName() {
		return boardEngName;
	}

	public String getBoardChsName() {
		return boardChsName;
	}

	public void setBoardChsName(String boardName) {
		this.boardChsName = boardName;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setTotalPageNo(int totalPageNo) {
		this.totalPageNo = totalPageNo;
	}

	public int getTotalPageNo() {
		return totalPageNo;
	}

	public void setCurrentPageNo(int page) {
		this.currentPageNo = page;
	}

	public int getCurrentPageNo() {
		return currentPageNo;
	}

	public String getDateString() {
		return dateString;
	}

	public void setDateString(String dateString) {
		this.dateString = dateString;
	}
	
	public void setReplies(String replies) {
		this.replies = replies;
	}
	
	public String getReplies() {
		return this.replies;
	}
}
