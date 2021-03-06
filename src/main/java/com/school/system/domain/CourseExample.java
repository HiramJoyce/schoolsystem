package com.school.system.domain;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public CourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseTeacheridIsNull() {
            addCriterion("course_teacherid is null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacheridIsNotNull() {
            addCriterion("course_teacherid is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTeacheridEqualTo(Integer value) {
            addCriterion("course_teacherid =", value, "courseTeacherid");
            return (Criteria) this;
        }

        public Criteria andCourseTeacheridNotEqualTo(Integer value) {
            addCriterion("course_teacherid <>", value, "courseTeacherid");
            return (Criteria) this;
        }

        public Criteria andCourseTeacheridGreaterThan(Integer value) {
            addCriterion("course_teacherid >", value, "courseTeacherid");
            return (Criteria) this;
        }

        public Criteria andCourseTeacheridGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_teacherid >=", value, "courseTeacherid");
            return (Criteria) this;
        }

        public Criteria andCourseTeacheridLessThan(Integer value) {
            addCriterion("course_teacherid <", value, "courseTeacherid");
            return (Criteria) this;
        }

        public Criteria andCourseTeacheridLessThanOrEqualTo(Integer value) {
            addCriterion("course_teacherid <=", value, "courseTeacherid");
            return (Criteria) this;
        }

        public Criteria andCourseTeacheridIn(List<Integer> values) {
            addCriterion("course_teacherid in", values, "courseTeacherid");
            return (Criteria) this;
        }

        public Criteria andCourseTeacheridNotIn(List<Integer> values) {
            addCriterion("course_teacherid not in", values, "courseTeacherid");
            return (Criteria) this;
        }

        public Criteria andCourseTeacheridBetween(Integer value1, Integer value2) {
            addCriterion("course_teacherid between", value1, value2, "courseTeacherid");
            return (Criteria) this;
        }

        public Criteria andCourseTeacheridNotBetween(Integer value1, Integer value2) {
            addCriterion("course_teacherid not between", value1, value2, "courseTeacherid");
            return (Criteria) this;
        }

        public Criteria andCourseWeekdayIsNull() {
            addCriterion("course_weekday is null");
            return (Criteria) this;
        }

        public Criteria andCourseWeekdayIsNotNull() {
            addCriterion("course_weekday is not null");
            return (Criteria) this;
        }

        public Criteria andCourseWeekdayEqualTo(Integer value) {
            addCriterion("course_weekday =", value, "courseWeekday");
            return (Criteria) this;
        }

        public Criteria andCourseWeekdayNotEqualTo(Integer value) {
            addCriterion("course_weekday <>", value, "courseWeekday");
            return (Criteria) this;
        }

        public Criteria andCourseWeekdayGreaterThan(Integer value) {
            addCriterion("course_weekday >", value, "courseWeekday");
            return (Criteria) this;
        }

        public Criteria andCourseWeekdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_weekday >=", value, "courseWeekday");
            return (Criteria) this;
        }

        public Criteria andCourseWeekdayLessThan(Integer value) {
            addCriterion("course_weekday <", value, "courseWeekday");
            return (Criteria) this;
        }

        public Criteria andCourseWeekdayLessThanOrEqualTo(Integer value) {
            addCriterion("course_weekday <=", value, "courseWeekday");
            return (Criteria) this;
        }

        public Criteria andCourseWeekdayIn(List<Integer> values) {
            addCriterion("course_weekday in", values, "courseWeekday");
            return (Criteria) this;
        }

        public Criteria andCourseWeekdayNotIn(List<Integer> values) {
            addCriterion("course_weekday not in", values, "courseWeekday");
            return (Criteria) this;
        }

        public Criteria andCourseWeekdayBetween(Integer value1, Integer value2) {
            addCriterion("course_weekday between", value1, value2, "courseWeekday");
            return (Criteria) this;
        }

        public Criteria andCourseWeekdayNotBetween(Integer value1, Integer value2) {
            addCriterion("course_weekday not between", value1, value2, "courseWeekday");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIsNull() {
            addCriterion("course_time is null");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIsNotNull() {
            addCriterion("course_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTimeEqualTo(Integer value) {
            addCriterion("course_time =", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotEqualTo(Integer value) {
            addCriterion("course_time <>", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeGreaterThan(Integer value) {
            addCriterion("course_time >", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_time >=", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeLessThan(Integer value) {
            addCriterion("course_time <", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeLessThanOrEqualTo(Integer value) {
            addCriterion("course_time <=", value, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeIn(List<Integer> values) {
            addCriterion("course_time in", values, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotIn(List<Integer> values) {
            addCriterion("course_time not in", values, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeBetween(Integer value1, Integer value2) {
            addCriterion("course_time between", value1, value2, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCourseTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("course_time not between", value1, value2, "courseTime");
            return (Criteria) this;
        }

        public Criteria andCoursePlaceIsNull() {
            addCriterion("course_place is null");
            return (Criteria) this;
        }

        public Criteria andCoursePlaceIsNotNull() {
            addCriterion("course_place is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePlaceEqualTo(String value) {
            addCriterion("course_place =", value, "coursePlace");
            return (Criteria) this;
        }

        public Criteria andCoursePlaceNotEqualTo(String value) {
            addCriterion("course_place <>", value, "coursePlace");
            return (Criteria) this;
        }

        public Criteria andCoursePlaceGreaterThan(String value) {
            addCriterion("course_place >", value, "coursePlace");
            return (Criteria) this;
        }

        public Criteria andCoursePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("course_place >=", value, "coursePlace");
            return (Criteria) this;
        }

        public Criteria andCoursePlaceLessThan(String value) {
            addCriterion("course_place <", value, "coursePlace");
            return (Criteria) this;
        }

        public Criteria andCoursePlaceLessThanOrEqualTo(String value) {
            addCriterion("course_place <=", value, "coursePlace");
            return (Criteria) this;
        }

        public Criteria andCoursePlaceLike(String value) {
            addCriterion("course_place like", value, "coursePlace");
            return (Criteria) this;
        }

        public Criteria andCoursePlaceNotLike(String value) {
            addCriterion("course_place not like", value, "coursePlace");
            return (Criteria) this;
        }

        public Criteria andCoursePlaceIn(List<String> values) {
            addCriterion("course_place in", values, "coursePlace");
            return (Criteria) this;
        }

        public Criteria andCoursePlaceNotIn(List<String> values) {
            addCriterion("course_place not in", values, "coursePlace");
            return (Criteria) this;
        }

        public Criteria andCoursePlaceBetween(String value1, String value2) {
            addCriterion("course_place between", value1, value2, "coursePlace");
            return (Criteria) this;
        }

        public Criteria andCoursePlaceNotBetween(String value1, String value2) {
            addCriterion("course_place not between", value1, value2, "coursePlace");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNull() {
            addCriterion("course_type is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNotNull() {
            addCriterion("course_type is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeEqualTo(Integer value) {
            addCriterion("course_type =", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotEqualTo(Integer value) {
            addCriterion("course_type <>", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThan(Integer value) {
            addCriterion("course_type >", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_type >=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThan(Integer value) {
            addCriterion("course_type <", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThanOrEqualTo(Integer value) {
            addCriterion("course_type <=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIn(List<Integer> values) {
            addCriterion("course_type in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotIn(List<Integer> values) {
            addCriterion("course_type not in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeBetween(Integer value1, Integer value2) {
            addCriterion("course_type between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("course_type not between", value1, value2, "courseType");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table course
     *
     * @mbg.generated do_not_delete_during_merge Tue Apr 02 15:48:47 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table course
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}