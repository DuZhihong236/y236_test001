package cn.bdqn.Controller;

import cn.bdqn.Service.IAccountService;
import cn.bdqn.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Account")
public class AccountController {

    @Autowired
    @Qualifier("accountServiceImpl")
    IAccountService accountService;

    @RequestMapping("/queryAccount")
    public String queryAccount(Model model){
        List<Account> accounts= accountService.queryAll();
        model.addAttribute("accounts",accounts);

        return "accountList";
    }
}
