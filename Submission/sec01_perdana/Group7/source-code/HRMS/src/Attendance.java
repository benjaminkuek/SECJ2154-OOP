class Attendance {
    private int attendanceID;
    private Employee employee;
    private String date;
    private double hoursWorked;

    public Attendance(int attendanceID, Employee employee, String date, double hoursWorked) {
        this.attendanceID = attendanceID;
        this.employee = employee;
        this.date = date;
        this.hoursWorked = hoursWorked;
    }

    public double calculateOvertime() {
        double regularHours = 8.0;
        double overtimeHours = Math.max(0, hoursWorked - regularHours);
        return overtimeHours;
    }

    public int getAttendanceID() {
        return attendanceID;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getDate() {
        return date;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public String getEmployeeFirstName() {
        return employee.getFirstName();
    }

    public String getEmployeeLastName() {
        return employee.getLastName();
    }

    public double getEmployeeHoursWorked() {
        return hoursWorked;
    }
}