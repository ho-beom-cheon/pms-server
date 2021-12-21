package com.iteyes.dto.board;

import lombok.Data;

@Data
public class BoardDTO {
	private int seq;
	private String title;
	private String content;
	private String fileName;
	private String filePath;
	private int fileSize;
	private String writer;
	private String regDt;
	private String modifier;
	private String modDt;
}
