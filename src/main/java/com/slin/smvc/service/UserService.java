package com.slin.smvc.service;

import java.util.List;

import com.slin.smvc.Constants;
import com.slin.smvc.pojo.SmvcUser;

import javax.jws.WebService;

/**
 * Created by Administrator on 14-4-17.
 */
@WebService(targetNamespace = Constants.NS)
public interface UserService {
	List<SmvcUser> findAllUser() throws  Exception;
}
