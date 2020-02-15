package org.manoj.sm.test1;

import org.manoj.sm.MField;

public class Person {
    private String pname;
    private int page;
    private String pgender;
    private String pemail;
    @MField("pmobile")
    private String pmobile;
    private String address;
    private String courntry;

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPgender() {
        return pgender;
    }

    public void setPgender(String pgender) {
        this.pgender = pgender;
    }

    public String getPemail() {
        return pemail;
    }

    public void setPemail(String pemail) {
        this.pemail = pemail;
    }

    public String getPmobile() {
        return pmobile;
    }

    public void setPmobile(String pmobile) {
        this.pmobile = pmobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourntry() {
        return courntry;
    }

    public void setCourntry(String courntry) {
        this.courntry = courntry;
    }

    @Override
    public String toString() {
        return "Person [address=" + address + ", courntry=" + courntry + ", page=" + page + ", pemail=" + pemail
                + ", pgender=" + pgender + ", pmobile=" + pmobile + ", pname=" + pname + "]";
    }

}