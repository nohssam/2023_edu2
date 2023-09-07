package com.ict.edu2.service.members;

import java.util.List;
import org.springframework.stereotype.Service;
import com.ict.edu2.mapper.members.Member_Mapper;
import com.ict.edu2.model.members.MemberVO;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class MemberService {
    
    @NonNull
    private Member_Mapper member_Mapper;

    
    public List<MemberVO> getList(){
        log.info("list-service");
        List<MemberVO> list = member_Mapper.member_list();
        return list;
    }

    public int getIDCnt(String id){
        int cnt = member_Mapper.getIDCnt(id);
        return cnt;
    }
    public int getMemberAdd(MemberVO vo){
        int cnt = member_Mapper.getMemberAdd(vo);
        return cnt;
    }
      public MemberVO getMemberOne(String id){
        MemberVO vo = member_Mapper.getMemberOne(id);
        return vo;
    }
}
