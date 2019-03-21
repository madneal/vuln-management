package io.renren.vulns.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("vulns/{module}/{url}.html")
    public String vulns(@PathVariable("module") String module, @PathVariable("url") String url){
        return "vulns/" + module + "/" + url;
    }
}
