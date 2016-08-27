package com.ily.api.dubbo;

import java.util.List;
import com.ily.entity.User;

public interface UserService {
	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	int insertSelective(User record);

	User selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(User record);

	int updateByPrimaryKey(User record);

	// 自定义
	List<User> getUsers();
}