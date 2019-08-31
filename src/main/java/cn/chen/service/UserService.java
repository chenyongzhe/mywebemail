package cn.chen.service;

import cn.chen.pojo.User;

public interface UserService
{
    public User getUserById(int userid);
    public int regUser(User user);
    public User getUserByUsername(String username);
    public int updateUser(User user);
}
