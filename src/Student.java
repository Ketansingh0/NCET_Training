class Student {
    private String name;
    private int rollNo;
    private double cgpa;
    private String department;

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getCgpa() {
        return cgpa;
    }

    public String getDepartment() {
        return department;
    }
}