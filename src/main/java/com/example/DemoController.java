package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/2/14.
 */
@RestController
public class DemoController {

    @Autowired
    private DemoRepository demoRepository;

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public List<TestList> hello(Model model){
        //model.addAttribute("test", demoRepository.findAll());
        //return "index";
        return demoRepository.findAll();
    }
}
