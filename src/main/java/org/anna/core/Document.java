package org.anna.core;

import javax.validation.constraints.NotNull;

public class Document {
    @NotNull
    private String id;

    @NotNull
    private String text;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
