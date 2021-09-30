package br.ufg.inf.fs.entities;

import java.util.Date;

public class Hospedagem {

	private Integer id_hospedagem;
	private Quarto quarto;
	private Hospede hospede;
	private Date dt_checkin = new Date();
	private Date dt_checkout = new Date();
	
	
	public Integer getId_hospedagem() {
		return id_hospedagem;
	}
	public void setId_hospedagem(Integer id_hospedagem) {
		this.id_hospedagem = id_hospedagem;
	}
	public Quarto getQuarto() {
		return quarto;
	}
	public void setQuarto(Quarto quarto) {
		this.quarto = quarto;
	}
	public Hospede getHospede() {
		return hospede;
	}
	public void setHospede(Hospede hospede) {
		this.hospede = hospede;
	}
	public Date getDt_checkin() {
		return dt_checkin;
	}
	public void setDt_checkin(Date dt_checkin) {
		this.dt_checkin = dt_checkin;
	}
	public Date getDt_checkout() {
		return dt_checkout;
	}
	public void setDt_checkout(Date dt_checkout) {
		this.dt_checkout = dt_checkout;
	}
	
	
	
	
}
