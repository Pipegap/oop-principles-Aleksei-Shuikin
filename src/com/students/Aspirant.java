package com.students;

public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(String firstName, String lastName, String group, int averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;
    }

    @Override
    public int getScholarship() {
        return (super.averageMark == 5) ? 7000 : 4500;
    }
}
