package dependencyInjection.consumers;

import dependencyInjection.interfaces.Consumer;
import dependencyInjection.interfaces.MessageService;

public class MyApplication implements Consumer {
    /*
        * until now, we don't know which service we will use (is it an email service or a sms service)
        * because we relied on the interface not the concrete implementation, which is a clear use of
        * DEPENDENCY INJECTION principle
     */
    private MessageService messageService = null;

    public MyApplication(MessageService messageService) {
        this.messageService = messageService;
    }
    @Override
    public void processMessage(String message, String receiver) {
        // doing some process on received data
        messageService.sendMessage(message, receiver);
    }
}
