package com.fpt.ntd.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.fpt.ntd.R;
import com.fpt.ntd.database.Employee;

import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter {
    Activity activity;
    List<Employee> employeeList;

    public EmployeeAdapter(Activity activity, List<Employee> employeeList) {
        this.activity = activity;
        this.employeeList = employeeList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = activity.getLayoutInflater().inflate(R.layout.item_emp,parent, false);
        EmployeeHolder holder = new EmployeeHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        EmployeeHolder vh = (EmployeeHolder) holder;
        Employee model = employeeList.get(position);
        vh.tvEmpName.setText(model.empName);
        vh.tvSalary.setText(model.salary);
        vh.tvDesignation.setText(model.designation);
    }

    @Override
    public int getItemCount() {
        return employeeList.size();
    }

    public class EmployeeHolder extends RecyclerView.ViewHolder{

        TextView tvEmpName, tvSalary, tvDesignation;

        public EmployeeHolder(@NonNull View itemView) {
            super(itemView);
            tvEmpName = itemView.findViewById(R.id.tvEmpName);
            tvSalary = itemView.findViewById(R.id.tvSalary);
            tvDesignation = itemView.findViewById(R.id.tvDesignation);
        }
    }
}
