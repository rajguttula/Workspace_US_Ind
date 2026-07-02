package encapsulations;

public class AccMain {

	public static void main(String[] args) {
		
		Account obj=new Account();
		obj.setAccNo(101);
		System.out.println(obj.getAccNo());
		obj.setAccName("Kumar");
		System.out.println(obj.getAccName());

	}

}
