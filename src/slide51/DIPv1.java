package slide51;

class Worker {

	public void work() {
		System.out.println("Doing some work...");
	}

}

class Manager {

	Worker w;

	public void setWorker(Worker wFromOutside) {
		this.w = wFromOutside;
	}

	public void manage() {
		w.work();
	}

}

class SuperWorker {
	public void work() {
		System.out.println("Doing more work...");
	}
}

public class DIPv1 {

}
