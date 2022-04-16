package in.co.online.vote.bean;

public class VoteBean extends BaseBean {
	
	
	private long partyId;
	private String partyName;
	private String voterId;
	
	private long OTP;
	
	private long enterOTP;
	
	

	

	

	public long getOTP() {
		return OTP;
	}

	public void setOTP(long oTP) {
		OTP = oTP;
	}

	public long getEnterOTP() {
		return enterOTP;
	}

	public void setEnterOTP(long enterOTP) {
		this.enterOTP = enterOTP;
	}

	public long getPartyId() {
		return partyId;
	}

	public void setPartyId(long partyId) {
		this.partyId = partyId;
	}

	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getVoterId() {
		return voterId;
	}

	public void setVoterId(String voterId) {
		this.voterId = voterId;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
