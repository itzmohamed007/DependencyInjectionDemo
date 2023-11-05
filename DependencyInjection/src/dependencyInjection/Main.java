package dependencyInjection;

import dependencyInjection.injectors.EmailServiceInjectorImp;
import dependencyInjection.injectors.SmsServiceInjectorImp;
import dependencyInjection.interfaces.Consumer;

public class Main {
    public static void main(String[] args) {
        String message = "dependency injection applied";
        String receiver = "mohamedbourra@gmail.com";
        Consumer consumer = null;
//        email service
        EmailServiceInjectorImp emailServiceInjector = new EmailServiceInjectorImp();

//        sms service
        SmsServiceInjectorImp smsServiceInjector = new SmsServiceInjectorImp();

//        consumer = smsServiceInjector.getConsumer();
//        consumer = emailServiceInjector.getConsumer();
        consumer.processMessage(message, receiver);
    }
}
