
package bhxh.soap.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

import static bhxh.utils.Config.VSA_NAMESPACE;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getDmKhoiKcbSOAResponse", namespace = VSA_NAMESPACE)
public class GetDmKhoiKcbSOAResponse {
    @XmlElement(name = "dmKhoiKcbSOAResult")
    protected List<DmKhoiKcbSOAResult> dmKhoiKcbSOAResult;

    public List<DmKhoiKcbSOAResult> getDmKhoiKcbSOAResult() {
        if (dmKhoiKcbSOAResult == null) {
            dmKhoiKcbSOAResult = new ArrayList<DmKhoiKcbSOAResult>();
        }
        return this.dmKhoiKcbSOAResult;
    }

    public void setDmKhoiKcbSOAResult(List<DmKhoiKcbSOAResult> dmKhoiKcbSOAResult) {
        this.dmKhoiKcbSOAResult = dmKhoiKcbSOAResult;
    }
}
