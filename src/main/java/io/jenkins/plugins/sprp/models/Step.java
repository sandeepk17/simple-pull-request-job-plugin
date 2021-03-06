package io.jenkins.plugins.sprp.models;

import javax.annotation.Nonnull;
import java.util.HashMap;

public class Step {
    @Nonnull
    private String stepName;
    private Object defaultParameter;
    private HashMap<String, Object> parameters;

    public Step() {
        stepName = "";
    }

    @Nonnull
    public String getStepName() {
        return stepName;
    }

    public void setStepName(@Nonnull String stepName) {
        this.stepName = stepName;
    }

    public HashMap<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(HashMap<String, Object> parameters) {
        this.parameters = parameters;
    }

    public Object getDefaultParameter() {
        return defaultParameter;
    }

    public void setDefaultParameter(Object defaultParameter) {
        this.defaultParameter = defaultParameter;
    }
}