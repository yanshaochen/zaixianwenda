package com.giit.service.impl;

import com.giit.dao.IAnswerDao;
import com.giit.entity.Answers;
import com.giit.service.IAnswerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("answerService")
public class AnswerServiceImpl implements IAnswerService {
    @Resource(name = "IAnswerDao")
    private IAnswerDao answerDao;

    public int saveAnswer(String qid,String anscontent) {
        int count=0;
        count+=answerDao.addToAnswerCount(qid);
        count += answerDao.saveAnswer(qid, anscontent);
        return count;
    }
}
