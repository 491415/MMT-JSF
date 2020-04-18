package hr.dkralj.logging;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DevPhaseListener implements PhaseListener {

	private static final long serialVersionUID = 1L;
	private static final Logger log = LoggerFactory.getLogger(DevPhaseListener.class);
	
	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}
	
	@Override
	public void beforePhase(PhaseEvent event) {
		// Kod koji se izvršava prije svake faze.
		log.debug("Pocetak faze: " + event.getPhaseId() + " .");
	}
	
	@Override
	public void afterPhase(PhaseEvent event) {
		// Kod koji se izvršava poslije svake faze.
		log.debug("Kraj faze: " + event.getPhaseId() + " .");
	}
}
