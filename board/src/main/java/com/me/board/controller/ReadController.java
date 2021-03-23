package com.me.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.me.board.dto.ListVO;
import com.me.board.dto.pageDTO;
import com.me.board.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class ReadController {

		@Autowired
		private BoardService boardS;
		
		//게시물 목록
		@GetMapping(value="/list")
		public String boardList(ListVO listVO, Model model,
				@RequestParam(required=false, defaultValue="1") int page,
				@RequestParam(required=false, defaultValue="1") int range
				) {	//화면에서 보내온 데이터 중에 page를 받는다.
			
			//전체 게시글 개수
			int listCnt = boardS.getBoardListCnt();

			
			//page
			pageDTO pagination = new pageDTO();

			pagination.pageinfo(page, range, listCnt);
			model.addAttribute("pagination",pagination);
		
			List<ListVO> list = boardS.boardList(pagination);
			model.addAttribute("list",list);	
			System.out.println(list);
		return "myboard";
		}
		
		//게시물 조회
		@GetMapping(value="/view")
		public String writeView(@RequestParam("bno") int idx, Model model) {
			ListVO vo = boardS.detailView(idx);
			model.addAttribute("view", vo);
			return "detail";
		}
}
