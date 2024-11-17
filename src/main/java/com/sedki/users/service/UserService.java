package com.sedki.users.service;

import com.sedki.users.entities.Role;
import com.sedki.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);


}
