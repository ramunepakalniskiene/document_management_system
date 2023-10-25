package com.example.documentmanagement;

import jakarta.servlet.http.HttpServletRequest;
import org.apache.poi.hwpf.usermodel.DateAndTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Locale;

@Controller
public class WebsiteController {

    @GetMapping("/")
    public String displayHomePage(Model model){
        model.addAttribute("date", new Date());
        return"index";
    }


}
