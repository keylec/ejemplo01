package pe.edu.unmsm.ejemplo01.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unmsm.ejemplo01.entidades.Alumno;

@Repository
public interface AlumnoRepositorio extends CrudRepository<Alumno, Integer>{
	/**
	 * 
	 * Busca un alumno por su codigo
	 * @param alu_vccodigo el codigo del alumno
	 */
	public Alumno findByAluvccodigo(String aluvccodigo);

}
