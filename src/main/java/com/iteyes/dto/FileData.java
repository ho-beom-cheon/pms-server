package com.iteyes.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class FileData {
    private String sqno;
    private String file_nm;
    private String file_path;
    private String org_file_nm;
    private String rmrmk;
    private String file;
}
