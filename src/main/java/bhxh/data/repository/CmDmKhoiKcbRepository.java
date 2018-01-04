package bhxh.data.repository;

import bhxh.data.model.CommonDmKhoiKcb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmDmKhoiKcbRepository extends JpaRepository<CommonDmKhoiKcb, Long> {


}