package com.tony.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author fut
 * @Date 2018-11-26
 * @Description 
 * @Wiki:
 */
@RestController
@RequestMapping("alpha")
public class AlphaController {

    @RequestMapping("/about")
    public String getAlpha() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
    }
}
