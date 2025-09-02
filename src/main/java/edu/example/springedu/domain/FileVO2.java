package edu.example.springedu.domain;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
@Getter
@AllArgsConstructor
public class FileVO2 {
	private MultipartFile[] uploadFiles;
}
