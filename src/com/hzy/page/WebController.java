package com.hzy.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hongzhenyue on 17/3/3.
 * Spring MVC静态页面
 */
@Controller
public class WebController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirect() {

        return "redirect:pages/final.html";
    }


}
