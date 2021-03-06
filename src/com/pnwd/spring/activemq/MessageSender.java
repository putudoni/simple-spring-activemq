package com.pnwd.spring.activemq;

import org.springframework.jms.core.support.JmsGatewaySupport;

/**
 * @author Putu Ngurah Wigadoni
 *
 */
public class MessageSender extends JmsGatewaySupport{

	public void sender(Member member) {
		getJmsTemplate().convertAndSend(member);
	}
	
}
