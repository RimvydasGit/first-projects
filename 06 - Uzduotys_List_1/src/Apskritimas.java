
public class Apskritimas {
	final public float PI = 3.1415f;
	float spindulys = 0;
	
	public float getSpindulys() {
		return spindulys;
	}
	public void setSpindulys(float spindulys) {
		this.spindulys = spindulys;
	}
	public Apskritimas(float spindulys) {
		this.spindulys = spindulys;
	}
	public float perimetras() {
		return (2 * spindulys * PI);
		
	}
	public float plotas() {
		return (PI * spindulys * spindulys);
	}
}
