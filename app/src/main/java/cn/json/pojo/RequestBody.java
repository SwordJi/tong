package cn.json.pojo;

import java.util.Objects;

public class RequestBody {
    private String ct;
    private String v;
    private String r;

    public String getCt() {
        return ct;
    }

    public RequestBody() {

    }

    public RequestBody(String ct, String v, String r) {
        this.ct = ct;
        this.v = v;
        this.r = r;
    }

    @Override
    public String toString() {
        return "RequestBody{" +
                "ct='" + ct + '\'' +
                ", v='" + v + '\'' +
                ", r='" + r + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestBody that = (RequestBody) o;
        return Objects.equals(ct, that.ct) && Objects.equals(v, that.v) && Objects.equals(r, that.r);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ct, v, r);
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getR() {
        return r;
    }

    public void setR(String r) {
        this.r = r;
    }
}
