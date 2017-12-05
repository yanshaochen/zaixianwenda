package test;

import com.giit.dao.IQuestionDao;
import com.giit.entity.Questions;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test20171204 {
    @Test
    public void test01(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_Test.xml");
        IQuestionDao questionDao = (IQuestionDao)ctx.getBean("IQuestionDao");
        List<Questions> questions = questionDao.showQuestions();
        System.out.println(questions+","+questions.size());
    }
}
