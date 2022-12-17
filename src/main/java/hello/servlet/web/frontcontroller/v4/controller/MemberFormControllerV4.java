package hello.servlet.web.frontcontroller.v4.controller;

import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.v4.ControllerV4;

import javax.servlet.http.HttpServlet;
import java.util.Map;

public class MemberFormControllerV4 implements ControllerV4 {
    @Override
    public String process(Map<String, String> paraMap, Map<String, Object> model) {
        return "new-form";
    }
}