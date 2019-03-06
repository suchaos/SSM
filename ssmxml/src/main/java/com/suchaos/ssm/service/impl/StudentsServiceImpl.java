package com.suchaos.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.suchaos.ssm.dto.Pageable;
import com.suchaos.ssm.dto.ResultType;
import com.suchaos.ssm.mapper.StudentsMapper;
import com.suchaos.ssm.po.Students;
import com.suchaos.ssm.po.StudentsExample;
import com.suchaos.ssm.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public Students getStudentBtId(Long id) {
        System.out.println(applicationContext);
        return studentsMapper.selectByPrimaryKey(id);
    }

    @Override
    public String getStudentList(int page, int size) {
        PageHelper.startPage(page, size);
        StudentsExample example = new StudentsExample();
        StudentsExample.Criteria criteria = example.createCriteria();
        List<Students> list = studentsMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo<Students>(list);
        return ResultType.resultList("success", list, new Pageable(pageInfo));
    }
}
