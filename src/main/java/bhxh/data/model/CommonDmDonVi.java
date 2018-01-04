package bhxh.data.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "COMMON_DM_DON_VI", schema = "CATEGORYUSER", catalog = "")
public class CommonDmDonVi {
    private long id;
    private Timestamp createdDate;
    private Timestamp updatedDate;
    private Long chon;
    private String cmtHoChieu;
    private String dcLh;
    private String dcTruSo;
    private Integer denSo;
    private String dienThoai;
    private Long dnNhaNuoc;
    private Long dungTl;
    private Long dvTu;
    private String fax;
    private String ghiChu;
    private Long gtinhNdd;
    private Long inTenDvi;
    private String ldGiam;
    private Long matTich;
    private Long phaSan;
    private Long lyDoKhac;
    private String ldTang;
    private String loaiDn;
    private Long ltHsl;
    private Long ltNt;
    private Long ltVnd;
    private String ma;
    private String maDvt;
    private String msThue;
    private Timestamp ngayDkkd;
    private Timestamp ngayGiam;
    private Timestamp ngayTang;
    private String nguoiDd;
    private Long nsHt;
    private Timestamp nsinhNdd;
    private String phuongThuc;
    private Long quyDoi;
    private String soDinhDanh;
    private String soDkkd;
    private Long tatToan;
    private Long tdSo;
    private Long tdThe;
    private String ten;
    private String tenDvcq;
    private String tenTa;
    private String tenTat;
    private String tkGd;
    private String tlKemTheo;
    private Long ytMl;
    private Long nsHtroKhac;
    private Timestamp ngayDungTl;
    private String donViDong;
    private String email;
    private String nguoiLh;
    private String sdtNguoiLh;
    private String emailNguoiLh;
    private Timestamp ngayTattoan;
    private String huuTri;
    private long dmBhxhId;
    private Long dmDbhcId;
    private Long dmDtKcbId;
    private Long dmKhoiKcbId;
    private Long dmKhoiQlId;
    private Long dmNgoaiTeId;
    private Long dmVungId;
    private Long maHuyenKcbId;
    private Long maTinhKcbId;
    private Long maXaKcbId;
    private Long qtichNddId;
    private Long userId;
    private String maDvtCu;
    private String thangTl;
    private Long tyLeNsnn;
    private Long isDviNo;
    private Timestamp ngayDviNo;
    private Long userDviNoId;
    private String md5;

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
    @Column(name = "CHON")
    public Long getChon() {
        return chon;
    }

    public void setChon(Long chon) {
        this.chon = chon;
    }

    @Basic
    @Column(name = "CMT_HO_CHIEU")
    public String getCmtHoChieu() {
        return cmtHoChieu;
    }

    public void setCmtHoChieu(String cmtHoChieu) {
        this.cmtHoChieu = cmtHoChieu;
    }

    @Basic
    @Column(name = "DC_LH")
    public String getDcLh() {
        return dcLh;
    }

    public void setDcLh(String dcLh) {
        this.dcLh = dcLh;
    }

    @Basic
    @Column(name = "DC_TRU_SO")
    public String getDcTruSo() {
        return dcTruSo;
    }

    public void setDcTruSo(String dcTruSo) {
        this.dcTruSo = dcTruSo;
    }

    @Basic
    @Column(name = "DEN_SO")
    public Integer getDenSo() {
        return denSo;
    }

