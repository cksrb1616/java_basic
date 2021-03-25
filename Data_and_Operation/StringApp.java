
public class StringApp {

	public static void main(String[] args) {
		System.out.println("Hello World"); //string
		System.out.println('H'); //''는 ""와 다르게 Character를 나타냄 (한 글자의 string)
		System.out.println("H"); //string
		
		System.out.println("Hello "
				+ "World"); //줄을 바꾸기 위해서는 이와 같은 방법으로 해야함. 아웃풋의 줄을 바꾸는 것은 아님
		System.out.println("Hello \nWorld"); //output의 줄을 바꿈 
		System.out.println("Hello \"World\""); // Hello "World"

	}

}
