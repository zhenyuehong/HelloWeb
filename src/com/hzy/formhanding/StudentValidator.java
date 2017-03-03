package com.hzy.formhanding;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.w3c.dom.ls.LSResourceResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.validation.Validator;
import java.io.IOException;

/**
 * Created by hongzhenyue on 17/3/3.
 */
public class StudentValidator implements org.springframework.validation.Validator{
    @Override
    public boolean supports(Class<?> aClass) {
        return Student.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name","required.name","Field name is required!");
    }
}