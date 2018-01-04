package bhxh.data.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "COMMON_DM_PHONG_BAN", schema = "CATEGORYUSER", catalog = "")
public class CommonDmPhongBan {
    private long id;
    private String tenTiengViet;
    private String tenTiengAnh;
    private String tenVietTat;
    private Long tinhThanhId;
    private String diaChi;
    private String dienThoai;
    private String email;
    private String fax;
    private String maSoThue;
    private String dbName;
    private Timestamp lastUpdate;
    private String maDonVi;
    private Long donviChaId;
    private Long capDonVi;
    private Long loaiHinh;
    private String maKcb;
    private String soTaiKhoan;
    private String nganHang;
    private Long loaiHinhDonVi;
    private Long slDiemKho;
    private Long coQuanTongCuc;
    private Long xaPhuongId;
    private Long sttCap;
    private Long pcKhuVuc;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "TEN_TIENG_VIET")
    public String getTenTiengViet() {
        return tenTiengViet;
    }

    public void setTenTiengViet(String tenTiengViet) {
        this.tenTiengViet = tenTiengViet;
    }

    @Basic
    @Column(name = "TEN_TIENG_ANH")
    public String getTenTiengAnh() {
        return tenTiengAnh;
    }

    public void setTenTiengAnh(String tenTiengAnh) {
        this.tenTiengAnh = tenTiengAnh;
    }

    @Basic
    @Column(name = "TEN_VIET_TAT")
    public String getTenVietTat() {
        return tenVietTat;
    }

    public void setTenVietTat(String tenVietTat) {
        this.tenVietTat = tenVietTat;
    }

    @Basic
    @Column(name = "TINH_THANH_ID")
    public Long getTinhThanhId() {
        return tinhThanhId;
    }

    public void setTinhThanhId(Long tinhThanhId) {
        this.tinhThanhId = tinhThanhId;
    }

    @Basic
    @Column(name = "DIA_CHI")
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Basic
    @Column(name = "DIEN_THOAI")
    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    @Basic
    @Column(name = "EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "FAX")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "MA_SO_THUE")
    public String getMaSoThue() {
        return maSoThue;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    @Basic
    @Column(name = "DB_NAME")
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    @Basic
    @Column(name = "LAST_UPDATE")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Basic
    @Column(name = "MA_DON_VI")
    public String getMaDonVi() {
        return maDonVi;
    }

    public void setMaDonVi(String maDonVi) {
        this.maDonVi = maDonVi;
    }

    @Basic
    @Column(name = "DONVI_CHA_ID")
    public Long getDonviChaId() {
        return donviChaId;
    }

    public void setDonviChaId(Long donviChaId) {
        this.donviChaId = donviChaId;
    }

    @Basic
    @Column(name = "CAP_DON_VI")
    public Long getCapDonVi() {
        return capDonVi;
    }

    public void setCapDonVi(Long capDonVi) {
        this.capDonVi = capDonVi;
    }

    @Basic
    @Column(name = "LOAI_HINH")
    public Long getLoaiHinh() {
        return loaiHinh;
    }

    public void setLoaiHinh(Long loaiHinh) {
        this.loaiHinh = loaiHinh;
    }

    @Basic
    @Column(name = "MA_KCB")
    public String getMaKcb() {
        return maKcb;
    }

    public void setMaKcb(String maKcb) {
        this.maKcb = maKcb;
    }

    @Basic
    @Column(name = "SO_TAI_KHOAN")
    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    @Basic
    @Column(name = "NGAN_HANG")
    public String getNganHang() {
        return nganHang;
    }

    public void setNganHang(String nganHang) {
        this.nganHang = nganHang;
    }

    @Basic
    @Column(name = "LOAI_HINH_DON_VI")
    public Long getLoaiHinhDonVi() {
        return loaiHinhDonVi;
    }

    public void setLoaiHinhDonVi(Long loaiHinhDonVi) {
        this.loaiHinhDonVi = loaiHinhDonVi;
    }

    @Basic
    @Column(name = "SL_DIEM_KHO")
    public Long getSlDiemKho() {
        return slDiemKho;
    }

    public void setSlDiemKho(Long slDiemKho) {
        this.slDiemKho = slDiemKho;
    }

    @Basic
    @Column(name = "CO_QUAN_TONG_CUC")
    public Long getCoQuanTongCuc() {
        return coQuanTongCuc;
    }

    public void setCoQuanTongCuc(Long coQuanTongCuc) {
        this.coQuanTongCuc = coQuanTongCuc;
    }

    @Basic
    @Column(name = "XA_PHUONG_ID")
    public Long getXaPhuongId() {
        return xaPhuongId;
    }

    public void setXaPhuongId(Long xaPhuongId) {
        this.xaPhuongId = xaPhuongId;
    }

    @Basic
    @Column(name = "STT_CAP")
    public Long getSttCap() {
        return sttCap;
    }

    public void setSttCap(Long sttCap) {
        this.sttCap = sttCap;
    }

    @Basic
    @Column(name = "PC_KHU_VUC")
    public Long getPcKhuVuc() {
        return pcKhuVuc;
    }

    public void setPcKhuVuc(Long pcKhuVuc) {
        this.pcKhuVuc = pcKhuVuc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonDmPhongBan that = (CommonDmPhongBan) o;

        if (id != that.id) return false;
        if (tenTiengViet != null ? !tenTiengViet.equals(that.tenTiengViet) : that.tenTiengViet != null) return false;
        if (tenTiengAnh != null ? !tenTiengAnh.equals(that.tenTiengAnh) : that.tenTiengAnh != null) return false;
        if (tenVietTat != null ? !tenVietTat.equals(that.tenVietTat) : that.tenVietTat != null) return false;
        if (tinhThanhId != null ? !tinhThanhId.equals(that.tinhThanhId) : that.tinhThanhId != null) return false;
        if (diaChi != null ? !diaChi.equals(that.diaChi) : that.diaChi != null) return false;
        if (dienThoai != null ? !dienThoai.equals(that.dienThoai) : that.dienThoai != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (maSoThue != null ? !maSoThue.equals(that.maSoThue) : that.maSoThue != null) return false;
        if (dbName != null ? !dbName.equals(that.dbName) : that.dbName != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(that.lastUpdate) : that.lastUpdate != null) return false;
        if (maDonVi != null ? !maDonVi.equals(that.maDonVi) : that.maDonVi != null) return false;
        if (donviChaId != null ? !donviChaId.equals(that.donviChaId) : that.donviChaId != null) return false;
        if (capDonVi != null ? !capDonVi.equals(that.capDonVi) : that.capDonVi != null) return false;
        if (loaiHinh != null ? !loaiHinh.equals(that.loaiHinh) : that.loaiHinh != null) return false;
        if (maKcb != null ? !maKcb.equals(that.maKcb) : that.maKcb != null) return false;
        if (soTaiKhoan != null ? !soTaiKhoan.equals(that.soTaiKhoan) : that.soTaiKhoan != null) return false;
        if (nganHang != null ? !nganHang.equals(that.nganHang) : that.nganHang != null) return false;
        if (loaiHinhDonVi != null ? !loaiHinhDonVi.equals(that.loaiHinhDonVi) : that.loaiHinhDonVi != null)
            return false;
        if (slDiemKho != null ? !slDiemKho.equals(that.slDiemKho) : that.slDiemKho != null) return false;
        if (coQuanTongCuc != null ? !coQuanTongCuc.equals(that.coQuanTongCuc) : that.coQuanTongCuc != null)
            return false;
        if (xaPhuongId != null ? !xaPhuongId.equals(that.xaPhuongId) : that.xaPhuongId != null) return false;
        if (sttCap != null ? !sttCap.equals(that.sttCap) : that.sttCap != null) return false;
        if (pcKhuVuc != null ? !pcKhuVuc.equals(that.pcKhuVuc) : that.pcKhuVuc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (tenTiengViet != null ? tenTiengViet.hashCode() : 0);
        result = 31 * result + (tenTiengAnh != null ? tenTiengAnh.hashCode() : 0);
        result = 31 * result + (tenVietTat != null ? tenVietTat.hashCode() : 0);
        result = 31 * result + (tinhThanhId != null ? tinhThanhId.hashCode() : 0);
        result = 31 * result + (diaChi != null ? diaChi.hashCode() : 0);
        result = 31 * result + (dienThoai != null ? dienThoai.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (maSoThue != null ? maSoThue.hashCode() : 0);
        result = 31 * result + (dbName != null ? dbName.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        result = 31 * result + (maDonVi != null ? maDonVi.hashCode() : 0);
        result = 31 * result + (donviChaId != null ? donviChaId.hashCode() : 0);
        result = 31 * result + (capDonVi != null ? capDonVi.hashCode() : 0);
        result = 31 * result + (loaiHinh != null ? loaiHinh.hashCode() : 0);
        result = 31 * result + (maKcb != null ? maKcb.hashCode() : 0);
        result = 31 * result + (soTaiKhoan != null ? soTaiKhoan.hashCode() : 0);
        result = 31 * result + (nganHang != null ? nganHang.hashCode() : 0);
        result = 31 * result + (loaiHinhDonVi != null ? loaiHinhDonVi.hashCode() : 0);
        result = 31 * result + (slDiemKho != null ? slDiemKho.hashCode() : 0);
        result = 31 * result + (coQuanTongCuc != null ? coQuanTongCuc.hashCode() : 0);
        result = 31 * result + (xaPhuongId != null ? xaPhuongId.hashCode() : 0);
        result = 31 * result + (sttCap != null ? sttCap.hashCode() : 0);
        result = 31 * result + (pcKhuVuc != null ? pcKhuVuc.hashCode() : 0);
        return result;
    }
}
