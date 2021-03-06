package br.univille.viniciusroepkedacs2021.controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping
    public ModelAndView index(){
        
        /*lógica doida*/
        Date dataAgora = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        SimpleDateFormat hora = new SimpleDateFormat("hh");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT-3:00"));
        hora.setTimeZone(TimeZone.getTimeZone("GMT-3:00"));
        
        HashMap<String, String> dados = new HashMap<>();
        dados.put("tempo", sdf.format(dataAgora)+", exatamente "+hora.format(dataAgora)+" horas e pouco");
        dados.put("nomeapp", "App Java lindo!!");
        
        return new ModelAndView("home/index", dados);
    }


    
}