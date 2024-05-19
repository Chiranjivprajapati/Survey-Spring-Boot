# Matrix Spring Boot Application

This is a Spring Boot application for managing survey responses. It provides CRUD (Create, Read, Update, Delete) operations through a REST API.

## Prerequisites

- Java 8 or higher
- Maven or Gradle
- Postman (optional, for testing API endpoints)

## APIs
Create a new survey response: POST /survey-responses
Retrieve all survey responses: GET /survey-responses
Retrieve a survey response by ID: GET /survey-responses/{id}
Update a survey response: PUT /survey-responses/{id}
Delete a survey response: DELETE /survey-responses/{id}

## JSON for POST and PUT api 
{
    "staffInteraction": "Very satisfied",
    "costOfDelivery": "Somewhat satisfied",
    "deliveryOptions": "Somewhat satisfied",
    "packageCondition": "Very satisfied"
}
