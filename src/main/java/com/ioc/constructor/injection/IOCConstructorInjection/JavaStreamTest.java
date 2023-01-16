package com.ioc.constructor.injection.IOCConstructorInjection;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class JavaStreamTest {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setName("Ram");
        student1.setRollNo(12);

        Student student2 = new Student();
        student2.setName("Shyam");
        student2.setRollNo(13);

        List<Student> listWithDuplicates = Arrays.asList(student1, student2);

        System.out.println(listWithDuplicates);
        Map<Integer, String> collect = listWithDuplicates
                .stream()
                .collect(toMap(Student::getRollNo, Student::getName, (item, identicalItem) -> item));
        System.out.println(collect);

        IntSummaryStatistics collect1 = listWithDuplicates.stream().collect(Collectors.summarizingInt(Student::getRollNo));
        System.out.println(collect1.getSum());

        }
    public static class Student {

        private String name;
        private int rollNo;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", rollNo=" + rollNo +
                    '}';
        }
    }
}
