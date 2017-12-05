package com.giit.dao;

public interface IAnswerDao {

    int saveAnswer(String qid,String anscontent);

    int addToAnswerCount(String qid);
}
