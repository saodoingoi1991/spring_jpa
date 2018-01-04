package bhxh.controller.rest;

import bhxh.data.BaseResponse;
import bhxh.data.model.CommonDmQuocTich;
import bhxh.data.repository.CmDmQuocTichRepository;
import bhxh.data.repository.CmDmTinhRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Configuration
@ComponentScan("bhxh.data.repository")
public class CmDmQTichController {
    private static final Logger logger = Logger.getLogger(CmDmQTichController.class);
    @Autowired
    CmDmQuocTichRepository cmDmQuocTichRepository;


    @RequestMapping(value = "/iamSync/qtich/getdata/{page}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_XML_VALUE}, headers = "Accept=application/xml")
    public BaseResponse<CommonDmQuocTich> getData(@PathVariable("page") final String page) {
        BaseResponse response = new BaseResponse();
        List<CommonDmQuocTich> listQuocTich = cmDmQuocTichRepository.findAll();
        response.setErrorCode("00");
        response.setMessage("success" + listQuocTich.size());
        response.setListQuocTich(listQuocTich);
        return response;
    }
}
