package com.giit.dao;

import com.giit.entity.Questions;

import java.util.List;

public interface IQuestionDao {

    List<Questions> showQuestions();

    int saveQuestion(Questions question);

    Questions getQuestionById(String qid);
}
