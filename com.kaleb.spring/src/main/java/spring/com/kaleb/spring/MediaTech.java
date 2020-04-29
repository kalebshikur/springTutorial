package spring.com.kaleb.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MediaTech implements MobileProcessor {

	@Override
	public void process() {
	System.out.println("second best");

	}

}
