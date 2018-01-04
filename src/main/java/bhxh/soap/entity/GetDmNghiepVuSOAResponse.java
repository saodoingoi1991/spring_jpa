
package bhxh.soap.entity;


import bhxh.utils.Config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="dmNghiepVuSOAResult" type="{http://teca.com/sms/generated/ws/vsa}dmNghiepVuSOAResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)

@XmlRootElement(name = "getDmNghiepVuSOAResponse", namespace = Config.VSA_NAMESPACE)
public class GetDmNghiepVuSOAResponse {
    @XmlElement(name = "dmNghiepVuSOAResult")
    protected List<DmNghiepVuSOAResult> dmNghiepVuSOAResult;


    public List<DmNghiepVuSOAResult> getDmNghiepVuSOAResult() {
        if (dmNghiepVuSOAResult == null) {
            dmNghiepVuSOAResult = new ArrayList<DmNghiepVuSOAResult>();
        }
        return this.dmNghiepVuSOAResult;
    }

    public void setDmNghiepVuSOAResult(List<DmNghiepVuSOAResult> dmNghiepVuSOAResult) {
        this.dmNghiepVuSOAResult = dmNghiepVuSOAResult;
    }
}
