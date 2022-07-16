package ipenter.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary Got Priority
public class SnapDragon implements MobileGPU {

	public void GPUInfo() {
		System.out.println("SnapDragon GPU Accleration.");
	}

	@Override
	public String toString() {
		return "SnapDragon [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

}
