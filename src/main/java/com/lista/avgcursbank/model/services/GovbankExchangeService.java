package com.lista.avgcursbank.model.services;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class GovbankExchangeService {

    static final String URL = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?date=20191021&json";


    public String getExchangeRate() {
        //System.out.println("Govbank");
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> rateResponse =
                restTemplate.exchange(URL,
                        HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
                        });
        String result = rateResponse.getBody();
        //System.out.println(result.toString());
        return "Govbank";
    }
}

