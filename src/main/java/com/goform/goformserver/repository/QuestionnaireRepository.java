package com.goform.goformserver.repository;

import com.goform.goformserver.model.Questionnaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionnaireRepository extends JpaRepository<Questionnaire, String> {
}
