package com.slokam.healthcare.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.healthcare.entity.PrecItem;
				@Repository
				public interface PrecItemRepo extends JpaRepository<PrecItem, Integer> {

				}
