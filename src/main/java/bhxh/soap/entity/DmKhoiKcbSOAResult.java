
package bhxh.soap.entity;

import bhxh.data.model.CommonDmKhoiKcb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


/**
 * <p>Java class for dmKhoiKcbSOAResult complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="dmKhoiKcbSOAResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dmDtKcbId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="groupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ten" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tinhTrang" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DmKhoiKcbSOAResult {
    @XmlElement(name = "dmDtKcbId")
    protected Long dmDtKcbId;
    @XmlElement(name = "groupCode")
    protected String groupCode;
    @XmlElement(name = "id")
    protected Long id;
    @XmlElement(name = "ma")
    protected String ma;
    @XmlElement(name = "ten")
    protected String ten;
    @XmlElement(name = "tinhTrang")
    protected Boolean tinhTrang;

    /**
     * Gets the value of the dmDtKcbId property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDmDtKcbId() {
        return dmDtKcbId;
    }

    /**
     * Sets the value of the dmDtKcbId property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDmDtKcbId(Long value) {
        this.dmDtKcbId = value;
    }

    /**
     * Gets the value of the groupCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
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
     * Gets the value of the tinhTrang property.
     *
     * @return possible object is
     * {@link Boolean }
     */
    public Boolean isTinhTrang() {
        return tinhTrang;
    }

    /**
     * Sets the value of the tinhTrang property.
     *
     * @param value allowed object is
     *              {@link Boolean }
     */
    public void setTinhTrang(Boolean value) {
        this.tinhTrang = value;
    }

    /**
     * ID           NOT NULL NUMBER(19)
     * MA           NOT NULL VARCHAR2(2)
     * TEN          NOT NULL VARCHAR2(250)
     * DM_DT_KCB_ID          NUMBER(19)
     * NHOM                  VARCHAR2(3)
     * TINH_TRANG            NUMBER(1)
     * CREATED_DATE          DATE
     * UPDATED_DATE          DATE
     *
     * @return
     */
    public Object[] toObject() {
        Object[] objects = new Object[6];
        objects[0] = id;
        objects[1] = ma;
        objects[2] = ten;
        objects[3] = dmDtKcbId;
        objects[4] = groupCode;
        objects[5] = tinhTrang;
        return objects;
    }

    public String toString() {
        return "id=" + id + ",ma=" + ma + ",ten=" + ten + ",dmDtKcbId=" + dmDtKcbId + ",groupCode=" + groupCode + ",tinhTrang=" + tinhTrang;
    }

    public CommonDmKhoiKcb toEntity() {
        CommonDmKhoiKcb kcb = new CommonDmKhoiKcb();
        kcb.setId(id);
        kcb.setMa(ma);
        kcb.setTen(ten);
        kcb.setDmDtKcbId(dmDtKcbId);
        kcb.setNhom(groupCode);
        kcb.setTinhTrang(tinhTrang);
        return kcb;
    }
}
