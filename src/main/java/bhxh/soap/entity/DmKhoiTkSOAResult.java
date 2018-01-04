
package bhxh.soap.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


/**
 * <p>Java class for dmKhoiTkSOAResult complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="dmKhoiTkSOAResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ten" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)

public class DmKhoiTkSOAResult {
    @XmlElement(name = "id")
    protected Long id;
    @XmlElement(name = "ma")
    protected String ma;
    @XmlElement(name = "ten")
    protected String ten;

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
     * ID   NOT NULL NUMBER(19)
     * MA   NOT NULL VARCHAR2(3)
     * TEN  NOT NULL VARCHAR2(150)
     * NHOM          NUMBER
     *
     * @return
     */

    public Object[] toObject() {
        Object[] objects = new Object[3];
        objects[0] = id;
        objects[1] = ma;
        objects[2] = ten;
        return objects;
    }

}
