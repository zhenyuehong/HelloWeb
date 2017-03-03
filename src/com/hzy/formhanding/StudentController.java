package com.hzy.formhanding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hongzhenyue on 17/3/3.
 * Spring MVC表单处理
 */
@Controller
public class StudentController {
    @Autowired
    @Qualifier("studentValidator")
    private Validator validator;

    @InitBinder
    private void initBinder(WebDataBinder binder){
        binder.setValidator(validator);
    }

    @ModelAttribute("student")
    public Student createStudentModel(){
        return new Student();
    }

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ModelAndView student(){
//        JSP中使用<form:form>标签，spring框架需要一个名称为“command”的对象文件。当调用student()方法时，它返回student.jsp视图。
        return new ModelAndView("student","command",new Student());
    }


    @RequestMapping(value = "/HelloWeb/addStudent",method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("student")Student student, BindingResult bindingResult, ModelMap model){
        if (bindingResult.hasErrors()){
            return "addStudent";
        }
            model.addAttribute("name",student.getName());
            model.addAttribute("age",student.getAge());
            model.addAttribute("id",student.getId());

        return "result";
    }


}
