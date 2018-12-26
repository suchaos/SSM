package com.suchaos.ssm.controller;

import com.suchaos.ssm.po.Students;
import com.suchaos.ssm.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/{id}")
    public Students getStudentById(@PathVariable Long id) {
        return studentsService.getStudentBtId(id);
    }
}
