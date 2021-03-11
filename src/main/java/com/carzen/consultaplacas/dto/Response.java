package com.carzen.consultaplacas.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import java.util.ArrayList;

public class Response {

    private ArrayList<Feedback> feedbacks = new ArrayList<>();
    private Object data;

    public Response(String code, String msg, String type) {
        Feedback feedback = new Feedback(type, msg, code, null);
        this.feedbacks.add(feedback);
    }

    public Response(Object data) {
        this.data = data;
    }

    public ArrayList<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(ArrayList<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String toJson() throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(this);
    }
}
