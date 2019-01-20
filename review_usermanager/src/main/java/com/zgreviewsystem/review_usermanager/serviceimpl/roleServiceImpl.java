package com.zgreviewsystem.review_usermanager.serviceimpl;

import com.zgreview.service.bean.role;
import com.zgreview.service.roleService;
import com.zgreviewsystem.review_usermanager.Mapper.roleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class roleServiceImpl implements roleService {
    @Autowired
    private roleMapper roleMapper;


    @Override
    public List<role> getRoleInfoList() {

        return roleMapper.selectAll();
    }

    @Override
    public role getOne() {
        return roleMapper.selectNamebyId();
    }
}
