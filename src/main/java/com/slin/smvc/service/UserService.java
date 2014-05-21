package com.slin.smvc.service;

import java.util.List;

import com.slin.smvc.Constants;
import com.slin.smvc.pojo.User;

import javax.jws.WebService;

/**
 * Created by Administrator on 14-4-17.
 */
@WebService(targetNamespace = Constants.NS)
public interface UserService {
	List<User> findAllUser() throws  Exception;
}
