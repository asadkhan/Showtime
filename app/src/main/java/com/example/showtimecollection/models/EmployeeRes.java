package com.example.showtimecollection.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EmployeeRes {
    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("iserror")
    @Expose
    private Boolean iserror;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("value")
    @Expose
    private Value value;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getIserror() {
        return iserror;
    }

    public void setIserror(Boolean iserror) {
        this.iserror = iserror;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public class Value {

        @SerializedName("empid")
        @Expose
        private Integer empid;
        @SerializedName("Empname")
        @Expose
        private String empname;
        @SerializedName("Address")
        @Expose
        private Object address;
        @SerializedName("Phone")
        @Expose
        private Object phone;
        @SerializedName("Cell")
        @Expose
        private String cell;

        public Integer getEmpid() {
            return empid;
        }

        public void setEmpid(Integer empid) {
            this.empid = empid;
        }

        public String getEmpname() {
            return empname;
        }

        public void setEmpname(String empname) {
            this.empname = empname;
        }

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public Object getPhone() {
            return phone;
        }

        public void setPhone(Object phone) {
            this.phone = phone;
        }

        public String getCell() {
            return cell;
        }

        public void setCell(String cell) {
            this.cell = cell;
        }

    }
}