    public void setDenSo(Integer denSo) {
        this.denSo = denSo;
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
    @Column(name = "DN_NHA_NUOC", nullable = true)
    public Long getDnNhaNuoc() {
        return dnNhaNuoc;
    }

    public void setDnNhaNuoc(Long dnNhaNuoc) {
        this.dnNhaNuoc = dnNhaNuoc;
    }

    @Basic
    
    @Column(name = "DUNG_TL", nullable = true)
    public Long getDungTl() {
        return dungTl;
    }

    public void setDungTl(Long dungTl) {
        this.dungTl = dungTl;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "DV_TU", nullable = true)
    public Long getDvTu() {
        return dvTu;
    }

    public void setDvTu(Long dvTu) {
        this.dvTu = dvTu;
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
    @Column(name = "GHI_CHU")
    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "GTINH_NDD", nullable = true)
    public Long getGtinhNdd() {
        return gtinhNdd;
    }

    public void setGtinhNdd(Long gtinhNdd) {
        this.gtinhNdd = gtinhNdd;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "IN_TEN_DVI", nullable = true)
    public Long getInTenDvi() {
        return inTenDvi;
    }

    public void setInTenDvi(Long inTenDvi) {
        this.inTenDvi = inTenDvi;
    }

    @Basic
    @Column(name = "LD_GIAM")
    public String getLdGiam() {
        return ldGiam;
    }

    public void setLdGiam(String ldGiam) {
        this.ldGiam = ldGiam;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "MAT_TICH", nullable = true)
    public Long getMatTich() {
        return matTich;
    }

    public void setMatTich(Long matTich) {
        this.matTich = matTich;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "PHA_SAN", nullable = true)
    public Long getPhaSan() {
        return phaSan;
    }

    public void setPhaSan(Long phaSan) {
        this.phaSan = phaSan;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "LY_DO_KHAC", nullable = true)
    public Long getLyDoKhac() {
        return lyDoKhac;
    }

    public void setLyDoKhac(Long lyDoKhac) {
        this.lyDoKhac = lyDoKhac;
    }

    @Basic
    @Column(name = "LD_TANG")
    public String getLdTang() {
        return ldTang;
    }

    public void setLdTang(String ldTang) {
        this.ldTang = ldTang;
    }

    @Basic
    @Column(name = "LOAI_DN")
    public String getLoaiDn() {
        return loaiDn;
    }

    public void setLoaiDn(String loaiDn) {
        this.loaiDn = loaiDn;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "LT_HSL", nullable = true)
    public Long getLtHsl() {
        return ltHsl;
    }

    public void setLtHsl(Long ltHsl) {
        this.ltHsl = ltHsl;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "LT_NT")
    public Long getLtNt() {
        return ltNt;
    }

    public void setLtNt(Long ltNt) {
        this.ltNt = ltNt;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "LT_VND", nullable = true)
    public Long getLtVnd() {
        return ltVnd;
    }

    public void setLtVnd(Long ltVnd) {
        this.ltVnd = ltVnd;
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
    @Column(name = "MA_DVT")
    public String getMaDvt() {
        return maDvt;
    }

    public void setMaDvt(String maDvt) {
        this.maDvt = maDvt;
    }

    @Basic
    @Column(name = "MS_THUE")
    public String getMsThue() {
        return msThue;
    }

    public void setMsThue(String msThue) {
        this.msThue = msThue;
    }

    @Basic
    @Column(name = "NGAY_DKKD")
    public Timestamp getNgayDkkd() {
        return ngayDkkd;
    }

    public void setNgayDkkd(Timestamp ngayDkkd) {
        this.ngayDkkd = ngayDkkd;
    }

    @Basic
    @Column(name = "NGAY_GIAM")
    public Timestamp getNgayGiam() {
        return ngayGiam;
    }

    public void setNgayGiam(Timestamp ngayGiam) {
        this.ngayGiam = ngayGiam;
    }

    @Basic
    @Column(name = "NGAY_TANG")
    public Timestamp getNgayTang() {
        return ngayTang;
    }

    public void setNgayTang(Timestamp ngayTang) {
        this.ngayTang = ngayTang;
    }

    @Basic
    @Column(name = "NGUOI_DD")
    public String getNguoiDd() {
        return nguoiDd;
    }

    public void setNguoiDd(String nguoiDd) {
        this.nguoiDd = nguoiDd;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "NS_HT", nullable = true)
    public Long getNsHt() {
        return nsHt;
    }

    public void setNsHt(Long nsHt) {
        this.nsHt = nsHt;
    }

    @Basic
    @Column(name = "NSINH_NDD")
    public Timestamp getNsinhNdd() {
        return nsinhNdd;
    }

    public void setNsinhNdd(Timestamp nsinhNdd) {
        this.nsinhNdd = nsinhNdd;
    }

    @Basic
    @Column(name = "PHUONG_THUC")
    public String getPhuongThuc() {
        return phuongThuc;
    }

    public void setPhuongThuc(String phuongThuc) {
        this.phuongThuc = phuongThuc;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "QUY_DOI", nullable = true)
    public Long getQuyDoi() {
        return quyDoi;
    }

    public void setQuyDoi(Long quyDoi) {
        this.quyDoi = quyDoi;
    }

    @Basic
    @Column(name = "SO_DINH_DANH")
    public String getSoDinhDanh() {
        return soDinhDanh;
    }

    public void setSoDinhDanh(String soDinhDanh) {
        this.soDinhDanh = soDinhDanh;
    }

    @Basic
    @Column(name = "SO_DKKD")
    public String getSoDkkd() {
        return soDkkd;
    }

    public void setSoDkkd(String soDkkd) {
        this.soDkkd = soDkkd;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "TAT_TOAN", nullable = true)
    public Long getTatToan() {
        return tatToan;
    }

    public void setTatToan(Long tatToan) {
        this.tatToan = tatToan;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "TD_SO", nullable = true)
    public Long getTdSo() {
        return tdSo;
    }

    public void setTdSo(Long tdSo) {
        this.tdSo = tdSo;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "TD_THE", nullable = true)
    public Long getTdThe() {
        return tdThe;
    }

    public void setTdThe(Long tdThe) {
        this.tdThe = tdThe;
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
    @Column(name = "TEN_DVCQ")
    public String getTenDvcq() {
        return tenDvcq;
    }

    public void setTenDvcq(String tenDvcq) {
        this.tenDvcq = tenDvcq;
    }

    @Basic
    @Column(name = "TEN_TA")
    public String getTenTa() {
        return tenTa;
    }

    public void setTenTa(String tenTa) {
        this.tenTa = tenTa;
    }

    @Basic
    @Column(name = "TEN_TAT")
    public String getTenTat() {
        return tenTat;
    }

    public void setTenTat(String tenTat) {
        this.tenTat = tenTat;
    }

    @Basic
    @Column(name = "TK_GD")
    public String getTkGd() {
        return tkGd;
    }

    public void setTkGd(String tkGd) {
        this.tkGd = tkGd;
    }

    @Basic
    @Column(name = "TL_KEM_THEO")
    public String getTlKemTheo() {
        return tlKemTheo;
    }

    public void setTlKemTheo(String tlKemTheo) {
        this.tlKemTheo = tlKemTheo;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "YT_ML", nullable = true)
    public Long getYtMl() {
        return ytMl;
    }

    public void setYtMl(Long ytMl) {
        this.ytMl = ytMl;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "NS_HTRO_KHAC", nullable = true)
    public Long getNsHtroKhac() {
        return nsHtroKhac;
    }

    public void setNsHtroKhac(Long nsHtroKhac) {
        this.nsHtroKhac = nsHtroKhac;
    }

    @Basic
    @Column(name = "NGAY_DUNG_TL")
    public Timestamp getNgayDungTl() {
        return ngayDungTl;
    }

    public void setNgayDungTl(Timestamp ngayDungTl) {
        this.ngayDungTl = ngayDungTl;
    }

    @Basic
    @Column(name = "DON_VI_DONG")
    public String getDonViDong() {
        return donViDong;
    }

    public void setDonViDong(String donViDong) {
        this.donViDong = donViDong;
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
    @Column(name = "NGUOI_LH")
    public String getNguoiLh() {
        return nguoiLh;
    }

    public void setNguoiLh(String nguoiLh) {
        this.nguoiLh = nguoiLh;
    }

    @Basic
    @Column(name = "SDT_NGUOI_LH")
    public String getSdtNguoiLh() {
        return sdtNguoiLh;
    }

    public void setSdtNguoiLh(String sdtNguoiLh) {
        this.sdtNguoiLh = sdtNguoiLh;
    }

    @Basic
    @Column(name = "EMAIL_NGUOI_LH")
    public String getEmailNguoiLh() {
        return emailNguoiLh;
    }

    public void setEmailNguoiLh(String emailNguoiLh) {
        this.emailNguoiLh = emailNguoiLh;
    }

    @Basic
    @Column(name = "NGAY_TATTOAN")
    public Timestamp getNgayTattoan() {
        return ngayTattoan;
    }

    public void setNgayTattoan(Timestamp ngayTattoan) {
        this.ngayTattoan = ngayTattoan;
    }

    @Basic
    @Column(name = "HUU_TRI")
    public String getHuuTri() {
        return huuTri;
    }

    public void setHuuTri(String huuTri) {
        this.huuTri = huuTri;
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
    @Column(name = "DM_DBHC_ID")
    public Long getDmDbhcId() {
        return dmDbhcId;
    }

    public void setDmDbhcId(Long dmDbhcId) {
        this.dmDbhcId = dmDbhcId;
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
    @Column(name = "DM_KHOI_KCB_ID")
    public Long getDmKhoiKcbId() {
        return dmKhoiKcbId;
    }

    public void setDmKhoiKcbId(Long dmKhoiKcbId) {
        this.dmKhoiKcbId = dmKhoiKcbId;
    }

    @Basic
    @Column(name = "DM_KHOI_QL_ID")
    public Long getDmKhoiQlId() {
        return dmKhoiQlId;
    }

    public void setDmKhoiQlId(Long dmKhoiQlId) {
        this.dmKhoiQlId = dmKhoiQlId;
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
    @Column(name = "DM_VUNG_ID")
    public Long getDmVungId() {
        return dmVungId;
    }

    public void setDmVungId(Long dmVungId) {
        this.dmVungId = dmVungId;
    }

    @Basic
    @Column(name = "MA_HUYEN_KCB_ID")
    public Long getMaHuyenKcbId() {
        return maHuyenKcbId;
    }

    public void setMaHuyenKcbId(Long maHuyenKcbId) {
        this.maHuyenKcbId = maHuyenKcbId;
    }

    @Basic
    @Column(name = "MA_TINH_KCB_ID")
    public Long getMaTinhKcbId() {
        return maTinhKcbId;
    }

    public void setMaTinhKcbId(Long maTinhKcbId) {
        this.maTinhKcbId = maTinhKcbId;
    }

    @Basic
    @Column(name = "MA_XA_KCB_ID")
    public Long getMaXaKcbId() {
        return maXaKcbId;
    }

    public void setMaXaKcbId(Long maXaKcbId) {
        this.maXaKcbId = maXaKcbId;
    }

    @Basic
    @Column(name = "QTICH_NDD_ID")
    public Long getQtichNddId() {
        return qtichNddId;
    }

    public void setQtichNddId(Long qtichNddId) {
        this.qtichNddId = qtichNddId;
    }

    @Basic
    @Column(name = "USER_ID")
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "MA_DVT_CU")
    public String getMaDvtCu() {
        return maDvtCu;
    }

    public void setMaDvtCu(String maDvtCu) {
        this.maDvtCu = maDvtCu;
    }

    @Basic
    @Column(name = "THANG_TL")
    public String getThangTl() {
        return thangTl;
    }

    public void setThangTl(String thangTl) {
        this.thangTl = thangTl;
    }

    @Basic
    @Column(name = "TY_LE_NSNN")
    public Long getTyLeNsnn() {
        return tyLeNsnn;
    }

    public void setTyLeNsnn(Long tyLeNsnn) {
        this.tyLeNsnn = tyLeNsnn;
    }

    @Basic
    //////@Type(type = "boolean")
    @Column(name = "IS_DVI_NO", nullable = true)
    public Long getDviNo() {
        return isDviNo;
    }

    public void setDviNo(Long dviNo) {
        isDviNo = dviNo;
    }

    @Basic
    @Column(name = "NGAY_DVI_NO")
    public Timestamp getNgayDviNo() {
        return ngayDviNo;
    }

    public void setNgayDviNo(Timestamp ngayDviNo) {
        this.ngayDviNo = ngayDviNo;
    }

    @Basic
    @Column(name = "USER_DVI_NO_ID")
    public Long getUserDviNoId() {
        return userDviNoId;
    }

    public void setUserDviNoId(Long userDviNoId) {
        this.userDviNoId = userDviNoId;
    }

    @Basic
    @Column(name = "MD5")
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonDmDonVi that = (CommonDmDonVi) o;

        if (id != that.id) return false;
        if (dmBhxhId != that.dmBhxhId) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (updatedDate != null ? !updatedDate.equals(that.updatedDate) : that.updatedDate != null) return false;
        if (chon != null ? !chon.equals(that.chon) : that.chon != null) return false;
        if (cmtHoChieu != null ? !cmtHoChieu.equals(that.cmtHoChieu) : that.cmtHoChieu != null) return false;
        if (dcLh != null ? !dcLh.equals(that.dcLh) : that.dcLh != null) return false;
        if (dcTruSo != null ? !dcTruSo.equals(that.dcTruSo) : that.dcTruSo != null) return false;
        if (denSo != null ? !denSo.equals(that.denSo) : that.denSo != null) return false;
        if (dienThoai != null ? !dienThoai.equals(that.dienThoai) : that.dienThoai != null) return false;
        if (dnNhaNuoc != null ? !dnNhaNuoc.equals(that.dnNhaNuoc) : that.dnNhaNuoc != null) return false;
        if (dungTl != null ? !dungTl.equals(that.dungTl) : that.dungTl != null) return false;
        if (dvTu != null ? !dvTu.equals(that.dvTu) : that.dvTu != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (ghiChu != null ? !ghiChu.equals(that.ghiChu) : that.ghiChu != null) return false;
        if (gtinhNdd != null ? !gtinhNdd.equals(that.gtinhNdd) : that.gtinhNdd != null) return false;
        if (inTenDvi != null ? !inTenDvi.equals(that.inTenDvi) : that.inTenDvi != null) return false;
        if (ldGiam != null ? !ldGiam.equals(that.ldGiam) : that.ldGiam != null) return false;
        if (matTich != null ? !matTich.equals(that.matTich) : that.matTich != null) return false;
        if (phaSan != null ? !phaSan.equals(that.phaSan) : that.phaSan != null) return false;
        if (lyDoKhac != null ? !lyDoKhac.equals(that.lyDoKhac) : that.lyDoKhac != null) return false;
        if (ldTang != null ? !ldTang.equals(that.ldTang) : that.ldTang != null) return false;
        if (loaiDn != null ? !loaiDn.equals(that.loaiDn) : that.loaiDn != null) return false;
        if (ltHsl != null ? !ltHsl.equals(that.ltHsl) : that.ltHsl != null) return false;
        if (ltNt != null ? !ltNt.equals(that.ltNt) : that.ltNt != null) return false;
        if (ltVnd != null ? !ltVnd.equals(that.ltVnd) : that.ltVnd != null) return false;
        if (ma != null ? !ma.equals(that.ma) : that.ma != null) return false;
        if (maDvt != null ? !maDvt.equals(that.maDvt) : that.maDvt != null) return false;
        if (msThue != null ? !msThue.equals(that.msThue) : that.msThue != null) return false;
        if (ngayDkkd != null ? !ngayDkkd.equals(that.ngayDkkd) : that.ngayDkkd != null) return false;
        if (ngayGiam != null ? !ngayGiam.equals(that.ngayGiam) : that.ngayGiam != null) return false;
        if (ngayTang != null ? !ngayTang.equals(that.ngayTang) : that.ngayTang != null) return false;
        if (nguoiDd != null ? !nguoiDd.equals(that.nguoiDd) : that.nguoiDd != null) return false;
        if (nsHt != null ? !nsHt.equals(that.nsHt) : that.nsHt != null) return false;
        if (nsinhNdd != null ? !nsinhNdd.equals(that.nsinhNdd) : that.nsinhNdd != null) return false;
        if (phuongThuc != null ? !phuongThuc.equals(that.phuongThuc) : that.phuongThuc != null) return false;
        if (quyDoi != null ? !quyDoi.equals(that.quyDoi) : that.quyDoi != null) return false;
        if (soDinhDanh != null ? !soDinhDanh.equals(that.soDinhDanh) : that.soDinhDanh != null) return false;
        if (soDkkd != null ? !soDkkd.equals(that.soDkkd) : that.soDkkd != null) return false;
        if (tatToan != null ? !tatToan.equals(that.tatToan) : that.tatToan != null) return false;
        if (tdSo != null ? !tdSo.equals(that.tdSo) : that.tdSo != null) return false;
        if (tdThe != null ? !tdThe.equals(that.tdThe) : that.tdThe != null) return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;
        if (tenDvcq != null ? !tenDvcq.equals(that.tenDvcq) : that.tenDvcq != null) return false;
        if (tenTa != null ? !tenTa.equals(that.tenTa) : that.tenTa != null) return false;
        if (tenTat != null ? !tenTat.equals(that.tenTat) : that.tenTat != null) return false;
        if (tkGd != null ? !tkGd.equals(that.tkGd) : that.tkGd != null) return false;
        if (tlKemTheo != null ? !tlKemTheo.equals(that.tlKemTheo) : that.tlKemTheo != null) return false;
        if (ytMl != null ? !ytMl.equals(that.ytMl) : that.ytMl != null) return false;
        if (nsHtroKhac != null ? !nsHtroKhac.equals(that.nsHtroKhac) : that.nsHtroKhac != null) return false;
        if (ngayDungTl != null ? !ngayDungTl.equals(that.ngayDungTl) : that.ngayDungTl != null) return false;
        if (donViDong != null ? !donViDong.equals(that.donViDong) : that.donViDong != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (nguoiLh != null ? !nguoiLh.equals(that.nguoiLh) : that.nguoiLh != null) return false;
        if (sdtNguoiLh != null ? !sdtNguoiLh.equals(that.sdtNguoiLh) : that.sdtNguoiLh != null) return false;
        if (emailNguoiLh != null ? !emailNguoiLh.equals(that.emailNguoiLh) : that.emailNguoiLh != null) return false;
        if (ngayTattoan != null ? !ngayTattoan.equals(that.ngayTattoan) : that.ngayTattoan != null) return false;
        if (huuTri != null ? !huuTri.equals(that.huuTri) : that.huuTri != null) return false;
        if (dmDbhcId != null ? !dmDbhcId.equals(that.dmDbhcId) : that.dmDbhcId != null) return false;
        if (dmDtKcbId != null ? !dmDtKcbId.equals(that.dmDtKcbId) : that.dmDtKcbId != null) return false;
        if (dmKhoiKcbId != null ? !dmKhoiKcbId.equals(that.dmKhoiKcbId) : that.dmKhoiKcbId != null) return false;
        if (dmKhoiQlId != null ? !dmKhoiQlId.equals(that.dmKhoiQlId) : that.dmKhoiQlId != null) return false;
        if (dmNgoaiTeId != null ? !dmNgoaiTeId.equals(that.dmNgoaiTeId) : that.dmNgoaiTeId != null) return false;
        if (dmVungId != null ? !dmVungId.equals(that.dmVungId) : that.dmVungId != null) return false;
        if (maHuyenKcbId != null ? !maHuyenKcbId.equals(that.maHuyenKcbId) : that.maHuyenKcbId != null) return false;
        if (maTinhKcbId != null ? !maTinhKcbId.equals(that.maTinhKcbId) : that.maTinhKcbId != null) return false;
        if (maXaKcbId != null ? !maXaKcbId.equals(that.maXaKcbId) : that.maXaKcbId != null) return false;
        if (qtichNddId != null ? !qtichNddId.equals(that.qtichNddId) : that.qtichNddId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (maDvtCu != null ? !maDvtCu.equals(that.maDvtCu) : that.maDvtCu != null) return false;
        if (thangTl != null ? !thangTl.equals(that.thangTl) : that.thangTl != null) return false;
        if (tyLeNsnn != null ? !tyLeNsnn.equals(that.tyLeNsnn) : that.tyLeNsnn != null) return false;
        if (isDviNo != null ? !isDviNo.equals(that.isDviNo) : that.isDviNo != null) return false;
        if (ngayDviNo != null ? !ngayDviNo.equals(that.ngayDviNo) : that.ngayDviNo != null) return false;
        if (userDviNoId != null ? !userDviNoId.equals(that.userDviNoId) : that.userDviNoId != null) return false;
        if (md5 != null ? !md5.equals(that.md5) : that.md5 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        result = 31 * result + (chon != null ? chon.hashCode() : 0);
        result = 31 * result + (cmtHoChieu != null ? cmtHoChieu.hashCode() : 0);
        result = 31 * result + (dcLh != null ? dcLh.hashCode() : 0);
        result = 31 * result + (dcTruSo != null ? dcTruSo.hashCode() : 0);
        result = 31 * result + (denSo != null ? denSo.hashCode() : 0);
        result = 31 * result + (dienThoai != null ? dienThoai.hashCode() : 0);
        result = 31 * result + (dnNhaNuoc != null ? dnNhaNuoc.hashCode() : 0);
        result = 31 * result + (dungTl != null ? dungTl.hashCode() : 0);
        result = 31 * result + (dvTu != null ? dvTu.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (ghiChu != null ? ghiChu.hashCode() : 0);
        result = 31 * result + (gtinhNdd != null ? gtinhNdd.hashCode() : 0);
        result = 31 * result + (inTenDvi != null ? inTenDvi.hashCode() : 0);
        result = 31 * result + (ldGiam != null ? ldGiam.hashCode() : 0);
        result = 31 * result + (matTich != null ? matTich.hashCode() : 0);
        result = 31 * result + (phaSan != null ? phaSan.hashCode() : 0);
        result = 31 * result + (lyDoKhac != null ? lyDoKhac.hashCode() : 0);
        result = 31 * result + (ldTang != null ? ldTang.hashCode() : 0);
        result = 31 * result + (loaiDn != null ? loaiDn.hashCode() : 0);
        result = 31 * result + (ltHsl != null ? ltHsl.hashCode() : 0);
        result = 31 * result + (ltNt != null ? ltNt.hashCode() : 0);
        result = 31 * result + (ltVnd != null ? ltVnd.hashCode() : 0);
        result = 31 * result + (ma != null ? ma.hashCode() : 0);
        result = 31 * result + (maDvt != null ? maDvt.hashCode() : 0);
        result = 31 * result + (msThue != null ? msThue.hashCode() : 0);
        result = 31 * result + (ngayDkkd != null ? ngayDkkd.hashCode() : 0);
        result = 31 * result + (ngayGiam != null ? ngayGiam.hashCode() : 0);
        result = 31 * result + (ngayTang != null ? ngayTang.hashCode() : 0);
        result = 31 * result + (nguoiDd != null ? nguoiDd.hashCode() : 0);
        result = 31 * result + (nsHt != null ? nsHt.hashCode() : 0);
        result = 31 * result + (nsinhNdd != null ? nsinhNdd.hashCode() : 0);
        result = 31 * result + (phuongThuc != null ? phuongThuc.hashCode() : 0);
        result = 31 * result + (quyDoi != null ? quyDoi.hashCode() : 0);
        result = 31 * result + (soDinhDanh != null ? soDinhDanh.hashCode() : 0);
        result = 31 * result + (soDkkd != null ? soDkkd.hashCode() : 0);
        result = 31 * result + (tatToan != null ? tatToan.hashCode() : 0);
        result = 31 * result + (tdSo != null ? tdSo.hashCode() : 0);
        result = 31 * result + (tdThe != null ? tdThe.hashCode() : 0);
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        result = 31 * result + (tenDvcq != null ? tenDvcq.hashCode() : 0);
        result = 31 * result + (tenTa != null ? tenTa.hashCode() : 0);
        result = 31 * result + (tenTat != null ? tenTat.hashCode() : 0);
        result = 31 * result + (tkGd != null ? tkGd.hashCode() : 0);
        result = 31 * result + (tlKemTheo != null ? tlKemTheo.hashCode() : 0);
        result = 31 * result + (ytMl != null ? ytMl.hashCode() : 0);
        result = 31 * result + (nsHtroKhac != null ? nsHtroKhac.hashCode() : 0);
        result = 31 * result + (ngayDungTl != null ? ngayDungTl.hashCode() : 0);
        result = 31 * result + (donViDong != null ? donViDong.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (nguoiLh != null ? nguoiLh.hashCode() : 0);
        result = 31 * result + (sdtNguoiLh != null ? sdtNguoiLh.hashCode() : 0);
        result = 31 * result + (emailNguoiLh != null ? emailNguoiLh.hashCode() : 0);
        result = 31 * result + (ngayTattoan != null ? ngayTattoan.hashCode() : 0);
        result = 31 * result + (huuTri != null ? huuTri.hashCode() : 0);
        result = 31 * result + (int) (dmBhxhId ^ (dmBhxhId >>> 32));
        result = 31 * result + (dmDbhcId != null ? dmDbhcId.hashCode() : 0);
        result = 31 * result + (dmDtKcbId != null ? dmDtKcbId.hashCode() : 0);
        result = 31 * result + (dmKhoiKcbId != null ? dmKhoiKcbId.hashCode() : 0);
        result = 31 * result + (dmKhoiQlId != null ? dmKhoiQlId.hashCode() : 0);
        result = 31 * result + (dmNgoaiTeId != null ? dmNgoaiTeId.hashCode() : 0);
        result = 31 * result + (dmVungId != null ? dmVungId.hashCode() : 0);
        result = 31 * result + (maHuyenKcbId != null ? maHuyenKcbId.hashCode() : 0);
        result = 31 * result + (maTinhKcbId != null ? maTinhKcbId.hashCode() : 0);
        result = 31 * result + (maXaKcbId != null ? maXaKcbId.hashCode() : 0);
        result = 31 * result + (qtichNddId != null ? qtichNddId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (maDvtCu != null ? maDvtCu.hashCode() : 0);
        result = 31 * result + (thangTl != null ? thangTl.hashCode() : 0);
        result = 31 * result + (tyLeNsnn != null ? tyLeNsnn.hashCode() : 0);
        result = 31 * result + (isDviNo != null ? isDviNo.hashCode() : 0);
        result = 31 * result + (ngayDviNo != null ? ngayDviNo.hashCode() : 0);
        result = 31 * result + (userDviNoId != null ? userDviNoId.hashCode() : 0);
        result = 31 * result + (md5 != null ? md5.hashCode() : 0);
        return result;
    }
}
