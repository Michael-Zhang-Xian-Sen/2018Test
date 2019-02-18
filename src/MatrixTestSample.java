public class MatrixTestSample {
	Matrix matrix = new Matrix();
//	三个不同的整型矩阵
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
	
//	三个不同的double型矩阵
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
	
	// 显示矩阵具体内容
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
