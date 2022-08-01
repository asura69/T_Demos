package com.org.quali;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageProcessorImpl implements MessageProcessor {
	private MessageService messageService;

	@Autowired
    @Qualifier("twitterService")
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
 
    // constructor based DI
    @Autowired
    public MessageProcessorImpl(@Qualifier("TwitterService") MessageService messageService) {
        this.messageService = messageService;
    }
 
    public void processMsg(String message) {
        messageService.sendMsg(message);
    }

}
