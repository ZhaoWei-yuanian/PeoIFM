package com.yndf.pi.Final;

import java.io.Serializable;

/**
 * @author ：mmzs
 * @date ：Created in 2019/8/26 14:32
 * @description：
 * @modified By：
 * @version: $
 */
public class Data  {
    private int usercode;
    private String username;
    private String department;

    public Data(int usercode, String username, String department) {
        this.usercode = usercode;
        this.username = username;
        this.department = department;
    }

    public int getUsercode() {
        return usercode;
    }

    public void setUsercode(int usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Data{" +
                "usercode=" + usercode +
                ", username='" + username + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
