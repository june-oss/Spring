package com.june.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.june.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;

	@Test
	public void insertTest() {
		
		BoardVO board = new BoardVO();
		
		board.setContent("Test");
		board.setTitle("Test");
		board.setWriter("user");
		
		mapper.insertSelectKey(board);
		
		log.info(board);
		
		
	}
}
