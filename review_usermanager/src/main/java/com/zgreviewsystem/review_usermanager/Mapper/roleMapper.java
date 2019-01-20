package com.zgreviewsystem.review_usermanager.Mapper;

import com.zgreview.service.bean.role;
import tk.mybatis.mapper.common.Mapper;



public interface roleMapper extends Mapper<role> {

  role selectNamebyId();

}
