package Ram;

public class ActionMovie extends Movie {
	public String fightReview(int noOfFightsScences) {
		if(noOfFightsScences<3) {
			return "no agood action movie";
		}
		else if(noOfFightsScences<=3&&noOfFightsScences<=5) {
			return "average action movie";
		}
		else if(noOfFightsScences>5) {
			return "good action movie";
		}
		else {
			return "wrost movie";
			
		}
	}

}
