package javacourses.spring.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private MathService mathService;

    @GetMapping("")
    public String homePage(@RequestParam int a, @RequestParam int b) {
        return String.valueOf(mathService.multiply(a,b)) +
                "<br><a href=\"/myFiles/index.html\">Back</a>";
    }
}
