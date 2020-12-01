package cn.bdqn.Service;

import cn.bdqn.domain.Account;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IAccountService {

    //查询所有
    public List<Account> queryAll();

    //保存方法
    public void save();
}
