package bhxh.data.model;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "COMMON_DM_CSKCB", schema = "CATEGORYUSER", catalog = "")
public class CommonDmCskcb {
    private long id;
    private String ten;
    private String ma;
    private String mabhyt;
    private Long donvihanhchinhId;
    private String diachi;
    private Byte hangbenhvien;
    private Byte tuyencmkt;
    private Boolean hieuluc;
    private String mieuta;
    private Long stt;
    private Long tinhthanhId;
    private Long quanhuyenId;
    private String matinhthanh;
    private String maquanhuyen;
    private Long donviId;
    private String macosokcbcha;
    private Long cosokcbchaId;
    private String madonvi;
    private Boolean thannhantao;
    private Boolean thaighep;
    private Byte loaihopdong;
    private Byte dkkcbbd;
    private Byte hinhthuctt;
    private Byte loaibenhvien;
    private Boolean khamtreem;
    private Time ngayngunghd;
    private String mataichinh;
    private Boolean pkdakhoa;
    private Boolean ungthu;
    private Boolean viemgan;
    private Boolean tebaomautd;
    private Boolean khamt7;
    private Boolean khamcn;
    private Boolean khamngayle;
    private String masothue;
    private String dienthoai;
    private String email;
    private String fax;
    private String coquanchuquan;
    private Time ngaykyhopdong;
    private Byte kieubv;
    private Byte capcskcbMin;
    private Byte ttpheduyet;
    private String sohopdong;
    private String lydo;
    private Byte trangthai;
    private Boolean tuchu;
    private Byte hangdichvuTd;
    private Byte hangthuocTd;
    private Byte hangvattuTd;
    private Boolean byt;
    private String soGphd;
    private Boolean kcb;
    private Time ngaycapma;
    private Time ngaydieuchinh;
    private Boolean loaiDonvichuquan;
    private Boolean chuaPd43;
    private Time ngaykyhopdonglandau;
    private String ghichuTinhthaydoi;
    private Long slTheBhDkbd;
    private Long slTheBhDaCap;
    private Long loaiCk;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
    @Column(name = "MA")
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    @Basic
    @Column(name = "MABHYT")
    public String getMabhyt() {
        return mabhyt;
    }

    public void setMabhyt(String mabhyt) {
        this.mabhyt = mabhyt;
    }

    @Basic
    @Column(name = "DONVIHANHCHINH_ID")
    public Long getDonvihanhchinhId() {
        return donvihanhchinhId;
    }

    public void setDonvihanhchinhId(Long donvihanhchinhId) {
        this.donvihanhchinhId = donvihanhchinhId;
    }

    @Basic
    @Column(name = "DIACHI")
    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Basic
    @Column(name = "HANGBENHVIEN")
    public Byte getHangbenhvien() {
        return hangbenhvien;
    }

    public void setHangbenhvien(Byte hangbenhvien) {
        this.hangbenhvien = hangbenhvien;
    }

    @Basic
    @Column(name = "TUYENCMKT")
    public Byte getTuyencmkt() {
        return tuyencmkt;
    }

    public void setTuyencmkt(Byte tuyencmkt) {
        this.tuyencmkt = tuyencmkt;
    }

    @Basic
    @Column(name = "HIEULUC")
    public Boolean getHieuluc() {
        return hieuluc;
    }

    public void setHieuluc(Boolean hieuluc) {
        this.hieuluc = hieuluc;
    }

    @Basic
    @Column(name = "MIEUTA")
    public String getMieuta() {
        return mieuta;
    }

    public void setMieuta(String mieuta) {
        this.mieuta = mieuta;
    }

    @Basic
    @Column(name = "STT")
    public Long getStt() {
        return stt;
    }

    public void setStt(Long stt) {
        this.stt = stt;
    }

    @Basic
    @Column(name = "TINHTHANH_ID")
    public Long getTinhthanhId() {
        return tinhthanhId;
    }

    public void setTinhthanhId(Long tinhthanhId) {
        this.tinhthanhId = tinhthanhId;
    }

    @Basic
    @Column(name = "QUANHUYEN_ID")
    public Long getQuanhuyenId() {
        return quanhuyenId;
    }

