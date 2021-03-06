package com.school.system.domain;

public class Score {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.id
     *
     * @mbg.generated Thu Apr 04 16:31:56 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.score_student_id
     *
     * @mbg.generated Thu Apr 04 16:31:56 CST 2019
     */
    private Integer scoreStudentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.score_score
     *
     * @mbg.generated Thu Apr 04 16:31:56 CST 2019
     */
    private String scoreScore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column score.score_course_id
     *
     * @mbg.generated Thu Apr 04 16:31:56 CST 2019
     */
    private Integer scoreCourseId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.id
     *
     * @return the value of score.id
     *
     * @mbg.generated Thu Apr 04 16:31:56 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.id
     *
     * @param id the value for score.id
     *
     * @mbg.generated Thu Apr 04 16:31:56 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.score_student_id
     *
     * @return the value of score.score_student_id
     *
     * @mbg.generated Thu Apr 04 16:31:56 CST 2019
     */
    public Integer getScoreStudentId() {
        return scoreStudentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.score_student_id
     *
     * @param scoreStudentId the value for score.score_student_id
     *
     * @mbg.generated Thu Apr 04 16:31:56 CST 2019
     */
    public void setScoreStudentId(Integer scoreStudentId) {
        this.scoreStudentId = scoreStudentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.score_score
     *
     * @return the value of score.score_score
     *
     * @mbg.generated Thu Apr 04 16:31:56 CST 2019
     */
    public String getScoreScore() {
        return scoreScore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.score_score
     *
     * @param scoreScore the value for score.score_score
     *
     * @mbg.generated Thu Apr 04 16:31:56 CST 2019
     */
    public void setScoreScore(String scoreScore) {
        this.scoreScore = scoreScore == null ? null : scoreScore.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column score.score_course_id
     *
     * @return the value of score.score_course_id
     *
     * @mbg.generated Thu Apr 04 16:31:56 CST 2019
     */
    public Integer getScoreCourseId() {
        return scoreCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column score.score_course_id
     *
     * @param scoreCourseId the value for score.score_course_id
     *
     * @mbg.generated Thu Apr 04 16:31:56 CST 2019
     */
    public void setScoreCourseId(Integer scoreCourseId) {
        this.scoreCourseId = scoreCourseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbg.generated Thu Apr 04 16:31:56 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", scoreStudentId=").append(scoreStudentId);
        sb.append(", scoreScore=").append(scoreScore);
        sb.append(", scoreCourseId=").append(scoreCourseId);
        sb.append("]");
        return sb.toString();
    }
}