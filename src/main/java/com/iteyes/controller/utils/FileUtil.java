package com.iteyes.controller.utils;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class FileUtil {

	private static String uploadDir;

	@Value("${file-upload-dir}")
	private void setClientId(String temp) {
		FileUtil.uploadDir = temp;
	}

	public boolean uploadFileList(MultipartFile[] files) throws IOException
	{
		boolean result = false ;

		StringBuffer sbOriFileName = new StringBuffer();
		StringBuffer sbNewFileName = new StringBuffer();

		for (MultipartFile file : files) {

			sbOriFileName.append(file.getOriginalFilename()) ;
			// 파일명 암호화
			sbNewFileName.append(UUID.randomUUID().toString().replaceAll("-", "")) ;
			// 암호화 된 파일명에 확장자 입력
			sbNewFileName.append("." + FilenameUtils.getExtension(sbOriFileName.toString()));

			File fileInfo = new File(uploadDir, sbNewFileName.toString());

			try {
				file.transferTo(fileInfo) ;

				result = true;

			} catch (IOException e) {
				log.error("File Upload Error", e);
				result = false;
			}
		}
		log.debug("## File Upload End") ;

		return result ;
	}
}
