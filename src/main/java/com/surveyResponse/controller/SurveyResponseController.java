package com.surveyResponse.controller;

import com.surveyResponse.model.SurveyResponse;
import com.surveyResponse.service.SurveyResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/survey-responses")
public class SurveyResponseController {

    @Autowired
    private SurveyResponseService service;

    @GetMapping
    public List<SurveyResponse> getAllResponses() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SurveyResponse> getResponseById(@PathVariable Long id) {
        SurveyResponse response = service.findById(id);
        if (response == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public SurveyResponse createResponse(@RequestBody SurveyResponse surveyResponse) {
        return service.save(surveyResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SurveyResponse> updateResponse(@PathVariable Long id, @RequestBody SurveyResponse surveyResponse) {
        SurveyResponse existingResponse = service.findById(id);
        if (existingResponse == null) {
            return ResponseEntity.notFound().build();
        }
        surveyResponse.setId(id);
        return ResponseEntity.ok(service.save(surveyResponse));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResponse(@PathVariable Long id) {
        SurveyResponse existingResponse = service.findById(id);
        if (existingResponse == null) {
            return ResponseEntity.notFound().build();
        }
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
