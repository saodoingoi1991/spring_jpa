package bhxh.data.model;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "COMMON_DM_LUONG_TRAN", schema = "CATEGORYUSER", catalog = "")
public class CommonDmLuongTran {
    private long id;
    private Long dmNgoaiTeId;
    private Time thang;
    private String mucLuongYt;
    private String mucLuong;

    @Id
    @Basic
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DM_NGOAI_TE_ID")
    public Long getDmNgoaiTeId() {
        return dmNgoaiTeId;
    }

    public void setDmNgoaiTeId(Long dmNgoaiTeId) {
        this.dmNgoaiTeId = dmNgoaiTeId;
    }

    @Basic
    @Column(name = "THANG")
    public Time getThang() {
        return thang;
    }

    public void setThang(Time thang) {
        this.thang = thang;
    }

    @Basic
    @Column(name = "MUC_LUONG_YT")
    public String getMucLuongYt() {
        return mucLuongYt;
    }

    public void setMucLuongYt(String mucLuongYt) {
        this.mucLuongYt = mucLuongYt;
    }

    @Basic
    @Column(name = "MUC_LUONG")
    public String getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(String mucLuong) {
        this.mucLuong = mucLuong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonDmLuongTran that = (CommonDmLuongTran) o;

        if (id != that.id) return false;
        if (dmNgoaiTeId != null ? !dmNgoaiTeId.equals(that.dmNgoaiTeId) : that.dmNgoaiTeId != null) return false;
        if (thang != null ? !thang.equals(that.thang) : that.thang != null) return false;
        if (mucLuongYt != null ? !mucLuongYt.equals(that.mucLuongYt) : that.mucLuongYt != null) return false;
        if (mucLuong != null ? !mucLuong.equals(that.mucLuong) : that.mucLuong != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (dmNgoaiTeId != null ? dmNgoaiTeId.hashCode() : 0);
        result = 31 * result + (thang != null ? thang.hashCode() : 0);
        result = 31 * result + (mucLuongYt != null ? mucLuongYt.hashCode() : 0);
        result = 31 * result + (mucLuong != null ? mucLuong.hashCode() : 0);
        return result;
    }
}
