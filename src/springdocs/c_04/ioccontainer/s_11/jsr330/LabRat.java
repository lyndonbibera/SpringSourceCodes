package springdocs.c_04.ioccontainer.s_11.jsr330;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("awesomeRat")
public class LabRat {

	private String name;

	public String getName() {
		return name;
	}

	@Inject
	public void setName(@Value("The Name of Awesome Rat!") String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "LabRat [name=" + name + "]";
	}
}
