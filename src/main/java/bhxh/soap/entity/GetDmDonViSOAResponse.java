
package bhxh.soap.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

import static bhxh.utils.Config.VSA_NAMESPACE;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getDmDonViSOAResponse", namespace = VSA_NAMESPACE)

public class GetDmDonViSOAResponse {
    @XmlElement(name = "dmDonViSOAResult")
    protected List<DmDonViSOAResult> dmDonViSOAResult = null;

    public List<DmDonViSOAResult> getDmDonViSOAResult() {
        if (dmDonViSOAResult == null) {
            dmDonViSOAResult = new ArrayList<DmDonViSOAResult>();
        }
        return this.dmDonViSOAResult;
    }

    public void setDmDonViSOAResult(List<DmDonViSOAResult> dmDonViSOAResult) {
        this.dmDonViSOAResult = dmDonViSOAResult;
    }
}
