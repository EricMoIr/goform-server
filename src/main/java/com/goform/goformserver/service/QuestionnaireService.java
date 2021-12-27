package com.goform.goformserver.service;

import com.goform.goformserver.dto.QuestionnaireDTO;
import com.goform.goformserver.model.Questionnaire;
import com.goform.goformserver.repository.QuestionnaireRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class QuestionnaireService {
    private final QuestionnaireRepository questionnaireRepository;

    public QuestionnaireService(QuestionnaireRepository questionnaireRepository) {
        this.questionnaireRepository = questionnaireRepository;
    }

    public QuestionnaireDTO getQuestionnaire(String id) {
        Optional<Questionnaire> questionnaire = questionnaireRepository.findById(id);
        if (questionnaire.isEmpty()) {
            return null;
        }
        return questionnaireMapper(questionnaire.get());
    }

    private QuestionnaireDTO questionnaireMapper(Questionnaire questionnaire) {
        QuestionnaireDTO dto = new QuestionnaireDTO();
        dto.setId(questionnaire.getId());
        dto.setTitle(questionnaire.getTitle());
        dto.setDescription(questionnaire.getDescription());
        dto.setQuestions(
                questionnaire.getQuestions()
                        .stream()
                        .map(QuestionService::questionMapper)
                        .collect(Collectors.toList()))
        ;
        return dto;
    }
}
