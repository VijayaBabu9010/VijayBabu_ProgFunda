package com.gl.oops;



public class HrDepartment extends SuperDepartment {
    
    public String departmentName() {
        return "Welcome to HR Department";
    }
    
    public String getTodaysWork() {
        return "Fill todays timesheet and mark your attendance";
    }

    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    public String doActivity() {
        return "Team Lunch";
    }
}