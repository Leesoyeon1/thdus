package inheritances;

public class CellPhoneEx2 {
public static void main(String[] args) {
	Cellphone cp =new Cellphone();
//	cp =  new (Cellphone) new DmbPhone();//int = (int)byte;
//	cp =  new (Cellphone) new SmartPhone();
	cp.color="";
	
	if(cp instanceof DmbCellPhone) {
	DmbCellPhone dp = (DmbCellphone)cp;
	dp.model = "";
	dp.color = "";
	dp.channel = 15;
	dp.powerOn();
	
	
}else {
	System.out.println("casting 할 수 없습니다.");
}
	//다형성
	//부모=자식들
	//부모메소드
	
	cp =  new DmbCellPhone();
	cp.powerOn();
	
	cp =  new SmartPhone();
	cp.powerOn();
}
