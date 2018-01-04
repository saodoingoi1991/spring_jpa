package bhxh.data.repository;

import bhxh.data.model.CommonDmPhongBan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmDmPhongBanRepository extends JpaRepository<CommonDmPhongBan, Long> {
    Page<CommonDmPhongBan> findAll(Pageable pageable);
}

