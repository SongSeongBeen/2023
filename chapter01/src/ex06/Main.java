package ex06;

public class Main {

	public static void main(String[] args) {
		  //                      ^
		//                        |                       
		//                     대신해줌
//		String[] argss = new String[3];
//		argss[0] = "이름1";
//		argss[1] = "이름2";
//		argss[2] = "이름3";
		
		
		for(int i =0; i<args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
