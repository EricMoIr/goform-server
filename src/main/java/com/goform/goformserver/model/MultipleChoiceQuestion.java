package com.goform.goformserver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MultipleChoiceQuestion extends Question {
    public static final String MULTIPLE_CHOICE_KIND = "multipleChoiceKind";

    private boolean hasOther;
    @ElementCollection
    private List<String> choices = new ArrayList<>();

    public boolean isHasOther() {
        return hasOther;
    }

    public void setHasOther(boolean hasOther) {
        this.hasOther = hasOther;
    }

    public List<String> getChoices() {
        return choices;
    }

    public void setChoices(List<String> choices) {
        this.choices = choices;
    }
}
