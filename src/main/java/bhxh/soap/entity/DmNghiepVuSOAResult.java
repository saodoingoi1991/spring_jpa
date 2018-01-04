
package bhxh.soap.entity;

import bhxh.data.model.CommonDmNghiepVu;
import bhxh.utils.JPAUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


/**
 * <p>Java class for dmNghiepVuSOAResult complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="dmNghiepVuSOAResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bhxh" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="bhyt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="grp1" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="grp2" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ten" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tg" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="trangThai" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DmNghiepVuSOAResult {
    @XmlElement(name = "bhxh")
    protected Boolean bhxh;
    @XmlElement(name = "bhyt")
    protected Boolean bhyt;
    @XmlElement(name = "grp1")
    protected Boolean grp1;
    @XmlElement(name = "grp2")
    protected Boolean grp2;
    @XmlElement(name = "id")
    protected Long id;
    @XmlElement(name = "ma")
    protected String ma;
    @XmlElement(name = "qt")
    protected Boolean qt;
    @XmlElement(name = "ten")
    protected String ten;
    @XmlElement(name = "tg")
    protected Boolean tg;
    @XmlElement(name = "trangThai")
    protected Boolean trangThai;

    /**
     * Gets the value of the bhxh property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isBhxh() {
        return bhxh;
    }

    /**
     * Sets the value of the bhxh property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setBhxh(Boolean value) {
        this.bhxh = value;
    }

    /**
     * Gets the value of the bhyt property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isBhyt() {
        return bhyt;
    }

    /**
     * Sets the value of the bhyt property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setBhyt(Boolean value) {
        this.bhyt = value;
    }

    /**
     * Gets the value of the grp1 property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isGrp1() {
        return grp1;
    }

    /**
     * Sets the value of the grp1 property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setGrp1(Boolean value) {
        this.grp1 = value;
    }

    /**
     * Gets the value of the grp2 property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isGrp2() {
        return grp2;
    }

    /**
     * Sets the value of the grp2 property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setGrp2(Boolean value) {
        this.grp2 = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the ma property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMa() {
        return ma;
    }

    /**
     * Sets the value of the ma property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMa(String value) {
        this.ma = value;
    }

    /**
     * Gets the value of the qt property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isQt() {
        return qt;
    }

    /**
     * Sets the value of the qt property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setQt(Boolean value) {
        this.qt = value;
    }

    /**
     * Gets the value of the ten property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTen() {
        return ten;
    }

    /**
     * Sets the value of the ten property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTen(String value) {
        this.ten = value;
    }

    /**
     * Gets the value of the tg property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTg() {
        return tg;
    }

    /**
     * Sets the value of the tg property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTg(Boolean value) {
        this.tg = value;
    }

    /**
     * Gets the value of the trangThai property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTrangThai() {
        return trangThai;
    }

    /**
     * Sets the value of the trangThai property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTrangThai(Boolean value) {
        this.trangThai = value;
    }

    /**
     * ID         NOT NULL NUMBER(19)
     * BHXH                NUMBER(1)
     * BHYT                NUMBER(1)
     * GRP1                NUMBER(1)
     * GRP2                NUMBER(1)
     * MA         NOT NULL VARCHAR2(2)
     * QT                  NUMBER(1)
     * TEN        NOT NULL VARCHAR2(100)
     * TG                  NUMBER(1)
     * TRANG_THAI          NUMBER(1)
     *
     * @return
     */
    public Object[] toObjects() {
        Object[] objects = new Object[10];
        objects[0] = id;
        objects[1] = bhxh;
        objects[2] = bhyt;
        objects[3] = grp1;
        objects[4] = grp2;
        objects[5] = ma;
        objects[6] = qt;
        objects[7] = ten;
        objects[8] = tg;
        objects[9] = trangThai;
        return objects;
    }

    public CommonDmNghiepVu toEntity() {
        CommonDmNghiepVu nv = new CommonDmNghiepVu();
        nv.setId(id);
        nv.setBhxh(JPAUtils.toLong(bhxh));
        nv.setBhyt(JPAUtils.toLong(bhyt));
        nv.setGrp1(JPAUtils.toLong(grp1));
        nv.setGrp2(JPAUtils.toLong(grp2));
        nv.setMa(ma);
        nv.setTg(JPAUtils.toLong(tg));
        nv.setQt(JPAUtils.toLong(qt));
        nv.setTen(ten);
        nv.setTrangThai(JPAUtils.toLong(trangThai));
        return nv;
    }
}
