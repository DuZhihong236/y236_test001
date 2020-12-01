package cn.bdqn.Service.Impl;

import cn.bdqn.Mapper.IAccountMapper;
import cn.bdqn.Service.IAccountService;
import cn.bdqn.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    IAccountMapper accountMapper;

    @Override
    public List<Account> queryAll() {
        return  accountMapper.selectAll();
    }

    @Override
    public void save() {
        System.out.println("保存方法");
    }
}
