package com.zxd.bbs.dao;

import com.zxd.bbs.pojo.Reply;

/**
* @author zhuxindong  E-mail:501801307@qq.com
* @date ����ʱ�䣺2017��9��11�� ����5:42:11
* @version 1.0
*/

public interface ReplyMapper {

	
	int insert(Reply reply);
	
	int deleteById(long id);
	
}
