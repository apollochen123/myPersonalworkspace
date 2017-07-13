package MyUDP;

public class Udp_exm_main {

	public static void main(String[] args) {
		Udp_exm_send udp_exm_send=new Udp_exm_send();
		udp_exm_send.start();
		Udp_exm_rev udp_exm_rev=new Udp_exm_rev();
		udp_exm_rev.start();
	}

}
