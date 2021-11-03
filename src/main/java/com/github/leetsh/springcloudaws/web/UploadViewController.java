package com.github.leetsh.springcloudaws.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class UploadViewController {

    @GetMapping("/")
    public String upload() {
        return "index";
    }

}
