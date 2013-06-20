package com.minco.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.minco.jpa.domain.AccountInfo;
import com.minco.jpa.domain.UserInfo;
import com.minco.jpa.persistence.UserDao;

import java.util.List;

/**
 * Author:ZhangJianPing  Time:11-9-14,下午5:10
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Transactional
    public AccountInfo createNewAccount(String username, String password, Integer initBalance) {
        AccountInfo accountInfo = new AccountInfo();

        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(username);
        userInfo.setPassword(password);

        accountInfo.setBalance(initBalance);
        accountInfo.setUserInfo(userInfo);

        return userDao.save(accountInfo);
    }

    public AccountInfo findAccountInfoById(Long id)
    {
        return userDao.findByAccountId(id);
    }

    public List<AccountInfo> findByBalanceGreaterThan(Integer balance,Pageable pageable){
        Page<AccountInfo> accounts = userDao.findByBalanceGreaterThan(balance,pageable);
        return accounts.getContent();
    }

	public int getUserCount() {
		return userDao.getUserCount();
	}
}
