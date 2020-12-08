package com.heman.blog.service;

import com.heman.blog.entity.User;
import com.heman.blog.user.CrmUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
}
