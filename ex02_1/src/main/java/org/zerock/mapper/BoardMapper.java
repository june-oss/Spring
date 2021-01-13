package org.zerock.mapper;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

//Mapper 인터페이스를 작성할때는 select, insert 작업을 우선해서 작성!
//인터페이서를 작성할 때는 이미 작성된 BoardVO클래스를 적적 활용
public interface BoardMapper {

	//SQL문을 작성할때 반드시 ; 없이 작성
	//@Select("select * from tbl_board2 where bno > 0")
	public List<BoardVO> getList();
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	public void insert(BoardVO board);
	
	public void insertSelectKey(BoardVO board);
	
	public BoardVO read(Long bno);
	
	public int delete(Long bno);
	
	public int update(BoardVO board);
	
	public int getTotalCount(Criteria cri);
}
