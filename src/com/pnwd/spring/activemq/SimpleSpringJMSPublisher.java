/**
 * 
 */
package com.pnwd.spring.activemq;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Putu Ngurah Wigadoni
 *
 */
public class SimpleSpringJMSPublisher {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		GenericXmlApplicationContext appContext = new GenericXmlApplicationContext();
		appContext.load("springConfigPublisher.xml");
		appContext.refresh();
		MessageSender message = appContext.getBean("messageSender",MessageSender.class);
		Member member = new Member();
		member.setName("james");
		member.setEmail("james@mail.com");
		message.sender(member);
	}

}
