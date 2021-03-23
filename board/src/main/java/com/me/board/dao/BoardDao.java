package com.me.board.dao;


import java.util.List;

import com.me.board.dto.ListVO;
import com.me.board.dto.WriteDTO;
import com.me.board.dto.pageDTO;

public interface BoardDao {

	int insertWrite(WriteDTO dto);
	
	List<ListVO> printList(pageDTO pagination);
	
	int getBoardListCnt(); 
	
	//게시물상세조회
	ListVO getDetailedView(int idx);
	
	//게시물 수정
	void modify(ListVO vo);
	
	void deleteList(int idx);
}
