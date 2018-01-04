
package bhxh.soap.entity;


import bhxh.utils.Config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * <p>Java class for anonymous complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_list_cosokcbResult" type="{http://tempuri.org}ArrayOfDmCosokcb" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "get_list_cosokcbResponse", namespace = Config.DANHMUC_NAMESPACE)
public class GetListCosokcbResponse {

    @XmlElement(name = "get_list_cosokcbResult")
    protected ArrayOfDmCosokcb getListCosokcbResult;

    /**
     * Gets the value of the getListCosokcbResult property.
     *
     * @return possible object is
     * {@link ArrayOfDmCosokcb }
     */
    public ArrayOfDmCosokcb getGetListCosokcbResult() {
        return getListCosokcbResult;
    }

    /**
     * Sets the value of the getListCosokcbResult property.
     *
     * @param value allowed object is
     *              {@link ArrayOfDmCosokcb }
     */
    public void setGetListCosokcbResult(ArrayOfDmCosokcb value) {
        this.getListCosokcbResult = value;
    }

}
