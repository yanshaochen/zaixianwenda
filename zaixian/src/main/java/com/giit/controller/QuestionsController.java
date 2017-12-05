package com.giit.controller;

import com.giit.entity.Answers;
import com.giit.entity.Questions;
import com.giit.service.IQuestionService;
import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Controller
@RequestMapping("/question")
public class QuestionsController {
    //注入questionService
    @Resource(name = "questionService")
    private IQuestionService questionService;

    //显示question table
    @RequestMapping("/showQuestions")
    @ResponseBody
    public Object showQuestions(HttpServletResponse response) throws IOException {
        return questionService.showQuestions();
    }

    //提交question
    @RequestMapping("/saveQuestion")
    public String saveQuestion(Questions question){
        questionService.saveQuestion(question);
        return "redirect:/jsp/onlineQA.jsp";
    }

    //根据question获取answer
    @RequestMapping("/showAnswers")
    public String showAnswersByQuestionId(String qid, Model model){
        Questions question=questionService.getQuestionById(qid);
        model.addAttribute("question",question);
        return "/jsp/answers.jsp";
    }
}
