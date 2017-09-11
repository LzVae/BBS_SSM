package com.zxd.bbs.pojo;

import java.sql.Timestamp;

/**
* @author zhuxindong  E-mail:501801307@qq.com
* @date ����ʱ�䣺2017��9��8�� ����2:42:47
* @version 1.0
*/

public class Reply {

	private Integer id;
	private String content;
	private Timestamp createtime;
	
	private User user;
	private Message message;
	
	public Reply() {
		
	}

	public Reply(Integer id, String content, Timestamp createtime, User user, Message message) {
		super();
		this.id = id;
		this.content = content;
		this.createtime = createtime;
		this.user = user;
		this.message = message;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Reply [id=" + id + ", content=" + content + ", createtime=" + createtime + ", user=" + user
				+ ", message=" + message + "]";
	}
	
	
	
	
	
	
}
