package com.school.system.domain;

public class Clazz {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clazz.id
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clazz.clazz_name
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    private String clazzName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column clazz.clazz_major_id
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    private Integer clazzMajorId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clazz.id
     *
     * @return the value of clazz.id
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clazz.id
     *
     * @param id the value for clazz.id
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clazz.clazz_name
     *
     * @return the value of clazz.clazz_name
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public String getClazzName() {
        return clazzName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clazz.clazz_name
     *
     * @param clazzName the value for clazz.clazz_name
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public void setClazzName(String clazzName) {
        this.clazzName = clazzName == null ? null : clazzName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column clazz.clazz_major_id
     *
     * @return the value of clazz.clazz_major_id
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public Integer getClazzMajorId() {
        return clazzMajorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column clazz.clazz_major_id
     *
     * @param clazzMajorId the value for clazz.clazz_major_id
     *
     * @mbg.generated Tue Apr 02 15:48:47 CST 2019
     */
    public void setClazzMajorId(Integer clazzMajorId) {
        this.clazzMajorId = clazzMajorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clazz
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
        sb.append(", clazzName=").append(clazzName);
        sb.append(", clazzMajorId=").append(clazzMajorId);
        sb.append("]");
        return sb.toString();
    }
}