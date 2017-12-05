package com.giit.service.impl;

import com.giit.dao.IQuestionDao;
import com.giit.entity.Questions;
import com.giit.service.IQuestionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("questionService")
public class QuestionServiceImpl implements IQuestionService {
    @Resource(name = "IQuestionDao")
    private IQuestionDao questionDao;

    public List<Questions> showQuestions() {
        return questionDao.showQuestions();
    }

    public int saveQuestion(Questions question) {
        return questionDao.saveQuestion(question);
    }

    public Questions getQuestionById(String qid) {
        return questionDao.getQuestionById(qid);
    }
}
