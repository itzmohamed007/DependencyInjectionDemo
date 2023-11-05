package dependencyInjection.injectors;

import dependencyInjection.consumers.MyApplication;
import dependencyInjection.interfaces.Consumer;
import dependencyInjection.interfaces.MessageServiceInjector;
import dependencyInjection.services.EmailServiceImp;

public class EmailServiceInjectorImp implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyApplication(new EmailServiceImp());
    }
}
