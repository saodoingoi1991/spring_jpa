package bhxh.controller.rest;

import bhxh.data.BaseResponse;
import bhxh.data.model.Test;
import bhxh.data.repository.CmDmTinhRepository;
import bhxh.data.repository.TestRepository;
import bhxh.utils.JPAUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/iamSync")
@Configuration
@ComponentScan("bhxh.data.repository")
public class TestController {
    @Autowired
    TestRepository testRepository;

//    @PersistenceContext
//    private EntityManager entityManager;

    //    @Value("${hibernate.jdbc.batch_size}")
    private int batchSize = 20;

    @GetMapping("/test/all")
    public List<Test> getAll() {
        return testRepository.findAll();
    }

    @GetMapping("/test/all/{page}")
    public List<Test> getAll(@PathVariable("page") final int page) {
        return testRepository.findAll(new QPageRequest(page, 20)).getContent();
    }

    @GetMapping("/test/sync")
    public BaseResponse syncDonVi() {
        BaseResponse response = new BaseResponse();
        List<Test> lstObject = new ArrayList<>();
        Test test = new Test(1, "long0");
        test.setChon(JPAUtils.toLong(true));
        lstObject.add(test);
        test = new Test(2, "long11");
        test.setChon(JPAUtils.toLong(false));
        lstObject.add(test);
        test = new Test(3, "long2");
        test.setChon(JPAUtils.toLong(null));
        lstObject.add(test);
        test = new Test(4, "long3");
        lstObject.add(test);
        testRepository.save(lstObject);
        response.setErrorCode("00");
        response.setMessage("success");
        return response;
    }


}
