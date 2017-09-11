package com.zxd.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxd.bbs.dao.MessageMapper;
import com.zxd.bbs.pojo.Message;

/**
* @author zhuxindong  E-mail:501801307@qq.com
* @date ����ʱ�䣺2017��9��11�� ����5:54:01
* @version 1.0
*/

@Service
public class MessageService {
	
	
	@Autowired
	private MessageMapper messageMapper;
	
	
	/**
	 * ��ѯ��������
	 * @return
	 */
	public List<Message> getAll(){
		
		return messageMapper.selectAllWithUserAndReply();
		
	}
	
	
	
	

}
