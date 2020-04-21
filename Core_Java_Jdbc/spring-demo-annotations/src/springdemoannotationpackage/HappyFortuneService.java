package springdemoannotationpackage;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService  implements FortuneService{
	public String getFortune() {
		return "Today is your lukcy day from hfs class";
	}

}
