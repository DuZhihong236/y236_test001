package cn.bdqn.Mapper;

import cn.bdqn.domain.Account;
import org.springframework.stereotype.Component;

import java.util.List;

public interface IAccountMapper {

    //查询所有
    public List<Account> selectAll();

    //保存方法
    public void insert();
}
