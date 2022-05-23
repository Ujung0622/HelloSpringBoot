package com.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hello.mapper.BoardMapper;
import com.hello.vo.Board;


@Service
public class BoardService {
	@Autowired private BoardMapper m;
	
    public List<Board> getBoard(){
        return m.getBoard();
    }
}