package com.me.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.me.board.dto.ListVO;
import com.me.board.service.BoardService;

@Controller
@RequestMapping("/list")
public class ReadController {

		@Autowired
		private BoardService boardS;
		
		@GetMapping
		public String boardList(ListVO listVO, Model model) {	

			List<ListVO> list = boardS.boardList(listVO);
			model.addAttribute("list",list);	
			System.out.println(list);
		return "myboard";
		}
}
