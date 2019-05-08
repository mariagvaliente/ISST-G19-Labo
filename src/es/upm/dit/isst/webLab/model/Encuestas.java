package es.upm.dit.isst.webLab.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Encuestas implements Serializable{
	
	@Id
	public int id;
	public String date;
	public String house;
	public String sample;
	public String turnout;
	public String PP;
	public String PSOE;
	public String UP;
	public String Cs;
	public String ERC;
	public String PDC;
	public String PNV;
	public String PAC;
	public String BIL;
	public String CC;
	public String VOX;
	public String COM;

	
	public Encuestas(){	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getHouse() {
		return house;
	}


	public void setHouse(String house) {
		this.house = house;
	}


	public String getSample() {
		return sample;
	}


	public void setSample(String sample) {
		this.sample = sample;
	}


	public String getTurnout() {
		return turnout;
	}


	public void setTurnout(String turnout) {
		this.turnout = turnout;
	}


	public String getPP() {
		return PP;
	}


	public void setPP(String pP) {
		PP = pP;
	}


	public String getPSOE() {
		return PSOE;
	}


	public void setPSOE(String pSOE) {
		PSOE = pSOE;
	}


	public String getUP() {
		return UP;
	}


	public void setUP(String uP) {
		UP = uP;
	}


	public String getCs() {
		return Cs;
	}


	public void setCs(String cs) {
		Cs = cs;
	}


	public String getERC() {
		return ERC;
	}


	public void setERC(String eRC) {
		ERC = eRC;
	}


	public String getPDC() {
		return PDC;
	}


	public void setPDC(String pDC) {
		PDC = pDC;
	}


	public String getPNV() {
		return PNV;
	}


	public void setPNV(String pNV) {
		PNV = pNV;
	}


	public String getPAC() {
		return PAC;
	}


	public void setPAC(String pAC) {
		PAC = pAC;
	}


	public String getBIL() {
		return BIL;
	}


	public void setBIL(String bIL) {
		BIL = bIL;
	}


	public String getCC() {
		return CC;
	}


	public void setCC(String cC) {
		CC = cC;
	}


	public String getVOX() {
		return VOX;
	}


	public void setVOX(String vOX) {
		VOX = vOX;
	}


	public String getCOM() {
		return COM;
	}


	public void setCOM(String cOM) {
		COM = cOM;
	}
	
	

}
