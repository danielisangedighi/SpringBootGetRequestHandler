package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IMDBController {
    @GetMapping("/shows")
    //public String getMethodName(@RequestParam String param) {
        //return new String();
    public String getShows() {
        return "shows";
    }
    
}
