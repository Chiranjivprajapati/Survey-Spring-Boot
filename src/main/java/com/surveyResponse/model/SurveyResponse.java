package com.surveyResponse.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SurveyResponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String staffInteraction;
    private String costOfDelivery;
    private String deliveryOptions;
    private String packageCondition;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStaffInteraction() {
        return staffInteraction;
    }

    public void setStaffInteraction(String staffInteraction) {
        this.staffInteraction = staffInteraction;
    }

    public String getCostOfDelivery() {
        return costOfDelivery;
    }

    public void setCostOfDelivery(String costOfDelivery) {
        this.costOfDelivery = costOfDelivery;
    }

    public String getDeliveryOptions() {
        return deliveryOptions;
    }

    public void setDeliveryOptions(String deliveryOptions) {
        this.deliveryOptions = deliveryOptions;
    }

    public String getPackageCondition() {
        return packageCondition;
    }

    public void setPackageCondition(String packageCondition) {
        this.packageCondition = packageCondition;
    }
}
