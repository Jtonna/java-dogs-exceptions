package com.lambdaschool.dogsinitial.model;

import com.lambdaschool.dogsinitial.exception.ValidationError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ErrorDetail {
    // what goes in her varies by the api

    private String title;
    private int Status;
    private String detail;
    private String timestamp;
    private String devMessage;
    private Map<String List<ValidationError>> errors = new HashMap<String, List<ValidationError>>();

}
