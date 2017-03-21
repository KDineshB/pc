package com.dinesh.placementcell.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailingService {
	
	public String sendMail(MailConfig mailConfig) throws MessagingException{
		sendSSLMessage(mailConfig.getToAddress(), mailConfig.getMailSubject(), mailConfig.getMailContent(), MailConstants.FROM_ADDRESS);
		return "";
	}
	public void sendSSLMessage(String recipient, String subject,
		    String message, String from) throws MessagingException {
		    boolean debug = true;
		    
		    String recipients[] = recipient.split(",");
		     
		    Properties props = new Properties();
		    props.put("mail.smtp.host", MailConstants.SMTP_HOST);
		    props.put("mail.smtp.auth", "true");
		    props.put("mail.debug", "true");
		    props.put("mail.smtp.port", MailConstants.SMTP_PORT);
		    props.put("mail.smtp.socketFactory.port", MailConstants.SMTP_PORT);
		    props.put("mail.smtp.socketFactory.class", MailConstants.SSL_FACTORY);
		    props.put("mail.smtp.socketFactory.fallback", "false");
		     
		    Session session = Session.getDefaultInstance(props,null);
		     
		    session.setDebug(debug);
		     
		    Message msg = new MimeMessage(session);
		     
		    InternetAddress[] addressTo = new InternetAddress[recipients.length];
		    for (int i = 0; i < recipients.length; i++) {
		    addressTo[i] = new InternetAddress(recipients[i]);
		    }
		    msg.setRecipients(Message.RecipientType.TO, addressTo);
		     
		    // Setting the Subject and Content Type
		    msg.setSubject(subject);
		    msg.setContent(message, "text/plain");
		    Transport transport = session.getTransport("smtps");
		    transport.connect(MailConstants.SMTP_HOST, 465, from, MailConstants.PASSWORD);
		    transport.sendMessage(msg, msg.getAllRecipients());
		    transport.close();    
		    
		    }

}
