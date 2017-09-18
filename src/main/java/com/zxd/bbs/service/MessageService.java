package com.zxd.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zxd.bbs.dao.MessageMapper;
import com.zxd.bbs.dao.ReplyMapper;
import com.zxd.bbs.pojo.Message;
import com.zxd.bbs.pojo.Reply;

/**
* @author zhuxindong  E-mail:501801307@qq.com
* @date ����ʱ�䣺2017��9��11�� ����5:54:01
* @version 1.0
*/

@Service
public class MessageService {
	
	
	@Autowired
	private MessageMapper messageMapper;
	
	@Autowired
	private ReplyMapper replyMapper;
	
	
	/**
	 * ��ѯ��������
	 * @return
	 */
	public List<Message> getAll(){
		
		return messageMapper.selectAllWithUserAndReply();
		
	}
	
	
	/**
	 * �������ӵ�idɾ�����ӣ���Ҫ��ɾ���������µ����лظ�
	 * @param id
	 */
	public void deleteMessageById(int id) {
		
		/**
		 * �ȸ������ӵ�id��ѯ��������
		 */
		Message message = messageMapper.selectByIdWithUserAndReply(id).get(0);
		
		/**
		 * ��ȡ�������µ����лظ�
		 */
		List<Reply> replies = message.getReplies();
		
		/**
		 * ����ɾ���ظ�
		 */
		for (Reply reply : replies) {
			replyMapper.deleteById(reply.getId());
		}
		
		
		/**
		 * ɾ���ظ�֮����ɾ������
		 */
		messageMapper.deleteById(id);				
		
	}
	

}
