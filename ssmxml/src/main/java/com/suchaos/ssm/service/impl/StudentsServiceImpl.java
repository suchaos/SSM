package com.suchaos.ssm.service.impl;

import com.suchaos.ssm.mapper.StudentsMapper;
import com.suchaos.ssm.po.Students;
import com.suchaos.ssm.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * StudentsServiceImpl
 *
 * @author suchao
 * @date 2018/12/26
 */
@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    private StudentsMapper studentsMapper;

    @Override
    public Students getStudentBtId(Long id) {
        return studentsMapper.selectByPrimaryKey(id);
    }
}
