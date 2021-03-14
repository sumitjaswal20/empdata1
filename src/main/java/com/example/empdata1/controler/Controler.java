package com.example.empdata1.controler;

import com.example.empdata1.service.ServiceEmp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Controler {
    @Autowired
  private   ServiceEmp serviceEmp;
    @RequestMapping("/")
    public String showdata(Model model)
    {
        model.addAttribute("listemp",serviceEmp.addemployee());
        return "index";
    }
}
