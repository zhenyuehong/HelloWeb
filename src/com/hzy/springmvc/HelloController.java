package com.hzy.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hongzhenyue on 17/3/2.
 * Hello World示例
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model){
        model.addAttribute("message","hello spring mvc framework!");

        return "hello";
    }

}
