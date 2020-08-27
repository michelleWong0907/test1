package cn.java.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 *TODO
 *@author    wh
 *@date  2020/8/27/0027 11:22
 */
@RestController
public class TestController {
    @RequestMapping("/init")
    public String init(){
        return "Everything will be OK~~";
    }
}
