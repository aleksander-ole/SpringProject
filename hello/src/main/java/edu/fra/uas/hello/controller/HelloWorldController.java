package edu.fra.uas.hello.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.fra.uas.hello.Fach;

@Controller
public class HelloWorldController {
    
    @RequestMapping(value="hello", method=RequestMethod.GET)
    @ResponseBody
    public double getDurchschnitt() {


        Fach [] FächerListe = new Fach[5];
        FächerListe[0] = new Fach("deutsch",1,2.5);
        FächerListe[1] = new Fach("informatik",2,1.8);
        FächerListe[2] = new Fach("englisch",1,1.7);
        FächerListe[3] = new Fach("biologie",2,2.4);
        FächerListe[4] = new Fach("sport",2,1.7);

        double durchschnitt = Fach.durchschnittBerechnen(FächerListe);

        return durchschnitt;
    }
}
