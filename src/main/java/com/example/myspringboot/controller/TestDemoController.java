package com.example.myspringboot.controller;

import com.example.myspringboot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("rest")
public class TestDemoController {

    @Autowired
    private Person person;

    @RequestMapping("queryDemo")
    @ResponseBody
    public Map<String,Object> queryDemo(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("1",person);
        return map;
    }
}
