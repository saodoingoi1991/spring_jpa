package bhxh.data.model;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "COMMON_DM_KHOI_QUAN_LY", schema = "CATEGORYUSER", catalog = "")
public class CommonDmKhoiQuanLy {
    private long id;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private String ma;
    private String ten;
    private long dmBhxhId;
    private Long dmKhoiKcbId;
    private Long dmKhoiTkId;
    private Long status;
    private Long bhyt;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CREATED_DATE")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "UPDATED_DATE")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
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
    @Column(name = "DM_BHXH_ID")
    public long getDmBhxhId() {
        return dmBhxhId;
    }

    public void setDmBhxhId(long dmBhxhId) {
        this.dmBhxhId = dmBhxhId;
    }

    @Basic
    @Column(name = "DM_KHOI_KCB_ID")
    public Long getDmKhoiKcbId() {
        return dmKhoiKcbId;
    }

    public void setDmKhoiKcbId(Long dmKhoiKcbId) {
        this.dmKhoiKcbId = dmKhoiKcbId;
    }

    @Basic
    @Column(name = "DM_KHOI_TK_ID")
    public Long getDmKhoiTkId() {
        return dmKhoiTkId;
    }

    public void setDmKhoiTkId(Long dmKhoiTkId) {
        this.dmKhoiTkId = dmKhoiTkId;
    }

    @Basic
    @Column(name = "STATUS")
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Basic
    @Column(name = "BHYT")
    public Long getBhyt() {
        return bhyt;
    }

    public void setBhyt(Long bhyt) {
        this.bhyt = bhyt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonDmKhoiQuanLy that = (CommonDmKhoiQuanLy) o;
        if (id != that.id) return false;
        if (dmBhxhId != that.dmBhxhId) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null) return false;
        if (ma != null ? !ma.equals(that.ma) : that.ma != null) return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;
        if (dmKhoiKcbId != null ? !dmKhoiKcbId.equals(that.dmKhoiKcbId) : that.dmKhoiKcbId != null) return false;
        if (dmKhoiTkId != null ? !dmKhoiTkId.equals(that.dmKhoiTkId) : that.dmKhoiTkId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (bhyt != null ? !bhyt.equals(that.bhyt) : that.bhyt != null) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        result = 31 * result + (ma != null ? ma.hashCode() : 0);
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        result = 31 * result + (int) (dmBhxhId ^ (dmBhxhId >>> 32));
        result = 31 * result + (dmKhoiKcbId != null ? dmKhoiKcbId.hashCode() : 0);
        result = 31 * result + (dmKhoiTkId != null ? dmKhoiTkId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (bhyt != null ? bhyt.hashCode() : 0);
        return result;
    }
}
