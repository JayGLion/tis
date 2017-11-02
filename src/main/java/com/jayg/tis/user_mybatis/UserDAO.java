/*
package com.jayg.tis.user;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
	@Autowired
	private SqlSession sqlSession;
	
	public List<UserVO> selectUserList() {
		return sqlSession.selectList("userMapper.selectUserList");
	}
}
*/