package dependencyInjection.services;

import dependencyInjection.interfaces.MessageService;

public class SmsServiceImp implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("message sent to " + receiver + " via sms successfully");
    }
}
