package org.launchcode.mealplanner.models.data;

import org.launchcode.mealplanner.models.Meal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface MealDao extends CrudRepository<Meal, Integer> {
}
