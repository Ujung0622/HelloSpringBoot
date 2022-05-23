package com.hello.vo;

public class Board {

	private int boardNo;
	private String title;
	private String contents;
	private String image;
	private String regDate;

	public Board() {
	};
	
	public Board(int boardNo, String title, String contents, String image, String regDate) {
        super();
        this.boardNo = boardNo;
        this.title = title;
        this.contents = contents;
        this.image = image;
        this.regDate = regDate;
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
	
	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

}
