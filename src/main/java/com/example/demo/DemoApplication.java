package com.example.demo;

import com.example.demo.model.Instructor;
import com.example.demo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    DatabaseManager db = new DatabaseManager();

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/register")
    public String registerFunction(@RequestParam String name, @RequestParam String family) {
        IEDatabaseManager ie = new IEDatabaseManager();
        return  ie.registerInstructor(new Instructor(name,family));
    }

    @GetMapping("/registerstudent")
    public String registerFunction(@RequestParam String name, @RequestParam String family
                                    ,@RequestParam String codemelli, @RequestParam String sn) {
        IEDatabaseManager ie = new IEDatabaseManager();
        return  ie.registerStudent(new Student(name,family,codemelli,sn));
    }

    @GetMapping("/search")
    public String sayHello(@RequestParam String sn) {
        return db.search(sn);
    }

    @GetMapping("/sum")
    public String sayHello(@RequestParam String number1, @RequestParam String number2) {
        String page = "<!DOCTYPE HTML>\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <title>My web service</title>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    </head>\n" +
                "    <body>\n"+
                "     <p>Number 1 :<i>"+number1+ "</i></p>"+
                "     <p>Number 2 :<i>"+number2+ "</i></p>"+
                "     <h1>SUM is :<i>"+(Integer.parseInt(number1)+Integer.parseInt(number2))+ "</i></h1>"+
                "    </body>\n" +
                "</html>";
        return page;
    }

    @GetMapping("/salam")
    public String saySalam() {
        return "Salam!!!!!!";
    }


    @GetMapping("/easygame")
    public String easyGame() {
        String page = "<!DOCTYPE HTML>\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <title>Your first Spring application</title>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    </head>\n" +
                "    <body>\n"+
                "     <h1>"+12 +" "+ 13 +" "+ 14 +" "+ 15 +" "+ "? </h1>"+
                " <form action=\"http://127.0.0.1:8080/checkeasygame\" method=\"GET\" id=\"nameForm\">\n" +
                "            <div>\n" +
                "           <p>\n" +
                "               <label for=\"nameField\">What is the next number?</label>\n" +
                "                <input name=\"number\" id=\"nameField\">\n" +
                "           </p>\n" +
                "                <button>Send Number!</button>\n" +
                "            </div>\n" +
                "        </form>"+
                "    </body>\n" +
                "</html>";
        return page;
    }

    @GetMapping("/checkeasygame")
    public String checkEasyGame(@RequestParam(value = "number") String number1) {
        String rst = "";
        if(number1.equals("16"))
            rst = "Correct";
        else
            rst = "Incorrect";
        String page = "<!DOCTYPE HTML>\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <title>Your first Spring application</title>\n" +
                "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                "    </head>\n" +
                "    <body>\n"+
                "     <h1> " +rst+"</h1>"+
                "    </body>\n" +
                "</html>";
        return page;
    }
}
