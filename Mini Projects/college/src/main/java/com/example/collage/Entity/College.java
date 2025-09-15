package com.example.collage.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="college_table")
public class College {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @Column(name = "Clg-name")
        private String name;

        @Column(name = "clg-type")
        private  String type;

        @Column(name = "Branch")
        private String specialization;

        @Column(name = "No of Students")
        private int student;

        @Column(name = "Location ")
        private String address;

        @Column(name = "Cut off")
        private double cutOff;

        public College() {
    }

    public College(String name, String type, String specialization, int student, String address, double cutOff) {
        this.name = name;
        this.type = type;
        this.specialization = specialization;
        this.student = student;
        this.address = address;
        this.cutOff = cutOff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getCutOff() {
        return cutOff;
    }

    public void setCutOff(double cutOff) {
        this.cutOff = cutOff;
    }

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", specialization='" + specialization + '\'' +
                ", student=" + student +
                ", address='" + address + '\'' +
                ", cutOff=" + cutOff +
                '}';
    }
}
