package com.example.contractdemoserver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ServerDefaultController {

    public static final String controllerName = "test";
    public static final String controllerPath = "/" + controllerName;

    @RequestMapping(value = controllerPath, headers={"application/json"})
    @ResponseBody
    public TestObject get(){
        return new TestObject(1001, new String[0]);
    }
}
