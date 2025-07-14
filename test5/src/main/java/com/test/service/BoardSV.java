package com.test.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.test.domain.BoardVO;
import com.test.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class BoardSV{

	private BoardMapper mapper;
	
	public List<BoardVO> getList() {
		log.info("BoardSV.getList 메서드 실행.....");
		while (mapper.getList()) {
			S
		}
		return ;
	}
	
	public BoardVO select(int bno) {
		// 게시물의 번호가 들어가면 메퍼의 select문이 동작해야 한다.
		log.info("BoardServiceImpl.get메서드 실행.....");
		return mapper.select(bno);
	}

	public int update(BoardVO boardVO) {
		
		return mapper.update(boardVO);
	}

	
	




	
		


		

	}
}
