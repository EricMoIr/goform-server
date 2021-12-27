package com.goform.goformserver.dto;

import java.util.ArrayList;
import java.util.List;

public class QuestionDTO {
    private String id;
    private String title;
    private String kind;
    private boolean isRequired;
    private boolean hasOther;
    private List<String> choices = new ArrayList<>();
    private ConditionDTO condition;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(boolean required) {
        this.isRequired = required;
    }

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

    public ConditionDTO getCondition() {
        return condition;
    }

    public void setCondition(ConditionDTO condition) {
        this.condition = condition;
    }
}
