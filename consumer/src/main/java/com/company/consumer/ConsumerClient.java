package com.company.consumer;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
class ConsumerClient {

    public Person getPerson(final int id) {
        final RestTemplate restTemplate = new RestTemplate();

        final ResponseEntity<Person> result = restTemplate.exchange("http://localhost:8081/employee/" + id,
                HttpMethod.GET, null, Person.class);

        return result.getBody();
    }
}