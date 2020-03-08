package com.pnwd.spring.activemq;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;

/**
 * @author Putu Ngurah Wigadoni
 *
 */
public class MessageCustomConverter implements MessageConverter {

	@Override
	public Object fromMessage(Message message) throws JMSException, MessageConversionException {
		MapMessage mapMessage = (MapMessage) message;
		Member member = new Member();
		member.setName(mapMessage.getString("name"));
		member.setEmail(mapMessage.getString("email"));
		return member;
	}

	@Override
	public Message toMessage(Object object, Session session) throws JMSException, MessageConversionException {
		Member member = (Member) object;
		MapMessage message = session.createMapMessage();
		message.setString("name", member.getName());
		message.setString("email", member.getEmail());
		return message;
	}

}
