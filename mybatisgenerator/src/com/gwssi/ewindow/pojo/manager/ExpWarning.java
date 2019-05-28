package com.gwssi.ewindow.pojo.manager;

import java.io.Serializable;
import java.util.Date;

public class ExpWarning implements Serializable {
    private String warnid;

    private String warnname;

    private String warnlevel;

    private String warnuser;

    private String orgcode;

    private Date timestamp;

    private String minnum;

    private String maxnum;

    private static final long serialVersionUID = 1L;

    public String getWarnid() {
        return warnid;
    }

    public void setWarnid(String warnid) {
        this.warnid = warnid == null ? null : warnid.trim();
    }

    public String getWarnname() {
        return warnname;
    }

    public void setWarnname(String warnname) {
        this.warnname = warnname == null ? null : warnname.trim();
    }

    public String getWarnlevel() {
        return warnlevel;
    }

    public void setWarnlevel(String warnlevel) {
        this.warnlevel = warnlevel == null ? null : warnlevel.trim();
    }

    public String getWarnuser() {
        return warnuser;
    }

    public void setWarnuser(String warnuser) {
        this.warnuser = warnuser == null ? null : warnuser.trim();
    }

    public String getOrgcode() {
        return orgcode;
    }

    public void setOrgcode(String orgcode) {
        this.orgcode = orgcode == null ? null : orgcode.trim();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMinnum() {
        return minnum;
    }

    public void setMinnum(String minnum) {
        this.minnum = minnum == null ? null : minnum.trim();
    }

    public String getMaxnum() {
        return maxnum;
    }

    public void setMaxnum(String maxnum) {
        this.maxnum = maxnum == null ? null : maxnum.trim();
    }
}