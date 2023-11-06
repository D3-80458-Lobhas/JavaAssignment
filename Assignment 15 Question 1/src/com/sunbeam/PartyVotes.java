package com.sunbeam;

public class PartyVotes {
	String party;
	int votes;
	public PartyVotes() {
		// TODO Auto-generated constructor stub
	}
	public String getParty() {
		return party;
	}
	public void setParty(String party) {
		this.party = party;
	}
	public int getVotes() {
		return votes;
	}
	public void setVotes(int votes) {
		this.votes = votes;
	}
	public PartyVotes(String party, int votes) {
		super();
		this.party = party;
		this.votes = votes;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PartyVotes [party=").append(party).append(", votes=").append(votes).append("]");
		return builder.toString();
	}

}
