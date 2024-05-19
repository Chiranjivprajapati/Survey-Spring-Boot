package com.surveyResponse.service;

import com.surveyResponse.model.SurveyResponse;
import com.surveyResponse.repository.SurveyResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyResponseService {

    @Autowired
    private SurveyResponseRepository repository;

    public List<SurveyResponse> findAll() {
        return repository.findAll();
    }

    public SurveyResponse findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public SurveyResponse save(SurveyResponse surveyResponse) {
        return repository.save(surveyResponse);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
