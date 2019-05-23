package vn.poly.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ListView lvList;

    private List<Student> students;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvList = findViewById(R.id.lvList);

        students = new ArrayList<>();

        for (int i = 0; i < 15; i++) {


            Student student = new Student();

            student.setId(String.valueOf(i));
            student.setName("Huy Nguyen " + i);
            student.setNumberPhone("0913456789");
            students.add(student);

        }


        StudentAdapter studentAdapter = new StudentAdapter(MainActivity.this,students);

        lvList.setAdapter(studentAdapter);
    }
}
