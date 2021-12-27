package com.goform.goformserver.controller;

import com.goform.goformserver.dto.QuestionnaireDTO;
import com.goform.goformserver.service.QuestionnaireService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/questionnaires")
public class QuestionnaireController {
    private final QuestionnaireService questionnaireService;

    public QuestionnaireController(QuestionnaireService questionnaireService) {
        this.questionnaireService = questionnaireService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<QuestionnaireDTO> getQuestionnaire(@PathVariable String id) {
        QuestionnaireDTO dto = questionnaireService.getQuestionnaire(id);
        if (dto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(dto);
    }
}
