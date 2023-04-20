package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("hello")
public class HelloController {

    // Handles requests at path /hello
//    @GetMapping("hello") // Specifies that it handles GET requests
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    // Lives at /hello/goodbye
    @GetMapping("goodbye")
    //@ResponseBody
    public String goodbye() {
        return "Goodbye, Spring!";
    }

    // Lives at /hello/hello
    // Handles requests of the form /hello?name=LaunchCode
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    //@ResponseBody
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }

    // Handles requests of the form /hello/LaunchCode
    @GetMapping("{name}")
    //@ResponseBody
    public String helloWithPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    //@ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action='hello'>" + // submit a request to /hello
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
