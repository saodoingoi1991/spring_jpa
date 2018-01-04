package bhxh.data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class BaseResponse<T> {
    private String errorCode;
    private String message;

    private List<T> listQuocTich;

    public BaseResponse() {
    }

    public BaseResponse(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @XmlElementWrapper(name = "listQuocTichs")
    @XmlElement(name = "listQuocTichs")
    public List<T> getListQuocTich() {
        return listQuocTich;
    }

    public void setListQuocTich(List<T> listQuocTich) {
        this.listQuocTich = listQuocTich;
    }
}
