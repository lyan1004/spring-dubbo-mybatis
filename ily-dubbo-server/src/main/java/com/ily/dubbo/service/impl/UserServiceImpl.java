package com.ily.dubbo.service.impl;
 
import java.util.List;  
  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import com.alibaba.dubbo.config.annotation.Service;  
import com.ily.api.dubbo.UserService;
import com.ily.dubbo.dao.UserMapper;
import com.ily.entity.User;  
 
import org.springframework.beans.factory.annotation.Autowired;
@Service  
public class UserServiceImpl implements UserService {  
  
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);  
    
    @Autowired  
    private UserMapper userMapper;  
      
    public int insert(User record){  
        return userMapper.insert(record);  
    }  
  
      public int insertSelective(User record){  
        return userMapper.insertSelective(record);  
    }  
    //需要自己定义Mapper文件中的方法  
    public List<User> getUsers() {  
        logger.info("开始查询所有用户信息");  
          
        logger.info("查询结束");  
        return userMapper.selectAll();  
    }  
  
    public int deleteByPrimaryKey(Integer id) {  
        return userMapper.deleteByPrimaryKey(id);  
    }  
  
    public User selectByPrimaryKey(Integer id) {  
        return userMapper.selectByPrimaryKey(id);  
    }  
  
    public int updateByPrimaryKeySelective(User record) {  
        return userMapper.updateByPrimaryKeySelective(record);  
    }  
  
    public int updateByPrimaryKey(User record) {  
        return userMapper.updateByPrimaryKey(record);  
    }  
  
}