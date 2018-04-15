package sn.edacy.entities;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name="operations")
public class Operation implements Serializable{
	
	public Operation(Date dateOperation, Date dateVal, String libelle, double debit, double credit, String remarque) {
		super();
		this.dateOperation = dateOperation;
		this.dateVal = dateVal;
		this.libelle = libelle;
		this.debit = debit;
		this.credit = credit;
		this.remarque = remarque;
	}
	public Operation(Date dateOperation, String libelle, double debit, double credit) {
		super();
		this.dateOperation = dateOperation;
		this.libelle = libelle;
		this.debit = debit;
		this.credit = credit;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeOperation;
	private Date dateOperation;
	private Date dateVal;
	private String libelle;
	private double debit;
	private double credit;
	private String remarque;

	public Long getCodeOperation() {
		return codeOperation;
	}
	public void setCodeOperation(Long codeOperation) {
		this.codeOperation = codeOperation;
	}
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public double getDebit() {
		return debit;
	}
	public void setDebit(double debit) {
		this.debit = debit;
	}
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
	public void setDateVal(Date dateVal) {
		this.dateVal = dateVal;
	}
	public String getRemarque() {
		return remarque;
	}
	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}
	public Date getDateVal() {
		return dateVal;
	}
	
}

