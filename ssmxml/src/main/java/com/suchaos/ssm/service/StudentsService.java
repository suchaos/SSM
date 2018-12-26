package com.suchaos.ssm.service;

import com.suchaos.ssm.po.Students;

import java.util.List;

/**
 * StudentsService
 *
 * @author suchao
 * @date 2018/12/26
 */
public interface StudentsService {
    Students getStudentBtId(Long id);

    String getStudentList(int page, int size);
}
