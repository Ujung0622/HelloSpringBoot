package com.hello.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.hello.vo.Board;

@Mapper
@Repository("BoardMapper")
public interface BoardMapper {

	public boolean addBoard(Board b);

	public List<Board> getBoard();

	public Board getBoardOne(int idx);

	//    public boolean addReply(Reply r);

	//    public List<Reply> getReply(int boardIdx);

}