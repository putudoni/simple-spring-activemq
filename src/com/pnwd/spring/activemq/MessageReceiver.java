package com.pnwd.spring.activemq;

import org.springframework.jms.core.support.JmsGatewaySupport;

/**
 * @author Putu Ngurah Wigadoni
 *
 */
public class MessageReceiver extends JmsGatewaySupport {

	public Member getMessage() {
		return (Member) getJmsTemplate().receiveAndConvert();
	}
	
}
