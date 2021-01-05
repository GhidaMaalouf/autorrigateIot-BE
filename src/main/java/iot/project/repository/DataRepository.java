package iot.project.repository;

import iot.project.dbModel.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DataRepository extends JpaRepository<Data, UUID> {

}
