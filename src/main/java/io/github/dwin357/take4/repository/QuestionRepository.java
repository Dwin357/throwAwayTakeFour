/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.dwin357.take4.repository;

import io.github.dwin357.take4.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author dwin
 */
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
