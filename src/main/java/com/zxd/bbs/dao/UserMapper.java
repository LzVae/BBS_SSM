package com.zxd.bbs.dao;

import java.util.List;

import com.zxd.bbs.pojo.User;

/**
* @author zhuxindong  E-mail:501801307@qq.com
* @date ����ʱ�䣺2017��9��8�� ����3:04:27
* @version 1.0
*/

public interface UserMapper {
	
	/**
	 * ��ѯ�����û���ͬʱ��ѯ�û������Ӻʹ�����
	 * @param user
	 * @return
	 */
	List<User> selectAllWithMsg();
	
	List<User> selectByUserNameWithMsg(String username);
	
}
