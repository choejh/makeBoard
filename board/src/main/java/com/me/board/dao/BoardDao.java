package com.me.board.dao;


import java.util.List;

import com.me.board.dto.ListVO;
import com.me.board.dto.WriteDTO;

public interface BoardDao {

	int insertWrite(WriteDTO dto);
	
	List<ListVO> printList(ListVO listvo);
}
