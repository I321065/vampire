package com.nick.www.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author "yinzheng"
 * @date 2018-09-02
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index() {
        return null;
    }
}
