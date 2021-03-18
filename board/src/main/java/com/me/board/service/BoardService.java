package com.me.board.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.board.dao.BoardDao;
import com.me.board.dto.ListVO;

@Service
public class BoardService {

	private BoardDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public List<ListVO> boardList(ListVO listvo){
		dao = template.getMapper(BoardDao.class);
		return dao.printList(listvo);
	}
	
}
