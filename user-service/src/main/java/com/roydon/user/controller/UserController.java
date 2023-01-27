package com.roydon.user.controller;

import com.roydon.user.config.PatternProperties;
import com.roydon.user.entity.User;
import com.roydon.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@RestController
@RequestMapping("user")
//@RefreshScope
public class UserController {

//    @Value("${pattern.dateformat}")
//    private String dateformat;

    @Resource
    private PatternProperties patternProperties;

    @Resource
    private UserService userService;

    /**
     * 路径： /user/110
     *
     * @param id 用户id
     * @return 用户
     */
    @GetMapping("{id}")
    public User queryById(@PathVariable("id") Long id,
                          @RequestHeader(value = "Truth", required = false) String truth) {
        System.out.println("truth = " + truth);
        return userService.queryById(id);
    }

    @GetMapping("now")
    public String now() {
//        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(dateformat));
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(patternProperties.getDateformat()));
    }

    @GetMapping("share")
    public PatternProperties share() {
        return patternProperties;
    }

}
