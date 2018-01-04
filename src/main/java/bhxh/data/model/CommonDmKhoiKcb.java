package bhxh.data.model;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "COMMON_DM_KHOI_KCB", schema = "CATEGORYUSER", catalog = "")
public class CommonDmKhoiKcb {
    private long id;
    private String ma;
    private String ten;
    private Long dmDtKcbId;
    private String nhom;
    private Boolean tinhTrang;
    private Time createdDate;
    private Time updatedDate;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "MA")
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    @Basic
    @Column(name = "TEN")
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Basic
    @Column(name = "DM_DT_KCB_ID")
    public Long getDmDtKcbId() {
        return dmDtKcbId;
    }

    public void setDmDtKcbId(Long dmDtKcbId) {
        this.dmDtKcbId = dmDtKcbId;
    }

    @Basic
    @Column(name = "NHOM")
    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    @Basic
    @Column(name = "TINH_TRANG")
    public Boolean getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Basic
    @Column(name = "CREATED_DATE")
    public Time getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Time createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "UPDATED_DATE")
    public Time getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Time updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonDmKhoiKcb that = (CommonDmKhoiKcb) o;

        if (id != that.id) return false;
        if (ma != null ? !ma.equals(that.ma) : that.ma != null) return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;
        if (dmDtKcbId != null ? !dmDtKcbId.equals(that.dmDtKcbId) : that.dmDtKcbId != null) return false;
        if (nhom != null ? !nhom.equals(that.nhom) : that.nhom != null) return false;
        if (tinhTrang != null ? !tinhTrang.equals(that.tinhTrang) : that.tinhTrang != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (ma != null ? ma.hashCode() : 0);
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        result = 31 * result + (dmDtKcbId != null ? dmDtKcbId.hashCode() : 0);
        result = 31 * result + (nhom != null ? nhom.hashCode() : 0);
        result = 31 * result + (tinhTrang != null ? tinhTrang.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        return result;
    }
}