    public void setQuanhuyenId(Long quanhuyenId) {
        this.quanhuyenId = quanhuyenId;
    }

    @Basic
    @Column(name = "MATINHTHANH")
    public String getMatinhthanh() {
        return matinhthanh;
    }

    public void setMatinhthanh(String matinhthanh) {
        this.matinhthanh = matinhthanh;
    }

    @Basic
    @Column(name = "MAQUANHUYEN")
    public String getMaquanhuyen() {
        return maquanhuyen;
    }

    public void setMaquanhuyen(String maquanhuyen) {
        this.maquanhuyen = maquanhuyen;
    }

    @Basic
    @Column(name = "DONVI_ID")
    public Long getDonviId() {
        return donviId;
    }

    public void setDonviId(Long donviId) {
        this.donviId = donviId;
    }

    @Basic
    @Column(name = "MACOSOKCBCHA")
    public String getMacosokcbcha() {
        return macosokcbcha;
    }

    public void setMacosokcbcha(String macosokcbcha) {
        this.macosokcbcha = macosokcbcha;
    }

    @Basic
    @Column(name = "COSOKCBCHA_ID")
    public Long getCosokcbchaId() {
        return cosokcbchaId;
    }

    public void setCosokcbchaId(Long cosokcbchaId) {
        this.cosokcbchaId = cosokcbchaId;
    }

    @Basic
    @Column(name = "MADONVI")
    public String getMadonvi() {
        return madonvi;
    }

    public void setMadonvi(String madonvi) {
        this.madonvi = madonvi;
    }

    @Basic
    @Column(name = "THANNHANTAO")
    public Boolean getThannhantao() {
        return thannhantao;
    }

    public void setThannhantao(Boolean thannhantao) {
        this.thannhantao = thannhantao;
    }

    @Basic
    @Column(name = "THAIGHEP")
    public Boolean getThaighep() {
        return thaighep;
    }

    public void setThaighep(Boolean thaighep) {
        this.thaighep = thaighep;
    }

    @Basic
    @Column(name = "LOAIHOPDONG")
    public Byte getLoaihopdong() {
        return loaihopdong;
    }

    public void setLoaihopdong(Byte loaihopdong) {
        this.loaihopdong = loaihopdong;
    }

    @Basic
    @Column(name = "DKKCBBD")
    public Byte getDkkcbbd() {
        return dkkcbbd;
    }

    public void setDkkcbbd(Byte dkkcbbd) {
        this.dkkcbbd = dkkcbbd;
    }

    @Basic
    @Column(name = "HINHTHUCTT")
    public Byte getHinhthuctt() {
        return hinhthuctt;
    }

    public void setHinhthuctt(Byte hinhthuctt) {
        this.hinhthuctt = hinhthuctt;
    }

    @Basic
    @Column(name = "LOAIBENHVIEN")
    public Byte getLoaibenhvien() {
        return loaibenhvien;
    }

    public void setLoaibenhvien(Byte loaibenhvien) {
        this.loaibenhvien = loaibenhvien;
    }

    @Basic
    @Column(name = "KHAMTREEM")
    public Boolean getKhamtreem() {
        return khamtreem;
    }

    public void setKhamtreem(Boolean khamtreem) {
        this.khamtreem = khamtreem;
    }

    @Basic
    @Column(name = "NGAYNGUNGHD")
    public Time getNgayngunghd() {
        return ngayngunghd;
    }

    public void setNgayngunghd(Time ngayngunghd) {
        this.ngayngunghd = ngayngunghd;
    }

    @Basic
    @Column(name = "MATAICHINH")
    public String getMataichinh() {
        return mataichinh;
    }

    public void setMataichinh(String mataichinh) {
        this.mataichinh = mataichinh;
    }

    @Basic
    @Column(name = "PKDAKHOA")
    public Boolean getPkdakhoa() {
        return pkdakhoa;
    }

    public void setPkdakhoa(Boolean pkdakhoa) {
        this.pkdakhoa = pkdakhoa;
    }

    @Basic
    @Column(name = "UNGTHU")
    public Boolean getUngthu() {
        return ungthu;
    }

