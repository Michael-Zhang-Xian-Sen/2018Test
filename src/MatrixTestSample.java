public class MatrixTestSample {
	Matrix matrix = new Matrix();
//	������ͬ�����;���
	int im1[][] = {
			{1,2,3},
			{4,5,6}
	};
	int im2[][] = {
			{1,2,3},
			{4,5,6}
	};
	int im3[][] = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	
//	������ͬ��double�;���
	double dm1[][] = {
			{1,2,3},
			{4,5,6}
	};
	double dm2[][] = {
			{1,2,3},
			{4,5,6}
	};
	double dm3[][] = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	
	// ��ʾ�����������
	public void show(int m[][]) {
		if(m == null)	return ;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void show(double m[][]) {
		if(m == null)	return ;
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
