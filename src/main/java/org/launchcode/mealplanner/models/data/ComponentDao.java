package org.launchcode.mealplanner.models.data;

import org.launchcode.mealplanner.models.Component;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface ComponentDao extends CrudRepository<Component, Integer> {
}
