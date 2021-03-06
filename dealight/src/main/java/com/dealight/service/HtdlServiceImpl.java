package com.dealight.service;
import org.springframework.stereotype.Service;

import com.dealight.mapper.HtdlMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
@Service
@RequiredArgsConstructor
@Log4j
public class HtdlServiceImpl implements HtdlService {
	private final HtdlMapper htdlMapper;
//	private final StoreMenuMapper menuMapper;
	
//	@Transactional
//	@Override
//	public void register(HtdlVO vo, List<HtdlDtlsVO> dtlsList) {
//		// TODO Auto-generated method stub
//		
//		log.info("register....");
//		
//		//핫딜 등록
//		htdlMapper.insertSelectKey(vo);
//		Long sequence = htdlMapper.getSeqHtdl();
//		
//		//핫딜 메뉴가 하나이상 일 때
//		if(dtlsList.size()>1) {
//			
//			dtlsList.forEach(dtls -> dtls.setHtdlId(sequence));
//			htdlMapper.insertDtlsList(dtlsList);
//			return;
//		}
//			HtdlDtlsVO firstDtlsVO = dtlsList.get(0);
//			firstDtlsVO.setHtdlId(sequence);
//			htdlMapper.insertDtls(firstDtlsVO);
//	}
//	
//	@Override
//	public List<HtdlVO> getList() {
//		// TODO Auto-generated method stub
//		
//		log.info("get List....");
//		return htdlMapper.getHtdlList();
//	}
//	@Override
//	public HtdlVO read(Long htdlId) {
//		// TODO Auto-generated method stub
//		log.info("read.....");
//		return htdlMapper.findHtdlById(htdlId);
//	}
//	
//	@Override
//	public boolean modify(HtdlVO vo) {
//		// TODO Auto-generated method stub
//		log.info("modify....");
//		return false;
//	}
//	
//	@Transactional
//	@Override
//	public boolean remove(Long htdlId) {
//		// TODO Auto-generated method stub
//		log.info("remove.....");
//		
//		//현재 핫딜 존재하는 지 확인
//		//현재 핫딜이 시작 전에만 취소 가능
//		HtdlVO findHtdl = htdlMapper.findHtdlById(htdlId);
//		Optional.ofNullable(findHtdl)
//		.orElseThrow(()-> new IllegalArgumentException(htdlId+"번 핫딜은 존재하지 않습니다." ));
//		
//		//핫딜 상세 존재하는 지 확인
//		List<HtdlDtlsVO> findDtlsList = htdlMapper.findDtlsById(htdlId);
//		Optional.ofNullable(findHtdl)
//		.orElseThrow(()-> new IllegalArgumentException(htdlId+"번 핫딜 상세는 존재하지 않습니다." ));
//		
//		if(!(findHtdl.getStusCd().equalsIgnoreCase("p")))
//			throw new IllegalArgumentException("현재 핫딜 취소는 불가능합니다.");
//			
//		
//		return htdlMapper.delete(htdlId) == 1 && htdlMapper.deleteDtls(htdlId) == findDtlsList.size();
//	}
//	@Async
//	@Override
//	public void asyncMethodTest() {
//		log.info("==============async meyhod : " + Thread.currentThread().getName());
//	}
//	@Override
//	public List<StoreMenuVO> findById(Long storeId) {
//		// TODO Auto-generated method stub
//		log.info("find menus....");
//		return menuMapper.findById(storeId);
//	}
//	@Override
//	public MenuDTO findPriceByName(Long storeId, String name) {
//		// TODO Auto-generated method stub
//		log.info("find price....");
//		return menuMapper.findPriceByName(storeId, name);
//	}
	
}