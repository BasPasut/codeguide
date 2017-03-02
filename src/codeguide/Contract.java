package codeguide;

public class Contract {
	String name;
	int phoneNum;
	String emergencyCall;

	// TODO create new class that take the responsibility for emergencyCall.
	public Contract(String name, int phoneNum, String emergencyCall) {
		this.name = name;
		this.phoneNum = phoneNum;
		if (checkEmergencyCall(emergencyCall)) {
			this.emergencyCall = emergencyCall;
		} 
		else {
			throw new Error("Emergency call number must have * symbol at the first and # at the last. Please try again.");
		}

	}

	public boolean checkEmergencyCall(String emergencyCall) {
		if (emergencyCall.substring(0, 1).equals("*") && emergencyCall.endsWith("#") == true) {
			return true;
		}
		return false;
	}

}
