/**
 * 
 */
package com.pnwd.spring.activemq;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Putu Ngurah Wigadoni
 *
 */
public class SimpleSpringJMSSubscriber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		GenericXmlApplicationContext appContext = new GenericXmlApplicationContext();
		appContext.load("springConfigSubscriber.xml");
		appContext.refresh();
		MessageReceiver message = appContext.getBean("messageReceiver",MessageReceiver.class);
		Member member = message.getMessage();
		System.out.println("Receive message");
		System.out.println("Name  : " + member.getName());
		System.out.println("Email  : " + member.getEmail());
	}

}
