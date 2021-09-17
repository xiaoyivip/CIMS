package cn.edu.hzvtc.pojo;

import java.util.Date;

public class Msg {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_info.id
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_info.msg_title
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    private String msgTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_info.msg_content
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    private String msgContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_info.msg_type
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    private Integer msgType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_info.msg_send_user_id
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    private Integer msgSendUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column msg_info.msg_send_time
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    private Date msgSendTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_info.id
     *
     * @return the value of msg_info.id
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_info.id
     *
     * @param id the value for msg_info.id
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_info.msg_title
     *
     * @return the value of msg_info.msg_title
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public String getMsgTitle() {
        return msgTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_info.msg_title
     *
     * @param msgTitle the value for msg_info.msg_title
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle == null ? null : msgTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_info.msg_content
     *
     * @return the value of msg_info.msg_content
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public String getMsgContent() {
        return msgContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_info.msg_content
     *
     * @param msgContent the value for msg_info.msg_content
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent == null ? null : msgContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_info.msg_type
     *
     * @return the value of msg_info.msg_type
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public Integer getMsgType() {
        return msgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_info.msg_type
     *
     * @param msgType the value for msg_info.msg_type
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_info.msg_send_user_id
     *
     * @return the value of msg_info.msg_send_user_id
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public Integer getMsgSendUserId() {
        return msgSendUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_info.msg_send_user_id
     *
     * @param msgSendUserId the value for msg_info.msg_send_user_id
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public void setMsgSendUserId(Integer msgSendUserId) {
        this.msgSendUserId = msgSendUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column msg_info.msg_send_time
     *
     * @return the value of msg_info.msg_send_time
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public Date getMsgSendTime() {
        return msgSendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column msg_info.msg_send_time
     *
     * @param msgSendTime the value for msg_info.msg_send_time
     *
     * @mbg.generated Mon Sep 13 10:19:43 CST 2021
     */
    public void setMsgSendTime(Date msgSendTime) {
        this.msgSendTime = msgSendTime;
    }
}