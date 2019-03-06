package com.suchaos.ssm.controller;

import com.suchaos.ssm.model.Students;
import com.suchaos.ssm.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * StudentsController
 *
 * @author suchao
 * @date 2018/12/26
 */
@RestController
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    private StudentsService studentsService;

    @Autowired
    private ApplicationContext applicationContext;

    @GetMapping("/{id}")
    public Students getStudentById(@PathVariable Long id) {
        System.out.println(applicationContext);
        return studentsService.getStudentBtId(id);
    }

    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getStudentList(@RequestParam(value = "page", required = false, defaultValue = "0") int page,
                                 @RequestParam(value = "size", required = false, defaultValue = "0") int size) {
        String result = studentsService.getStudentList(page, size);
        return result;
    }
}