    public void setUngthu(Boolean ungthu) {
        this.ungthu = ungthu;
    }

    @Basic
    @Column(name = "VIEMGAN")
    public Boolean getViemgan() {
        return viemgan;
    }

    public void setViemgan(Boolean viemgan) {
        this.viemgan = viemgan;
    }

    @Basic
    @Column(name = "TEBAOMAUTD")
    public Boolean getTebaomautd() {
        return tebaomautd;
    }

    public void setTebaomautd(Boolean tebaomautd) {
        this.tebaomautd = tebaomautd;
    }

    @Basic
    @Column(name = "KHAMT7")
    public Boolean getKhamt7() {
        return khamt7;
    }

    public void setKhamt7(Boolean khamt7) {
        this.khamt7 = khamt7;
    }

    @Basic
    @Column(name = "KHAMCN")
    public Boolean getKhamcn() {
        return khamcn;
    }

    public void setKhamcn(Boolean khamcn) {
        this.khamcn = khamcn;
    }

    @Basic
    @Column(name = "KHAMNGAYLE")
    public Boolean getKhamngayle() {
        return khamngayle;
    }

    public void setKhamngayle(Boolean khamngayle) {
        this.khamngayle = khamngayle;
    }

    @Basic
    @Column(name = "MASOTHUE")
    public String getMasothue() {
        return masothue;
    }

    public void setMasothue(String masothue) {
        this.masothue = masothue;
    }

    @Basic
    @Column(name = "DIENTHOAI")
    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
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
    @Column(name = "COQUANCHUQUAN")
    public String getCoquanchuquan() {
        return coquanchuquan;
    }

    public void setCoquanchuquan(String coquanchuquan) {
        this.coquanchuquan = coquanchuquan;
    }

    @Basic
    @Column(name = "NGAYKYHOPDONG")
    public Time getNgaykyhopdong() {
        return ngaykyhopdong;
    }

    public void setNgaykyhopdong(Time ngaykyhopdong) {
        this.ngaykyhopdong = ngaykyhopdong;
    }

    @Basic
    @Column(name = "KIEUBV")
    public Byte getKieubv() {
        return kieubv;
    }

    public void setKieubv(Byte kieubv) {
        this.kieubv = kieubv;
    }

    @Basic
    @Column(name = "CAPCSKCB_MIN")
    public Byte getCapcskcbMin() {
        return capcskcbMin;
    }

    public void setCapcskcbMin(Byte capcskcbMin) {
        this.capcskcbMin = capcskcbMin;
    }

    @Basic
    @Column(name = "TTPHEDUYET")
    public Byte getTtpheduyet() {
        return ttpheduyet;
    }

    public void setTtpheduyet(Byte ttpheduyet) {
        this.ttpheduyet = ttpheduyet;
    }

    @Basic
    @Column(name = "SOHOPDONG")
    public String getSohopdong() {
        return sohopdong;
    }

    public void setSohopdong(String sohopdong) {
        this.sohopdong = sohopdong;
    }

    @Basic
    @Column(name = "LYDO")
    public String getLydo() {
        return lydo;
    }

    public void setLydo(String lydo) {
        this.lydo = lydo;
    }

    @Basic
    @Column(name = "TRANGTHAI")
    public Byte getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(Byte trangthai) {
        this.trangthai = trangthai;
    }

    @Basic
    @Column(name = "TUCHU")
    public Boolean getTuchu() {
        return tuchu;
    }

    public void setTuchu(Boolean tuchu) {
        this.tuchu = tuchu;
    }

    @Basic
    @Column(name = "HANGDICHVU_TD")
    public Byte getHangdichvuTd() {
        return hangdichvuTd;
    }

    public void setHangdichvuTd(Byte hangdichvuTd) {
        this.hangdichvuTd = hangdichvuTd;
    }

    @Basic
    @Column(name = "HANGTHUOC_TD")
    public Byte getHangthuocTd() {
        return hangthuocTd;
    }

    public void setHangthuocTd(Byte hangthuocTd) {
        this.hangthuocTd = hangthuocTd;
    }

