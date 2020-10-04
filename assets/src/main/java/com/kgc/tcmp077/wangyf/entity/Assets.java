package com.kgc.tcmp077.wangyf.entity;

import java.util.Date;

public class Assets {
    private Long d;

    private String assetid;

    private String assetname;

    private String assettype;

    private Date intodate;

    public Long getD() {
        return d;
    }

    public void setD(Long d) {
        this.d = d;
    }

    public String getAssetid() {
        return assetid;
    }

    public void setAssetid(String assetid) {
        this.assetid = assetid == null ? null : assetid.trim();
    }

    public String getAssetname() {
        return assetname;
    }

    public void setAssetname(String assetname) {
        this.assetname = assetname == null ? null : assetname.trim();
    }

    public String getAssettype() {
        return assettype;
    }

    public void setAssettype(String assettype) {
        this.assettype = assettype == null ? null : assettype.trim();
    }

    public Date getIntodate() {
        return intodate;
    }

    public void setIntodate(Date intodate) {
        this.intodate = intodate;
    }
}