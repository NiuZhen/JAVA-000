package io.niuz.springboot.starter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StudentController {
    @Resource(name = "niut")
    private StudentService studentService;

    @GetMapping("/print")
    public String print() {
        return studentService.print();
    }
}
