package boutique.metiers;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class BoutiquePhaseListener implements PhaseListener {

	@Override
	public void afterPhase(PhaseEvent event) {
		// TODO Auto-generated method stub
		System.out.println("nous somme dans la phase : " + event.getPhaseId());
		
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		// on recois un event
		System.out.println("nous somme dans la phase : " + event.getPhaseId());
		
	}

	@Override
	public PhaseId getPhaseId() {
		// TODO Auto-generated method stub
		//on renvoi la reference de la phase a la laquele ce liste est sensible
		return PhaseId.ANY_PHASE;
	}

}
