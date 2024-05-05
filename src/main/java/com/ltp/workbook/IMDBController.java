package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class IMDBController {
    @GetMapping("/shows")
    //public String getMethodName(@RequestParam String param) {
        //return new String();
    public String getShows(Model model) {
        Show show = new Show("Reacher","Welcome to Margrave", 7.1);
        //Show show = new Show("Breaking Bad", "Ozymandias", 10.0);
        model.addAttribute("Show", show);
        return "shows";
    }
    
}
