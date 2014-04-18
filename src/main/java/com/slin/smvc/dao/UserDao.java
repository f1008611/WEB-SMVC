package com.slin.smvc.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import com.slin.smvc.pojo.User;

/**
 * Created by Administrator on 14-4-17.
 */

public interface UserDao {
	@Select("select * from user")
    public List<User> findAllUser();
}
