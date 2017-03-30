package com.ukyi.persistence;

import com.ukyi.domain.MemberVO;

public interface MemberDAO {
	public String getTime();
	public void insertMember(MemberVO vo);
}
