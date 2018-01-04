package bhxh.data.repository;

import bhxh.data.model.CommonDmQuocTich;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmDmQuocTichRepository extends JpaRepository<CommonDmQuocTich, Long> {

    Page<CommonDmQuocTich> findAll(Pageable pageable);

}

