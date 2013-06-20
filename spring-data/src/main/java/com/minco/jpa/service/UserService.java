package com.minco.jpa.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.minco.jpa.domain.AccountInfo;

import java.util.List;

/**
 * Author:ZhangJianPing Time:11-9-14,下午5:10
 */

public interface UserService {
	public AccountInfo createNewAccount(String username, String password, Integer initBalance);

	public AccountInfo findAccountInfoById(Long id);

	public List<AccountInfo> findByBalanceGreaterThan(Integer balance, Pageable pageable);

	public int getUserCount();
}
