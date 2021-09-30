package br.ufg.inf.fs.entities;

import br.ufg.inf.fs.ctrl.Date;
import br.ufg.inf.fs.ctrl.Integer;
import br.ufg.inf.fs.ctrl.String;

public class Hospede {
	private Integer id_hospede;
	private String nm_hospede;
	private Date dt_nascimento = new Date();
	private Integer cpf;
	public Integer getId_hospede() {
		return id_hospede;
	}
	public void setId_hospede(Integer id_hospede) {
		this.id_hospede = id_hospede;
	}
	public String getNm_hospede() {
		return nm_hospede;
	}
	public void setNm_hospede(String nm_hospede) {
		this.nm_hospede = nm_hospede;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	
	
	

}
