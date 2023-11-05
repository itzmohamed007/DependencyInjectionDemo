package dependencyInjection.injectors;

import dependencyInjection.consumers.MyApplication;
import dependencyInjection.interfaces.Consumer;
import dependencyInjection.interfaces.MessageServiceInjector;
import dependencyInjection.services.SmsServiceImp;

public class SmsServiceInjectorImp implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyApplication(new SmsServiceImp());
    }
}
