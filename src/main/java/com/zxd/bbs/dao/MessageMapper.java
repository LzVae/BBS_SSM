package com.zxd.bbs.dao;

import java.util.List;

import com.zxd.bbs.pojo.Message;

/**
* @author zhuxindong  E-mail:501801307@qq.com
* @date ����ʱ�䣺2017��9��9�� ����9:01:48
* @version 1.0
*/

public interface MessageMapper {
	
	/**
	 * ��ѯ�������ӣ�ͬʱ��ѯ���ӵ����˺ͻظ�
	 * @return
	 */
	List<Message> selectAllWithUserAndReply();
	
	List<Message> selectByUserNameWithUserAndReply(String username);
	
	int insert(Message message);
	
	/**
	 * �������ӵ�idɾ������
	 * @param id
	 * @return
	 */
	int deleteById(long id);
	
	

}
