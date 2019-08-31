package cn.chen.service;


import cn.chen.pojo.ReceiveMail;

import java.util.List;
import java.util.Map;

public interface ReceiveMailService
{
    public int addMail() throws Exception;
    public List<Map<String, Object>> getList(int index, int pageSize);
    public int getCount();
    public ReceiveMail getEmail(int id);
}
