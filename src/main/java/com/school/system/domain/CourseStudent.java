package com.school.system.domain;

public class CourseStudent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_student.id
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_student.cs_course_id
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    private Integer csCourseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column course_student.cs_student_id
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    private Integer csStudentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_student.id
     *
     * @return the value of course_student.id
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_student.id
     *
     * @param id the value for course_student.id
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_student.cs_course_id
     *
     * @return the value of course_student.cs_course_id
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public Integer getCsCourseId() {
        return csCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_student.cs_course_id
     *
     * @param csCourseId the value for course_student.cs_course_id
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public void setCsCourseId(Integer csCourseId) {
        this.csCourseId = csCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column course_student.cs_student_id
     *
     * @return the value of course_student.cs_student_id
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public Integer getCsStudentId() {
        return csStudentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column course_student.cs_student_id
     *
     * @param csStudentId the value for course_student.cs_student_id
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public void setCsStudentId(Integer csStudentId) {
        this.csStudentId = csStudentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_student
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", csCourseId=").append(csCourseId);
        sb.append(", csStudentId=").append(csStudentId);
        sb.append("]");
        return sb.toString();
    }
}