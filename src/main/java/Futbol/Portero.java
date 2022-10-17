package futbol;

public abstract class Portero extends Futbolista{
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, Integer edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.golesRecibidos = golesRecibidos;
		this.dorsal = dorsal;
	}
	
	public String toString() {
		return "El futbolista " + super.getNombre() +
				" tiene " + super.getEdad() +
				", y juega de " + super.getPosicion() +
				" con el dorsal " + this.dorsal +
				". Le han marcado " + this.golesRecibidos;
	}

	public short getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	}

	@Override
	public int compareTo(Object comparacion) {
		return Math.abs(this.getGolesRecibidos() - ((Portero) comparacion).getGolesRecibidos());
	}
}
