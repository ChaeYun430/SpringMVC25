package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.test.domain.BoardVO;
import com.test.service.BoardSV;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/board/*") 
@AllArgsConstructor 
public class BoardController {

	BoardSV boardSV = new BoardSV();
	
	@GetMapping("/list") 
	public void list(Model model) {
		log.info("BoardController.list메서드 실행.....");
		model.addAttribute("list", boardSV.getList());
	}
	

	@GetMapping("/select") 
	public void select(@RequestParam("bno")int bno, Model model) {
		log.info("BoardController.select 메서드 실행.....");
		model.addAttribute("selectedBoard", boardSV.select(bno));
	}
	
	
	@PostMapping("/modify") 
	public String modify(BoardVO boardVO, RedirectAttributes rttr) {
		log.info("BoardController.modify 메서드 실행.....");
		if(boardSV.update(boardVO)>0) {
			rttr.addFlashAttribute("result","success");
		}
		return "redirect:/board/list";
	}
}