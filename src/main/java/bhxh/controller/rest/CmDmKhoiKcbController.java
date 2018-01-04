package bhxh.controller.rest;

import bhxh.controller.process.DMProcess;
import bhxh.data.BaseResponse;
import bhxh.data.model.CommonDmKhoiKcb;
import bhxh.data.repository.CmDmKhoiKcbRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/iamSync")
@Configuration
@ComponentScan("bhxh.data.repository")

public class CmDmKhoiKcbController {
    private static final Logger logger = Logger.getLogger(CmDmKhoiKcbController.class);
    @Autowired
    CmDmKhoiKcbRepository cmDmKhoiKcbRepository;

//    @PersistenceContext
//    private EntityManager entityManager;

    //    @Value("${hibernate.jdbc.batch_size}")
    private int batchSize = 20;

    @GetMapping("/kcb/all")
    public List<CommonDmKhoiKcb> getAll() {
        return cmDmKhoiKcbRepository.findAll();
    }

    @GetMapping("/kcb/sync")
    public BaseResponse syncKcb() {
        BaseResponse response = new BaseResponse();
        List<CommonDmKhoiKcb> lstObject = DMProcess.processDmKhoiKCB();
        logger.info("List PB size= " + lstObject.size());
        //bulkSave(lstObject);
        lstObject = cmDmKhoiKcbRepository.save(lstObject);
        logger.info("End insert - " + lstObject.size());
        response.setErrorCode("00");
        response.setMessage("success");
        return response;
    }


//    public Collection<CommonDmKhoiKcb> bulkSave(List<CommonDmKhoiKcb> entities) {
//        final List<CommonDmKhoiKcb> savedEntities = new ArrayList<CommonDmKhoiKcb>(entities.size());
//        int i = 0;
//        for (CommonDmKhoiKcb t : entities) {
//            savedEntities.add(persistOrMerge(t));
//            i++;
//            if (i % batchSize == 0) {
//                // Flush a batch of inserts and release memory.
//                entityManager.flush();
//                entityManager.clear();
//                System.out.println("success");
//            }
//        }
//        return savedEntities;
//    }
//
//    private CommonDmKhoiKcb persistOrMerge(CommonDmKhoiKcb t) {
////        if (null == t.getId()) {
//        entityManager.persist(t);
//        return t;
////        } else {
////        return entityManager.merge(t);
////        }
//    }


}
