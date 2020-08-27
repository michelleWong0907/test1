package cn.java.web;
/*
 *TODO
 *@author    wh
 *@date  2020/8/25/0025    14:19
 */

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

    @GetMapping("init")
    public String init(){
        return "hello git!！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！123456789";

    }
}
