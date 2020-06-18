package dev.partlycloudy.maven.client;

import org.apache.maven.shared.invoker.Invoker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MavenInvokerClient implements MavenClient {
    private final Invoker invoker;

    @Autowired
    public MavenInvokerClient(Invoker invoker) {
        this.invoker = invoker;
    }

    @Override
    public void clean() {

    }
}
