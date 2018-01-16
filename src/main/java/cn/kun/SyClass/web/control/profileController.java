package cn.kun.SyClass.web.control;

import cn.kun.SyClass.Repository.AnswerRepository;
import cn.kun.SyClass.Repository.TopicRepository;
import cn.kun.SyClass.Repository.UserRepository;
import org.springframework.stereotype.Controller;

@Controller
public class profileController {
    private final UserRepository userRepository;
    private final AnswerRepository answerRepository;
    private final TopicRepository topicRepository;

    
}
