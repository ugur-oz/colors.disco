package com.colors.ugur.colors;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ColorsController {
    private static List<Color> colors = new ArrayList<>();
    private int count;

    @GetMapping("start")
    public String start(Model model) {
        model.addAttribute("objectToSave", new Color());
        model.addAttribute("savedColors",colors);

        return "input";
    }

    @PostMapping("start")
    public String saveColor(Color color, Model model) {
        model.addAttribute("objectToSave", new Color());
        colors.add(color);
        model.addAttribute("savedColors",colors);
        return "input";
    }

    @GetMapping("disco")
    public String disco(Model model) {
        model.addAttribute("backgroundColor","background-color:" + colors.get(count).getValue());
        count++;
        if(count == colors.size()){
            count = 0;
        }
        return "disco";
    }

}




