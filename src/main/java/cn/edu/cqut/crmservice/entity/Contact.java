package cn.edu.cqut.crmservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author CQUT
 * @since 2023-06-09
 */
public class Contact implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 联系人编号
     */
    @TableId(value = "con_id", type = IdType.AUTO)
    private Integer conId;

    /**
     * 联系人姓名
     */
    private String conName;

    /**
     * 联系人性别：男(0)、女(1)
     */
    private Integer conSex;

    /**
     * 联系人职位
     */
    private String conJob;

    /**
     * 联系人办公电话
     */
    private String conTel;

    /**
     * 联系人手机号码
     */
    private String conPhone;

    /**
     * 联系人备注
     */
    private String conDesc;

    /**
     * 客户编号
     */
    private Integer cusId;


    private Customer customer;

    private Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public String getConName() {
        return conName;
    }

    public void setConName(String conName) {
        this.conName = conName;
    }

    public Integer getConSex() {
        return conSex;
    }

    public void setConSex(Integer conSex) {
        this.conSex = conSex;
    }

    public String getConJob() {
        return conJob;
    }

    public void setConJob(String conJob) {
        this.conJob = conJob;
    }

    public String getConTel() {
        return conTel;
    }

    public void setConTel(String conTel) {
        this.conTel = conTel;
    }

    public String getConPhone() {
        return conPhone;
    }

    public void setConPhone(String conPhone) {
        this.conPhone = conPhone;
    }

    public String getConDesc() {
        return conDesc;
    }

    public void setConDesc(String conDesc) {
        this.conDesc = conDesc;
    }

    public Integer getCusId() {
        return cusId;
    }

    public void setCusId(Integer cusId) {
        this.cusId = cusId;
    }

    public String getCusName(){
        return this.customer.getCusName();
    }
    @Override
    public String toString() {
        return "Contact{" +
        "conId = " + conId +
        ", conName = " + conName +
        ", conSex = " + conSex +
        ", conJob = " + conJob +
        ", conTel = " + conTel +
        ", conPhone = " + conPhone +
        ", conDesc = " + conDesc +
        ", cusId = " + cusId +
        "}";
    }
}
