package com.june.mapper;

import java.util.List;

import com.june.domain.BoardVO;
import com.june.domain.Criteria;

public interface BoardMapper {

	public void insertSelectKey(BoardVO board);
	
	public BoardVO get(Long bno);
	
	public List<BoardVO> getListWithPage(Criteria cri);
	
	public int update(BoardVO board);
	
	public int remove(Long bno);
	
}
