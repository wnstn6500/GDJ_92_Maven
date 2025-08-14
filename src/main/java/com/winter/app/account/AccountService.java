package com.winter.app.account;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winter.app.members.MemberVO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO accountDAO;
	
	public int add(Long [] productNum, MemberVO memberVO)throws Exception{
		List<AccountVO> list = new ArrayList<>();
		
		for(Long num:productNum) {
			AccountVO accountVO = new AccountVO();
			accountVO.setUsername(memberVO.getUsername());
			accountVO.setProductNum(num);
			accountVO.setAccountNum(String.valueOf(System.currentTimeMillis()));
			list.add(accountVO);
			Thread.sleep(10);
		}
		
		return accountDAO.add(list);
	}

}
