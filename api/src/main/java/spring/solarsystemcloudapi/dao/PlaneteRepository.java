package spring.solarsystemcloudapi.dao;

import org.springframework.data.repository.CrudRepository;
import spring.solarsystemcloudapi.model.Planete;

public interface PlaneteRepository extends CrudRepository<Planete, Integer> {

   Planete findById(int id);

   void deleteById(int id);
}
