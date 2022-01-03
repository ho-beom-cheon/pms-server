package com.iteyes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String userId;            /*ID*/
    private String password;          /*패스워드*/
    private String pjt_selected;      /*프로젝트명*/
}
