package springdocs.c_04.ioccontainer.s_11.jsr330;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.stereotype.Component;

@Component
public class Lab {

	private LabRat labRat;

	public LabRat getLabRat() {
		return labRat;
	}

	@Inject
	public void setLabRat(@Named("awesomeRat") LabRat labRat) {
		this.labRat = labRat;
	}

	@Override
	public String toString() {
		return "Lab [labRat=" + labRat + "]";
	}
}
