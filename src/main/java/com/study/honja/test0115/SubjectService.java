package com.study.honja.test0115;

import java.util.List;

public class SubjectService {
    private  List<String> subjects;

    public SubjectService(List<String> subjects) {
        this.subjects = subjects;
    }

    public void showSubjects() {
        int length = 4;
        for (int i = 0; i < length; i++) {
            System.out.println(subjects.get(i));
        }
    }








}
