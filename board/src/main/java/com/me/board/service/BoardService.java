package com.me.board.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.me.board.dao.BoardDao;
import com.me.board.dto.ListVO;
import com.me.board.dto.WriteDTO;
import com.me.board.dto.pageDTO;

@Service
public class BoardService {

	private BoardDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	//페이지
	public List<ListVO> boardList(pageDTO pagination){
		dao = template.getMapper(BoardDao.class);
		return dao.printList(pagination);
	}
	
	//총 게시글 개수 확인
	public int getBoardListCnt() {
		dao = template.getMapper(BoardDao.class);
		return dao.getBoardListCnt();
	}
	
	//게시물 조회
	public ListVO detailView(int idx) {
		dao = template.getMapper(BoardDao.class);
		return dao.getDetailedView(idx);
	}
	
	//게시물 수정
	public void modify(ListVO vo) {
		dao = template.getMapper(BoardDao.class);
		dao.modify(vo);
	}
	
	//게시물 삭제
	public void delete(int idx) {
		dao = template.getMapper(BoardDao.class);
		dao.deleteList(idx);
	}
	
}
