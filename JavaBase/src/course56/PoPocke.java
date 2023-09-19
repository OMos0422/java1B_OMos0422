package course56;

public class PoPocke extends PoSuper implements PoAction {
	
	int kotaichi;
	String nickname;

	public void battle() {

	}

	public int getKotaichi() {
		return kotaichi;
	}

	public void setKotaichi(int kotaichi) {
		this.kotaichi = kotaichi;
		System.out.println(kotaichi);
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
		System.out.println(nickname);
	}

	public void recover() {

	}

}
