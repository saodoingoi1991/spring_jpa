package bhxh.data.repository;

import bhxh.data.model.CommonDmDonVi;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmDmDonViRepository extends JpaRepository<CommonDmDonVi, Long> {
    Page<CommonDmDonVi> findAll(Pageable pageable);
}

