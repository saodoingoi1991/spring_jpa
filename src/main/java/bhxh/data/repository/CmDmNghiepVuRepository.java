package bhxh.data.repository;

import bhxh.data.model.CommonDmNghiepVu;
import bhxh.data.model.CommonDmPhongBan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmDmNghiepVuRepository extends JpaRepository<CommonDmNghiepVu, Long> {
    Page<CommonDmNghiepVu> findAll(Pageable pageable);
}

