package com.hello.vo;

public class Board {

	private int boardNo;
	private String title;
	private String contents;
	private String image;

	public Board() {
	};
	
	public Board(int boardNo, String title, String contents, String image) {
        super();
        this.boardNo = boardNo;
        this.title = title;
        this.contents = contents;
        this.image = image;
    }

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}
