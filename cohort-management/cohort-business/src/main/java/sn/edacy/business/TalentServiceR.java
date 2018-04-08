package sn.edacy.business;

import javax.ejb.Remote;

import sn.edacy.model.Talent;
@Remote
public interface TalentServiceR {
	public void addTalent(Talent t);
	public Talent getTalent(Long idTalent);
	public void updateTalent(Talent t);
	public void DeleteTalent(Long idTalent);

}
