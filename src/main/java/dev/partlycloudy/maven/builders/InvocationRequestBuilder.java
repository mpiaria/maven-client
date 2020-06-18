package dev.partlycloudy.maven.builders;

import org.apache.maven.shared.invoker.DefaultInvocationRequest;
import org.apache.maven.shared.invoker.InvocationOutputHandler;
import org.apache.maven.shared.invoker.InvocationRequest;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class InvocationRequestBuilder {
    private String baseDirectory;
    private boolean debug;
    private InvocationOutputHandler errorHandler;
    private String globalSettingsFile;
    private List<String> goals;

    public static InvocationRequestBuilder builder() {
        return new InvocationRequestBuilder();
    }

    public InvocationRequestBuilder baseDirectory(String baseDirectory) {
        this.baseDirectory = baseDirectory;
        return this;
    }

    public InvocationRequest build() {
        InvocationRequest invocationRequest = new DefaultInvocationRequest();
        invocationRequest.setBaseDirectory(new File(baseDirectory));
        invocationRequest.setErrorHandler(errorHandler);
        invocationRequest.setDebug(debug);
        invocationRequest.setGlobalSettingsFile(new File(globalSettingsFile));
        invocationRequest.setGoals(goals);
        return invocationRequest;
    }

    public InvocationRequestBuilder debug(boolean debug) {
        this.debug = debug;
        return this;
    }

    public InvocationRequestBuilder errorHandler(InvocationOutputHandler errorHandler) {
        this.errorHandler = errorHandler;
        return this;
    }

    public InvocationRequestBuilder globalSettingsFile(String globalSettingsFile) {
        this.globalSettingsFile = globalSettingsFile;
        return this;
    }

    public InvocationRequestBuilder goals(List<String> goals) {
        this.goals = Collections.unmodifiableList(goals);
        return this;
    }
}