    @Basic
    @Column(name = "HANGVATTU_TD")
    public Byte getHangvattuTd() {
        return hangvattuTd;
    }

    public void setHangvattuTd(Byte hangvattuTd) {
        this.hangvattuTd = hangvattuTd;
    }

    @Basic
    @Column(name = "BYT")
    public Boolean getByt() {
        return byt;
    }

    public void setByt(Boolean byt) {
        this.byt = byt;
    }

    @Basic
    @Column(name = "SO_GPHD")
    public String getSoGphd() {
        return soGphd;
    }

    public void setSoGphd(String soGphd) {
        this.soGphd = soGphd;
    }

    @Basic
    @Column(name = "KCB")
    public Boolean getKcb() {
        return kcb;
    }

    public void setKcb(Boolean kcb) {
        this.kcb = kcb;
    }

    @Basic
    @Column(name = "NGAYCAPMA")
    public Time getNgaycapma() {
        return ngaycapma;
    }

    public void setNgaycapma(Time ngaycapma) {
        this.ngaycapma = ngaycapma;
    }

    @Basic
    @Column(name = "NGAYDIEUCHINH")
    public Time getNgaydieuchinh() {
        return ngaydieuchinh;
    }

    public void setNgaydieuchinh(Time ngaydieuchinh) {
        this.ngaydieuchinh = ngaydieuchinh;
    }

    @Basic
    @Column(name = "LOAI_DONVICHUQUAN")
    public Boolean getLoaiDonvichuquan() {
        return loaiDonvichuquan;
    }

    public void setLoaiDonvichuquan(Boolean loaiDonvichuquan) {
        this.loaiDonvichuquan = loaiDonvichuquan;
    }

    @Basic
    @Column(name = "CHUA_PD43")
    public Boolean getChuaPd43() {
        return chuaPd43;
    }

    public void setChuaPd43(Boolean chuaPd43) {
        this.chuaPd43 = chuaPd43;
    }

    @Basic
    @Column(name = "NGAYKYHOPDONGLANDAU")
    public Time getNgaykyhopdonglandau() {
        return ngaykyhopdonglandau;
    }

    public void setNgaykyhopdonglandau(Time ngaykyhopdonglandau) {
        this.ngaykyhopdonglandau = ngaykyhopdonglandau;
    }

    @Basic
    @Column(name = "GHICHU_TINHTHAYDOI")
    public String getGhichuTinhthaydoi() {
        return ghichuTinhthaydoi;
    }

    public void setGhichuTinhthaydoi(String ghichuTinhthaydoi) {
        this.ghichuTinhthaydoi = ghichuTinhthaydoi;
    }

    @Basic
    @Column(name = "SL_THE_BH_DKBD")
    public Long getSlTheBhDkbd() {
        return slTheBhDkbd;
    }

    public void setSlTheBhDkbd(Long slTheBhDkbd) {
        this.slTheBhDkbd = slTheBhDkbd;
    }

    @Basic
    @Column(name = "SL_THE_BH_DA_CAP")
    public Long getSlTheBhDaCap() {
        return slTheBhDaCap;
    }

    public void setSlTheBhDaCap(Long slTheBhDaCap) {
        this.slTheBhDaCap = slTheBhDaCap;
    }

    @Basic
    @Column(name = "LOAI_CK")
    public Long getLoaiCk() {
        return loaiCk;
    }

