package de.hausaufgabe.itgirlshausaufgabe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WocheTagController {

    @GetMapping("/name")
    public String wochenTag(@RequestParam String day) {
        try {
            dayOfWeek tagOfWoche = dayOfWeek.valueOf(day.toUpperCase());
            return tagOfWoche.getRussTranslate();
        } catch (IllegalArgumentException e) {
            return "Неверный день недели";
        }

    }
}
