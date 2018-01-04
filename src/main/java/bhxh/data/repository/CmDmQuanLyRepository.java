package bhxh.data.repository;

import bhxh.data.model.CommonDmKhoiQuanLy;
import bhxh.data.model.CommonDmPhongBan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmDmQuanLyRepository extends JpaRepository<CommonDmKhoiQuanLy, Long> {
    Page<CommonDmKhoiQuanLy> findAll(Pageable pageable);
}

