package com.giit.service;

import com.giit.entity.Questions;

import java.util.List;

public interface IQuestionService {

    List<Questions> showQuestions();

    int saveQuestion(Questions question);

    Questions getQuestionById(String qid);
}
