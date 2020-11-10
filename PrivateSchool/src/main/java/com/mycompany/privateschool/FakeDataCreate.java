package com.mycompany.privateschool;

public class FakeDataCreate {

    FakeDataCreate() {
    }

    public static void intializeLists() {
        //Initialize Students
        Student s1 = new Student("Klemens", "Habgood",
                ConvertDateLong.convertDate("05/12/1994"), 5000);
        Student s2 = new Student("Rina", "Vasilchenko",
                ConvertDateLong.convertDate("06/06/1994"), 5000);
        Student s3 = new Student("Tabina", "Steinhammer",
                ConvertDateLong.convertDate("20/08/1992"), 5000);
        Student s4 = new Student("Johanna", "Stanislaw",
                ConvertDateLong.convertDate("27/03/1994"), 5000);
        Student s5 = new Student("Leila", "Pierce",
                ConvertDateLong.convertDate("04/10/1993"), 5000);
        Student s6 = new Student("Marten", "Kowalski",
                ConvertDateLong.convertDate("05/09/1995"), 5000);
        Student s7 = new Student("Elladine", "Shorrock",
                ConvertDateLong.convertDate("22/08/1996"), 5000);
        Student s8 = new Student("Sanderson", "Tankard",
                ConvertDateLong.convertDate("07/04/1992"), 5000);
        Student s9 = new Student("Lindsy", "Matches",
                ConvertDateLong.convertDate("10/02/1995"), 5000);
        Student s10 = new Student("Teador", "Middup",
                ConvertDateLong.convertDate("27/11/1995"), 5000);

        AddDataLists.AddStudentsLists(s1);
        AddDataLists.AddStudentsLists(s2);
        AddDataLists.AddStudentsLists(s3);
        AddDataLists.AddStudentsLists(s4);
        AddDataLists.AddStudentsLists(s5);
        AddDataLists.AddStudentsLists(s6);
        AddDataLists.AddStudentsLists(s7);
        AddDataLists.AddStudentsLists(s8);
        AddDataLists.AddStudentsLists(s9);
        AddDataLists.AddStudentsLists(s10);

        //Initialize Courses
        TitleName course1 = new TitleName("Course1");
        TitleName course2 = new TitleName("Course2");
        TitleName course3 = new TitleName("Course3");
        TitleName course4 = new TitleName("Course4");

        long fullTimeStartDate = ConvertDateLong.convertDate("01/04/2021");
        long fullTimeEndDate = ConvertDateLong.convertDate("31/05/2021");
        long partTimeStartDate = ConvertDateLong.convertDate("01/03/2021");
        long partTimeEndDate = ConvertDateLong.convertDate("31/05/2021");

        Course c1 = new Course(course3, "Mathematics", "FullTime",
                fullTimeStartDate, fullTimeEndDate);
        Course c2 = new Course(course3, "Mathematics", "PartTime",
                partTimeStartDate, partTimeEndDate);
        Course c3 = new Course(course2, "Programming", "FullTime",
                partTimeStartDate, partTimeEndDate);
        Course c4 = new Course(course2, "Programming", "PartTime",
                partTimeStartDate, partTimeEndDate);
        Course c5 = new Course(course1, "Networking", "FullTime",
                partTimeStartDate, partTimeEndDate);
        Course c6 = new Course(course1, "Networking", "PartTime",
                partTimeStartDate, partTimeEndDate);
        Course c7 = new Course(course4, "DataBase", "FulltimeTime",
                partTimeStartDate, partTimeEndDate);
        Course c8 = new Course(course4, "DataBase", "PartTime",
                partTimeStartDate, partTimeEndDate);

        AddDataLists.AddCourseList(c1);
        AddDataLists.AddCourseList(c2);
        AddDataLists.AddCourseList(c3);
        AddDataLists.AddCourseList(c4);
        AddDataLists.AddCourseList(c5);
        AddDataLists.AddCourseList(c6);
        AddDataLists.AddCourseList(c7);
        AddDataLists.AddCourseList(c8);

        //Initialize Trainer
        Trainer t1 = new Trainer("Corissa", "Abrahim", "Programming");
        Trainer t2 = new Trainer("Judith", "Howatt", "Networking");
        Trainer t3 = new Trainer("Merry", "Kenewell", "Database");
        AddDataLists.AddTrainer(t1);
        AddDataLists.AddTrainer(t2);
        AddDataLists.AddTrainer(t3);

        //Initialize Assignment
        TitleName title1 = new TitleName("Assignment1");
        TitleName title2 = new TitleName("Assignment2");
        TitleName title3 = new TitleName("Assignment3");
        TitleName title4 = new TitleName("Assignment4");

        Assignment a1 = new Assignment(title1, "Create an Assignment1",
                ConvertDateLong.convertDate("08/04/2021"));
        Assignment a2 = new Assignment(title2, "Create an Assignment2",
                ConvertDateLong.convertDate("08/04/2021"));
        Assignment a3 = new Assignment(title3, "Create an Assignment3",
                ConvertDateLong.convertDate("08/04/2021"));
        Assignment a4 = new Assignment(title4, "Create an Assignment4",
                ConvertDateLong.convertDate("08/04/2021"));
        AddDataLists.AddAssignment(a1);
        AddDataLists.AddAssignment(a2);
        AddDataLists.AddAssignment(a3);
        AddDataLists.AddAssignment(a4);
        
        //----------------------
        //Set Students per Course
        ControllerData.setStudentsPCourse(c1, s2);
        ControllerData.setStudentsPCourse(c1, s3);
//        ControllerData.setTrainerToCourse(c1, t3);
//        ControllerData.setTrainerToCourse(c2, t2);
        
    }
}
