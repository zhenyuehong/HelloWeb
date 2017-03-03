package com.hzy.userinfo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongzhenyue on 17/3/3.
 */
@Controller
public class UserController {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public ModelAndView getUser(){
//        return new ModelAndView("user","command",new User());

        User user=new User();
        user.setFavorites(new String[]{"Spring MVC","Struts 2"});
        user.setGender("M");
        return new ModelAndView("user","command",user);


    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public String addUser(@ModelAttribute("HelloWeb") User user, ModelMap modelMap){
        modelMap.addAttribute("username",user.getUsername());
        modelMap.addAttribute("password",user.getPassword());
        modelMap.addAttribute("address",user.getAddress());
        modelMap.addAttribute("receivePaper",user.isReceivePaper());
        modelMap.addAttribute("favorites",user.getFavorites());
        modelMap.addAttribute("gender",user.getGender());
        modelMap.addAttribute("favoriteNumber",user.getFavoriteNumber());
        modelMap.addAttribute("country",user.getCountry());

        return "userlist";
    }

    @ModelAttribute("favorites")
    public List<String> getWebFrameworkList()
    {
        List<String> webFrameworkList = new ArrayList<String>();
        webFrameworkList.add("Spring MVC");
        webFrameworkList.add("Spring Boot");
        webFrameworkList.add("Struts 2");
        webFrameworkList.add("Apache Hadoop");
        return webFrameworkList;
    }

    @ModelAttribute("favoriteNumber")
    public List<String> getNumberList(){
        List<String> numberList=new ArrayList<>();
        numberList.add("1");
        numberList.add("2");
        numberList.add("3");
        numberList.add("4");
        numberList.add("5");
        return numberList;
    }

    @ModelAttribute("countrylist")
    public List<String> getCountry(){
        List<String> country=new ArrayList<>();
        country.add("US");
        country.add("CH");
        country.add("SG");
        country.add("MY");
        return country;
    }
}
