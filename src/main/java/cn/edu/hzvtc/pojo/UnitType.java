package cn.edu.hzvtc.pojo;

public class UnitType {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unit_type.id
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unit_type.unit_type_name
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    private String unitTypeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unit_type.unit_type_sort_num
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    private Integer unitTypeSortNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column unit_type.unit_type_area_id
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    private Integer unitTypeAreaId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unit_type.id
     *
     * @return the value of unit_type.id
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unit_type.id
     *
     * @param id the value for unit_type.id
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unit_type.unit_type_name
     *
     * @return the value of unit_type.unit_type_name
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public String getUnitTypeName() {
        return unitTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unit_type.unit_type_name
     *
     * @param unitTypeName the value for unit_type.unit_type_name
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public void setUnitTypeName(String unitTypeName) {
        this.unitTypeName = unitTypeName == null ? null : unitTypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unit_type.unit_type_sort_num
     *
     * @return the value of unit_type.unit_type_sort_num
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public Integer getUnitTypeSortNum() {
        return unitTypeSortNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unit_type.unit_type_sort_num
     *
     * @param unitTypeSortNum the value for unit_type.unit_type_sort_num
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public void setUnitTypeSortNum(Integer unitTypeSortNum) {
        this.unitTypeSortNum = unitTypeSortNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column unit_type.unit_type_area_id
     *
     * @return the value of unit_type.unit_type_area_id
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public Integer getUnitTypeAreaId() {
        return unitTypeAreaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column unit_type.unit_type_area_id
     *
     * @param unitTypeAreaId the value for unit_type.unit_type_area_id
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public void setUnitTypeAreaId(Integer unitTypeAreaId) {
        this.unitTypeAreaId = unitTypeAreaId;
    }
}