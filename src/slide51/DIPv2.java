package slide51;

interface CanWork {
	public void work();
}

class Worker2 implements CanWork {

	@Override
	public void work() {
		System.out.println("Doing some work...");
	}

}

class SuperWorker2 implements CanWork {

	@Override
	public void work() {
		System.out.println("Doing more work...");
	}

}

class Manager2 {

	CanWork w;

	public void setWorker(CanWork wFromOutside) {
		this.w = wFromOutside;
	}

	public void manage() {
		w.work();
	}

}

public class DIPv2 {

}
