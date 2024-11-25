class ABC
 {    int no;
	 void setValue(int no) {
		 no=no;
	 }
	 void showSquare() {
		 System.out.printf("Square is %d\n",no*no);
	 }
}
public class TestDefaultApplication {
	public static void main(String[] args) {
       ABC ab = new ABC();
        ab.setValue(5);
        ab.showSquare();
	}
}
