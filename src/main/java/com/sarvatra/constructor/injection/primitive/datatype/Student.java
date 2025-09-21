package com.sarvatra.constructor.injection.primitive.datatype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private static final Logger logger = LoggerFactory.getLogger(Student.class);

    public Student() {
    }

    public Student(int studentId, String studentName, String studentAddress) {
        logger.info("Set Data using constructor Injection");
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }


    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }


    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", studentName='" + studentName + '\'' + ", studentAddress='" + studentAddress + '\'' + "}";
    }

}