public class ComputerTest {
	public static void main(String[] args) {
		MatrixTestSample mts = new MatrixTestSample();
		Matrix matrix = new Matrix();
		//	���Ӳ���
		System.out.println(">>>>>>���Ӳ���<<<<<<");
		mts.show(mts.im1);
		mts.show(mts.im2);
		mts.show(matrix.addition(mts.im1, mts.im2));
		System.out.println("----------------------------------");
		
		mts.show(mts.im1);
		mts.show(mts.im3);
		mts.show(matrix.addition(mts.im1, mts.im3));
		System.out.println("----------------------------------");
		
		mts.show(mts.im1);
		mts.show(mts.dm1);
		mts.show(matrix.addition(mts.im1, mts.dm1));
		System.out.println("----------------------------------");
		
		mts.show(mts.dm1);
		mts.show(mts.dm1);
		mts.show(matrix.addition(mts.dm1, mts.dm1));
		System.out.println("----------------------------------");
		
		// ��������
		System.out.println(">>>>>>��������<<<<<<");
		mts.show(mts.im1);
		mts.show(mts.im2);
		mts.show(matrix.subtraction(mts.im1, mts.im2));
		System.out.println("----------------------------------");
		
		mts.show(mts.im1);
		mts.show(mts.im3);
		mts.show(matrix.subtraction(mts.im1, mts.im3));
		System.out.println("----------------------------------");
		
		mts.show(mts.im1);
		mts.show(mts.dm1);
		mts.show(matrix.subtraction(mts.im1, mts.dm1));
		System.out.println("----------------------------------");
		
		mts.show(mts.dm1);
		mts.show(mts.dm1);
		mts.show(matrix.subtraction(mts.dm1, mts.dm1));
		System.out.println("----------------------------------");
		
		// ���˲���
		System.out.println(">>>>>>���˲���<<<<<<");
		mts.show(mts.im1);
		mts.show(mts.im1);
		mts.show(matrix.multiplication(mts.im1, mts.im1));
		System.out.println("----------------------------------");
		
		mts.show(mts.im1);
		mts.show(mts.im3);
		mts.show(matrix.multiplication(mts.im1, mts.im3));
		System.out.println("----------------------------------");
		
		mts.show(mts.im1);
		mts.show(mts.dm1);
		mts.show(matrix.multiplication(mts.im1, mts.dm1));
		System.out.println("----------------------------------");
		
		mts.show(mts.dm1);
		mts.show(mts.dm3);
		mts.show(matrix.multiplication(mts.dm1, mts.dm3));
		System.out.println("----------------------------------");
		

	}
}