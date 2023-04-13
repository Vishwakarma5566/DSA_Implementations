package javaProgram;

interface Interf {
	void methodone();
	void methodTwo();
}
abstract class ServiceProvider implements Interf{
	public void methodOne() {
		
	}
}
class SubServiceProvider extends ServiceProvider{
	
}
