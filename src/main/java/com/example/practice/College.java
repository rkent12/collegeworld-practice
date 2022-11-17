package com.example.practice;

public class College {
    private int college_id;
    private String name;
    private int owner_id;
    private int funds;
    private int max_capacity;
    private int num_students;
    private int current_week;
    private int current_semester;

    public College(String name, int college_id, int user_id) {
        this.college_id = college_id;
        this.owner_id = user_id;
        this.name = name;
        this.funds = 100000;
        this.max_capacity = 100;
        this.num_students = 80;
        this.current_week = 1;
        this.current_semester = 1;
    }




}
