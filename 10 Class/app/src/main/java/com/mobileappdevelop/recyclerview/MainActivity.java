package com.mobileappdevelop.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Student> studentArrayList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        init();
        getStudentData();


    }

    private void getStudentData() {
        Student student1 = new Student("Azad", "Male", "246704", 1, "BITM-06");
        Student student2 = new Student("Sofiq", "Male", "246704", 1, "BITM-06");

        studentArrayList.add(student1);
        studentArrayList.add(student2);

    }

    private void init() {
        studentArrayList = new ArrayList<>();


    }


}
