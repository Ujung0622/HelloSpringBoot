package com.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hello.service.BoardService;
import com.hello.vo.Board;

@Controller
public class IndexController {
	
    @Autowired
    private BoardService s;
    
    @RequestMapping(value="/init", method=RequestMethod.GET)
    public String init() {	
    	System.out.println("/controller-init");
    	return "init";
    }
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String root() {	
    System.out.println("/controller");
        return "index";
    }
    
    
    @RequestMapping(value="/index", method=RequestMethod.GET)
    public String index() {
        return "index";
    }
    
    @RequestMapping(value="/board", method=RequestMethod.GET)
    public String board() {
        return "board";
    }
	
    @RequestMapping(value="/boardList", method=RequestMethod.GET)
    @ResponseBody
    public List<Board> boardList(){
    	System.out.println("Controller");
        return s.getBoard();
    }
}