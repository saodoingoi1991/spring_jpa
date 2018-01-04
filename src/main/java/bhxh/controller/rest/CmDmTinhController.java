package bhxh.controller.rest;

import bhxh.controller.process.DMProcess;
import bhxh.data.BaseResponse;
import bhxh.data.model.CommonDmKhoiQuanLy;
import bhxh.data.repository.CmDmQuanLyRepository;
import bhxh.data.repository.CmDmTinhRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/iamSync")
@Configuration
@ComponentScan("bhxh.data.repository")
public class CmDmTinhController {
    private static final Logger logger = Logger.getLogger(CmDmTinhController.class);
    @Autowired
    CmDmTinhRepository cmDmTinhRepository;


    @GetMapping("/test/getdata/{ma}")
    public BaseResponse<Object[]> getData(@PathVariable("ma") final String ma) {
        BaseResponse response = new BaseResponse();
        List<Object[]> list = cmDmTinhRepository.findAllCommonDmCqbhTinh();
        response.setErrorCode("00");
        response.setMessage("success" + list.size());
        response.setListQuocTich(list);
        return response;
    }
}
