package com.hzy.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hongzhenyue on 17/3/3.
 * Spring MVC页面重定向
 */
@Controller
public class RedirectController {

    @RequestMapping(value = "/reindex",method = RequestMethod.GET)
    public String index(){

        return "reindex";
    }

    @RequestMapping(value = "/redirect",method = RequestMethod.GET)
    public String redirect(){

        return "redirect:finalPage";
    }

    @RequestMapping(value = "/finalPage",method = RequestMethod.GET)
    public String finalPage(){

        return "refinal";
    }

}
