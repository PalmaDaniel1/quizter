package archy.soft.quizter.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "preguntas")
public class Preguntas {
	
	@Id 
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String pregunta;
	@Column
    private int tipo_respuesta;
	@Column
	private char status;
	@Column
	@Temporal(TemporalType.DATE)
	private Calendar fecha_actualizacion;
	@ManyToOne
	@JoinColumn(name = "tema_id")
	Tema tema;
	
	//@Column
	//private int users_id;
	//@ManyToOne
	//@JoinColumn(name = "users_id")
	//Users users;      
	
	
}