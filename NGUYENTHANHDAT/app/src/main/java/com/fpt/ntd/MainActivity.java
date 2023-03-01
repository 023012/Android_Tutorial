package com.fpt.ntd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.fpt.ntd.adapter.EmployeeAdapter;
import com.fpt.ntd.database.AppDatabase;
import com.fpt.ntd.database.Employee;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    RecyclerView rvEmployee;

    EditText edEmpName,edDesignation,edSalary;
    Button btnAddEmp, btnUpdateEmp, btnDeleteEmp;
    AppDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=AppDatabase.getAppDatabase(this);
        edEmpName = findViewById(R.id.edEmpName);
        edDesignation = findViewById(R.id.edDesignation);
        edSalary = findViewById(R.id.edSalary);
        btnAddEmp = findViewById(R.id.btnAddEmp);
        btnUpdateEmp = findViewById(R.id.btnUpdateEmp);
        btnDeleteEmp = findViewById(R.id.btnDeleteEmp);
        btnAddEmp.setOnClickListener(this);


        List<Employee> list = db.employeeDao().getAllEmployee();
        EmployeeAdapter adapter = new EmployeeAdapter(this,list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rvEmployee=findViewById(R.id.rvEmployee);
        rvEmployee.setLayoutManager(layoutManager);
        rvEmployee.setAdapter(adapter);
    }

    private void AddEmployee(){
        if (!validate()){
            return;
        }
        Employee emp = new Employee();
        emp.empName = edEmpName.getText().toString();
        emp.designation=edDesignation.getText().toString();
        emp.salary=edSalary.getText().toString();
        long id = db.employeeDao().insertEmployee(emp);
        if (id>0){
            Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show();
        }
        goToEmpList();
    }

//    private void DeleteEmp(){
//        db.employeeDao().deleteEmployee();
//    }
    private void goToEmpList(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private boolean validate(){
        String mes = null;
        if (edEmpName.getText().toString().trim().isEmpty()){
            mes="Chưa nhập emp name";
        } else if (edDesignation.getText().toString().trim().isEmpty()) {
            mes="Chưa nhập degisgnation";

        }  else if (edSalary.getText().toString().trim().isEmpty()) {
            mes="Chưa nhập salary";
        }
        if(mes!=null){
            Toast.makeText(this,mes,Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnAddEmp:
                AddEmployee();
                break;
//            case R.id.btnUpdateEmp:
//                break;
            case R.id.btnDeleteEmp:
                break;
            default:
                break;
        }
    }
}