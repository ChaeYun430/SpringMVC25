package com.test.mapper;

import java.util.List;

import com.test.domain.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	
	public int update(BoardVO boardVO);

	public BoardVO select(int bno);

}
