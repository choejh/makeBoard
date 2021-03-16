package com.me.board.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.board.dao.BoardDao;
import com.me.board.dto.WriteDTO;

@Service
public class WriteService {

	private BoardDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public int write(WriteDTO dto) {
		dao = template.getMapper(BoardDao.class);
		dao.insertWrite(dto);
		return 1;
	}
	
}
