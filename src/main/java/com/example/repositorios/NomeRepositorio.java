package com.example.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.example.entidades.Aluno;

public interface NomeRepositorio  extends CrudRepository<Aluno,Long>{

}
