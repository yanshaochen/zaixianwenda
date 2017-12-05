package com.giit.controller;

import com.giit.entity.Answers;
import com.giit.entity.Questions;
import com.giit.service.IAnswerService;
import com.giit.service.IQuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/answer")
public class AnswersController {
    //注入answerService
    @Resource(name = "answerService")
    private IAnswerService answerService;

    //提交答案
    @RequestMapping("/saveAnswer")
    public String saveAnswer(HttpServletRequest request){
        String qid = request.getParameter("qid");
        String anscontent = request.getParameter("anscontent");
        answerService.saveAnswer(qid,anscontent);
        return "/jsp/onlineQA.jsp";
    }
}
