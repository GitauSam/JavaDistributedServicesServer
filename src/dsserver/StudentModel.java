package dsserver;

public class StudentModel {
    String stdNo, firstName, middleName, surname, faculty, course;

    public StudentModel(String stdNo, String firstName, String middleName, String surname, String faculty, String course) {
        this.stdNo = stdNo;
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
        this.faculty = faculty;
        this.course = course;
    }

    public String getStdNo() {
        return stdNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getCourse() {
        return course;
    }
    
    
}
