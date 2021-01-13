package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardMapper {

	// xml에 sql문이 처리되어서 삭제
//	@Select("select * from tbl_board where bno > 0")
	public List<BoardVO> getList();
	
	// 페이징처리 사용
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);
	
	public int getTotalCount(Criteria cir);
	
}


