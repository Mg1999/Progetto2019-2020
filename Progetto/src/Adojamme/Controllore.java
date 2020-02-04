package Adojamme;


public class Controllore {
	HomeLogRec logframe;
	Login acessframe;
	SingUp registrazione;
	Recensione recens;
	
	public static void main(String[] args) {
		Controllore ilcontrollo = new Controllore();
		Home frame = new Home(ilcontrollo);
		frame.setVisible(true);
		
	}
	
	public Controllore() {
		logframe = new HomeLogRec(this);
		acessframe = new Login(this);
		registrazione = new SingUp(this);
		recens = new Recensione(this);
	}
	

	public void Log() {

		logframe.setVisible(true);
		
	}
	
	public void acesso() {
		acessframe.setVisible(true);
	}
	
	public void rec() {
		registrazione.setVisible(true);
	}
	
	public void recensione() {
		recens.setVisible(true);
	}
	
}
