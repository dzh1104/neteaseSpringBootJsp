package com.neteasespringbootjsp.know.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class WebController {
    
    @RequestMapping("/welcome")
    public String welcome(Map<String, Object> map) {
    
        map.put("name", "zs");
        return "index"; // 前缀 + "index" + 后缀(.jsp) 在配置文件中设置好了
    }
}
