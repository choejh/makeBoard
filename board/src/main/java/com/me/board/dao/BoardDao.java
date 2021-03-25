package com.me.board.dao;


import java.util.List;

import com.me.board.dto.ListVO;
import com.me.board.dto.WriteDTO;

public interface BoardDao {

	int insertWrite(WriteDTO dto);
	
	List<ListVO> printList();
	
	int getBoardListCnt(); 
	
	//게시물상세조회
	ListVO getDetailedView(int idx);
	
	//게시물 수정
	void modify(ListVO vo);
	
	//게시물 삭제
	void deleteList(int idx);
	
	//게시물 목록+페이징
	List<ListVO> listPage(int displayPost, int postNum);
	
}
