package bhxh.data.repository;

import bhxh.data.model.CommonDmCqbhTinh;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CmDmTinhRepository extends JpaRepository<CommonDmCqbhTinh, Long> {
    Page<CommonDmCqbhTinh> findAll(Pageable pageable);

//    @Override
//    List<CommonDmCqbhTinh> findAllByID();

    @Query("select a.tenCqbhTinh,a.maCqbhTinh from CommonDmCqbhTinh a where a.maCqbhTinh = :maCqbhTinh")
    List<Object[]> findByMaCqbhTinh(@Param("maCqbhTinh") String maCqbhTinh);

    @Query("select a.tenCqbhTinh,a.maCqbhTinh from CommonDmCqbhTinh a  ")
    List<Object[]> findAllCommonDmCqbhTinh();
}

