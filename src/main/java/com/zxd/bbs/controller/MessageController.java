package com.zxd.bbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxd.bbs.pojo.Message;
import com.zxd.bbs.pojo.Msg;
import com.zxd.bbs.service.MessageService;

/**
* @author zhuxindong  E-mail:501801307@qq.com
* @date ����ʱ�䣺2017��9��11�� ����5:52:26
* @version 1.0
*/

@Controller
public class MessageController {
	
	
	@Autowired
	private MessageService messageService;
	
	
	/**
	 * ��ҳ��ѯ������Ϣ��ͬʱ��ѯ�����Ӷ�Ӧ�Ļظ��б�����json����
	 * @param pn
	 * @return
	 */
	@RequestMapping("/messages")
	@ResponseBody
	public Msg getMessagesWithJosn(@RequestParam(value="pn",defaultValue="1") Integer pn){
		
		/**
		 * ����pagehelper����ҳ��ѯ
		 */
		PageHelper.startPage(pn, 10);
		List<Message> messages = messageService.getAll();
		
		/**
		 * ��װ��pageinfo����
		 */
		PageInfo page = new PageInfo(messages);		
		return Msg.success().add("pageinfo", page);
		
	}
	
	

}
