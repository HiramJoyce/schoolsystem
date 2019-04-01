package com.school.system.domain.dto;

public class CourseDto {
    private Integer id;
    private String cName;
    private Integer cMajorid;
    private String cMajorName;
    private Integer cTeacherid;
    private String cTeacherName;
    private Integer cWeekday;
    private Integer cTime;
    private String cPlace;
    private Integer cStudentid;
    private Integer cStudentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getcMajorid() {
        return cMajorid;
    }

    public void setcMajorid(Integer cMajorid) {
        this.cMajorid = cMajorid;
    }

    public String getcMajorName() {
        return cMajorName;
    }

    public void setcMajorName(String cMajorName) {
        this.cMajorName = cMajorName;
    }

    public Integer getcTeacherid() {
        return cTeacherid;
    }

    public void setcTeacherid(Integer cTeacherid) {
        this.cTeacherid = cTeacherid;
    }

    public String getcTeacherName() {
        return cTeacherName;
    }

    public void setcTeacherName(String cTeacherName) {
        this.cTeacherName = cTeacherName;
    }

    public Integer getcWeekday() {
        return cWeekday;
    }

    public void setcWeekday(Integer cWeekday) {
        this.cWeekday = cWeekday;
    }

    public Integer getcTime() {
        return cTime;
    }

    public void setcTime(Integer cTime) {
        this.cTime = cTime;
    }

    public String getcPlace() {
        return cPlace;
    }

    public void setcPlace(String cPlace) {
        this.cPlace = cPlace;
    }

    public Integer getcStudentid() {
        return cStudentid;
    }

    public void setcStudentid(Integer cStudentid) {
        this.cStudentid = cStudentid;
    }

    public Integer getcStudentName() {
        return cStudentName;
    }

    public void setcStudentName(Integer cStudentName) {
        this.cStudentName = cStudentName;
    }

    @Override
    public String toString() {
        return "CourseDto{" +
                "id=" + id +
                ", cName='" + cName + '\'' +
                ", cMajorid=" + cMajorid +
                ", cMajorName='" + cMajorName + '\'' +
                ", cTeacherid=" + cTeacherid +
                ", cTeacherName='" + cTeacherName + '\'' +
                ", cWeekday=" + cWeekday +
                ", cTime=" + cTime +
                ", cPlace='" + cPlace + '\'' +
                ", cStudentid=" + cStudentid +
                ", cStudentName=" + cStudentName +
                '}';
    }
}
