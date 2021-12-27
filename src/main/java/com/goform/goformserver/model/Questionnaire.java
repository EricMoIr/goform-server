package com.goform.goformserver.model;

import org.hibernate.annotations.ListIndexBase;

import javax.persistence.*;
import java.util.List;

@Entity
public class Questionnaire {
    @Id
    private String id;
    private String title;
    private String description;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "questionnaireId")
    @OrderColumn(name = "index")
    @ListIndexBase(value = 0)
    private List<Question> questions;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
