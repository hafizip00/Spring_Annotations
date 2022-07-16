package ipenter.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component

public class Samsung {
	
	
	@Autowired
	@Qualifier("snapDragon")
	// Mention here which should Run
	private MobileGPU gpu;
	
	
	
	public MobileGPU getGpu() {
		return gpu;
	}



	public void setGpu(MobileGPU gpu) {
		this.gpu = gpu;
	}


	
	public  void Config() {
		System.out.println("S7 Mobile");
		gpu.GPUInfo();
	}
}
