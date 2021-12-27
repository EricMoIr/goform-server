package com.goform.goformserver.service;

import com.goform.goformserver.dto.ConditionDTO;
import com.goform.goformserver.dto.QuestionDTO;
import com.goform.goformserver.model.Condition;
import com.goform.goformserver.model.MultipleChoiceQuestion;
import com.goform.goformserver.model.Question;
import com.goform.goformserver.model.TextQuestion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    public static QuestionDTO questionMapper(Question question) {
        QuestionDTO dto = new QuestionDTO();
        dto.setId(question.getId());
        dto.setTitle(question.getTitle());
        if (question.getCondition() != null) {
            dto.setCondition(conditionMapper(question.getCondition()));
        }
        dto.setIsRequired(question.isRequired());

        if (question instanceof MultipleChoiceQuestion) {
            MultipleChoiceQuestion casted = (MultipleChoiceQuestion) question;
            dto.setChoices(List.copyOf(casted.getChoices()));
            dto.setHasOther(casted.isHasOther());
            dto.setKind(MultipleChoiceQuestion.MULTIPLE_CHOICE_KIND);
        } else {
            dto.setKind(TextQuestion.TEXT_KIND);
        }
        return dto;
    }

    public static ConditionDTO conditionMapper(Condition condition) {
        ConditionDTO dto = new ConditionDTO();
        dto.setQuestionId(condition.getQuestionId());
        dto.setOperator(condition.getOperator());
        dto.setValue(condition.getValue());
        return dto;
    }
}