    public void setLoaiCk(Long loaiCk) {
        this.loaiCk = loaiCk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommonDmCskcb that = (CommonDmCskcb) o;

        if (id != that.id) return false;
        if (ten != null ? !ten.equals(that.ten) : that.ten != null) return false;
        if (ma != null ? !ma.equals(that.ma) : that.ma != null) return false;
        if (mabhyt != null ? !mabhyt.equals(that.mabhyt) : that.mabhyt != null) return false;
        if (donvihanhchinhId != null ? !donvihanhchinhId.equals(that.donvihanhchinhId) : that.donvihanhchinhId != null)
            return false;
        if (diachi != null ? !diachi.equals(that.diachi) : that.diachi != null) return false;
        if (hangbenhvien != null ? !hangbenhvien.equals(that.hangbenhvien) : that.hangbenhvien != null) return false;
        if (tuyencmkt != null ? !tuyencmkt.equals(that.tuyencmkt) : that.tuyencmkt != null) return false;
        if (hieuluc != null ? !hieuluc.equals(that.hieuluc) : that.hieuluc != null) return false;
        if (mieuta != null ? !mieuta.equals(that.mieuta) : that.mieuta != null) return false;
        if (stt != null ? !stt.equals(that.stt) : that.stt != null) return false;
        if (tinhthanhId != null ? !tinhthanhId.equals(that.tinhthanhId) : that.tinhthanhId != null) return false;
        if (quanhuyenId != null ? !quanhuyenId.equals(that.quanhuyenId) : that.quanhuyenId != null) return false;
        if (matinhthanh != null ? !matinhthanh.equals(that.matinhthanh) : that.matinhthanh != null) return false;
        if (maquanhuyen != null ? !maquanhuyen.equals(that.maquanhuyen) : that.maquanhuyen != null) return false;
        if (donviId != null ? !donviId.equals(that.donviId) : that.donviId != null) return false;
        if (macosokcbcha != null ? !macosokcbcha.equals(that.macosokcbcha) : that.macosokcbcha != null) return false;
        if (cosokcbchaId != null ? !cosokcbchaId.equals(that.cosokcbchaId) : that.cosokcbchaId != null) return false;
        if (madonvi != null ? !madonvi.equals(that.madonvi) : that.madonvi != null) return false;
        if (thannhantao != null ? !thannhantao.equals(that.thannhantao) : that.thannhantao != null) return false;
        if (thaighep != null ? !thaighep.equals(that.thaighep) : that.thaighep != null) return false;
        if (loaihopdong != null ? !loaihopdong.equals(that.loaihopdong) : that.loaihopdong != null) return false;
        if (dkkcbbd != null ? !dkkcbbd.equals(that.dkkcbbd) : that.dkkcbbd != null) return false;
        if (hinhthuctt != null ? !hinhthuctt.equals(that.hinhthuctt) : that.hinhthuctt != null) return false;
        if (loaibenhvien != null ? !loaibenhvien.equals(that.loaibenhvien) : that.loaibenhvien != null) return false;
        if (khamtreem != null ? !khamtreem.equals(that.khamtreem) : that.khamtreem != null) return false;
        if (ngayngunghd != null ? !ngayngunghd.equals(that.ngayngunghd) : that.ngayngunghd != null) return false;
        if (mataichinh != null ? !mataichinh.equals(that.mataichinh) : that.mataichinh != null) return false;
        if (pkdakhoa != null ? !pkdakhoa.equals(that.pkdakhoa) : that.pkdakhoa != null) return false;
        if (ungthu != null ? !ungthu.equals(that.ungthu) : that.ungthu != null) return false;
        if (viemgan != null ? !viemgan.equals(that.viemgan) : that.viemgan != null) return false;
        if (tebaomautd != null ? !tebaomautd.equals(that.tebaomautd) : that.tebaomautd != null) return false;
        if (khamt7 != null ? !khamt7.equals(that.khamt7) : that.khamt7 != null) return false;
        if (khamcn != null ? !khamcn.equals(that.khamcn) : that.khamcn != null) return false;
        if (khamngayle != null ? !khamngayle.equals(that.khamngayle) : that.khamngayle != null) return false;
        if (masothue != null ? !masothue.equals(that.masothue) : that.masothue != null) return false;
        if (dienthoai != null ? !dienthoai.equals(that.dienthoai) : that.dienthoai != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (fax != null ? !fax.equals(that.fax) : that.fax != null) return false;
        if (coquanchuquan != null ? !coquanchuquan.equals(that.coquanchuquan) : that.coquanchuquan != null)
            return false;
        if (ngaykyhopdong != null ? !ngaykyhopdong.equals(that.ngaykyhopdong) : that.ngaykyhopdong != null)
            return false;
        if (kieubv != null ? !kieubv.equals(that.kieubv) : that.kieubv != null) return false;
        if (capcskcbMin != null ? !capcskcbMin.equals(that.capcskcbMin) : that.capcskcbMin != null) return false;
        if (ttpheduyet != null ? !ttpheduyet.equals(that.ttpheduyet) : that.ttpheduyet != null) return false;
        if (sohopdong != null ? !sohopdong.equals(that.sohopdong) : that.sohopdong != null) return false;
        if (lydo != null ? !lydo.equals(that.lydo) : that.lydo != null) return false;
        if (trangthai != null ? !trangthai.equals(that.trangthai) : that.trangthai != null) return false;
        if (tuchu != null ? !tuchu.equals(that.tuchu) : that.tuchu != null) return false;
        if (hangdichvuTd != null ? !hangdichvuTd.equals(that.hangdichvuTd) : that.hangdichvuTd != null) return false;
        if (hangthuocTd != null ? !hangthuocTd.equals(that.hangthuocTd) : that.hangthuocTd != null) return false;
        if (hangvattuTd != null ? !hangvattuTd.equals(that.hangvattuTd) : that.hangvattuTd != null) return false;
        if (byt != null ? !byt.equals(that.byt) : that.byt != null) return false;
        if (soGphd != null ? !soGphd.equals(that.soGphd) : that.soGphd != null) return false;
        if (kcb != null ? !kcb.equals(that.kcb) : that.kcb != null) return false;
        if (ngaycapma != null ? !ngaycapma.equals(that.ngaycapma) : that.ngaycapma != null) return false;
        if (ngaydieuchinh != null ? !ngaydieuchinh.equals(that.ngaydieuchinh) : that.ngaydieuchinh != null)
            return false;
        if (loaiDonvichuquan != null ? !loaiDonvichuquan.equals(that.loaiDonvichuquan) : that.loaiDonvichuquan != null)
            return false;
        if (chuaPd43 != null ? !chuaPd43.equals(that.chuaPd43) : that.chuaPd43 != null) return false;
        if (ngaykyhopdonglandau != null ? !ngaykyhopdonglandau.equals(that.ngaykyhopdonglandau) : that.ngaykyhopdonglandau != null)
            return false;
        if (ghichuTinhthaydoi != null ? !ghichuTinhthaydoi.equals(that.ghichuTinhthaydoi) : that.ghichuTinhthaydoi != null)
            return false;
        if (slTheBhDkbd != null ? !slTheBhDkbd.equals(that.slTheBhDkbd) : that.slTheBhDkbd != null) return false;
        if (slTheBhDaCap != null ? !slTheBhDaCap.equals(that.slTheBhDaCap) : that.slTheBhDaCap != null) return false;
        if (loaiCk != null ? !loaiCk.equals(that.loaiCk) : that.loaiCk != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (ten != null ? ten.hashCode() : 0);
        result = 31 * result + (ma != null ? ma.hashCode() : 0);
        result = 31 * result + (mabhyt != null ? mabhyt.hashCode() : 0);
        result = 31 * result + (donvihanhchinhId != null ? donvihanhchinhId.hashCode() : 0);
        result = 31 * result + (diachi != null ? diachi.hashCode() : 0);
        result = 31 * result + (hangbenhvien != null ? hangbenhvien.hashCode() : 0);
        result = 31 * result + (tuyencmkt != null ? tuyencmkt.hashCode() : 0);
        result = 31 * result + (hieuluc != null ? hieuluc.hashCode() : 0);
        result = 31 * result + (mieuta != null ? mieuta.hashCode() : 0);
        result = 31 * result + (stt != null ? stt.hashCode() : 0);
        result = 31 * result + (tinhthanhId != null ? tinhthanhId.hashCode() : 0);
        result = 31 * result + (quanhuyenId != null ? quanhuyenId.hashCode() : 0);
        result = 31 * result + (matinhthanh != null ? matinhthanh.hashCode() : 0);
        result = 31 * result + (maquanhuyen != null ? maquanhuyen.hashCode() : 0);
        result = 31 * result + (donviId != null ? donviId.hashCode() : 0);
        result = 31 * result + (macosokcbcha != null ? macosokcbcha.hashCode() : 0);
        result = 31 * result + (cosokcbchaId != null ? cosokcbchaId.hashCode() : 0);
        result = 31 * result + (madonvi != null ? madonvi.hashCode() : 0);
        result = 31 * result + (thannhantao != null ? thannhantao.hashCode() : 0);
        result = 31 * result + (thaighep != null ? thaighep.hashCode() : 0);
        result = 31 * result + (loaihopdong != null ? loaihopdong.hashCode() : 0);
        result = 31 * result + (dkkcbbd != null ? dkkcbbd.hashCode() : 0);
        result = 31 * result + (hinhthuctt != null ? hinhthuctt.hashCode() : 0);
        result = 31 * result + (loaibenhvien != null ? loaibenhvien.hashCode() : 0);
        result = 31 * result + (khamtreem != null ? khamtreem.hashCode() : 0);
        result = 31 * result + (ngayngunghd != null ? ngayngunghd.hashCode() : 0);
        result = 31 * result + (mataichinh != null ? mataichinh.hashCode() : 0);
        result = 31 * result + (pkdakhoa != null ? pkdakhoa.hashCode() : 0);
        result = 31 * result + (ungthu != null ? ungthu.hashCode() : 0);
        result = 31 * result + (viemgan != null ? viemgan.hashCode() : 0);
        result = 31 * result + (tebaomautd != null ? tebaomautd.hashCode() : 0);
        result = 31 * result + (khamt7 != null ? khamt7.hashCode() : 0);
        result = 31 * result + (khamcn != null ? khamcn.hashCode() : 0);
        result = 31 * result + (khamngayle != null ? khamngayle.hashCode() : 0);
        result = 31 * result + (masothue != null ? masothue.hashCode() : 0);
        result = 31 * result + (dienthoai != null ? dienthoai.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        result = 31 * result + (coquanchuquan != null ? coquanchuquan.hashCode() : 0);
        result = 31 * result + (ngaykyhopdong != null ? ngaykyhopdong.hashCode() : 0);
        result = 31 * result + (kieubv != null ? kieubv.hashCode() : 0);
        result = 31 * result + (capcskcbMin != null ? capcskcbMin.hashCode() : 0);
        result = 31 * result + (ttpheduyet != null ? ttpheduyet.hashCode() : 0);
        result = 31 * result + (sohopdong != null ? sohopdong.hashCode() : 0);
        result = 31 * result + (lydo != null ? lydo.hashCode() : 0);
        result = 31 * result + (trangthai != null ? trangthai.hashCode() : 0);
        result = 31 * result + (tuchu != null ? tuchu.hashCode() : 0);
        result = 31 * result + (hangdichvuTd != null ? hangdichvuTd.hashCode() : 0);
        result = 31 * result + (hangthuocTd != null ? hangthuocTd.hashCode() : 0);
        result = 31 * result + (hangvattuTd != null ? hangvattuTd.hashCode() : 0);
        result = 31 * result + (byt != null ? byt.hashCode() : 0);
        result = 31 * result + (soGphd != null ? soGphd.hashCode() : 0);
        result = 31 * result + (kcb != null ? kcb.hashCode() : 0);
        result = 31 * result + (ngaycapma != null ? ngaycapma.hashCode() : 0);
        result = 31 * result + (ngaydieuchinh != null ? ngaydieuchinh.hashCode() : 0);
        result = 31 * result + (loaiDonvichuquan != null ? loaiDonvichuquan.hashCode() : 0);
        result = 31 * result + (chuaPd43 != null ? chuaPd43.hashCode() : 0);
        result = 31 * result + (ngaykyhopdonglandau != null ? ngaykyhopdonglandau.hashCode() : 0);
        result = 31 * result + (ghichuTinhthaydoi != null ? ghichuTinhthaydoi.hashCode() : 0);
        result = 31 * result + (slTheBhDkbd != null ? slTheBhDkbd.hashCode() : 0);
        result = 31 * result + (slTheBhDaCap != null ? slTheBhDaCap.hashCode() : 0);
        result = 31 * result + (loaiCk != null ? loaiCk.hashCode() : 0);
        return result;
    }
}
