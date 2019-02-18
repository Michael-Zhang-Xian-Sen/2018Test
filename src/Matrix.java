
// 实现矩阵相关操作。
public class Matrix {
	
//	judge whether the two matrix have same dimension.
	public static boolean haveSameDimension(int m1[][],int m2[][]){
		if(m1.length!=m2.length) {
			return false;
		}
		else {
			for(int i=0;i<m1.length;i++) {
				if(m1[i].length!=m2[i].length) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean haveSameDimension(double m1[][],double m2[][]) {
		if(m1.length!=m2.length) {
			return false;
		}
		else {
			for(int i=0;i<m1.length;i++) {
				if(m1[i].length!=m2[i].length) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean haveSameDimension(int m1[][],double m2[][]) {
		if(m1.length!=m2.length) {
			return false;
		}
		else {
			for(int i=0;i<m1.length;i++) {
				if(m1[i].length!=m2[i].length) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean haveSameDimension(double m1[][],int m2[][]) {
		if(m1.length!=m2.length) {
			return false;
		}
		else {
			for(int i=0;i<m1.length;i++) {
				if(m1[i].length!=m2[i].length) {
					return false;
				}
			}
		}
		return true;
	}
	
//	addition operation
	public static int[][] addition(int[][] m1,int[][] m2) {
		if(!haveSameDimension(m1,m2)) {
			System.out.println("两矩阵不符合矩阵加法的条件，无法执行矩阵相加操作。");
			return null;
		}
		int lr = m1.length;
		int lc = m1[0].length;
		int m3[][] = new int[lr][lc];
		
		for(int i=0;i<lr;i++) {
			for(int j=0;j<lc;j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return m3;
	}
	
	public static double[][] addition(double[][] m1,double[][] m2){
		if(!haveSameDimension(m1,m2)) {
			System.out.println("两矩阵不符合矩阵加法的条件，无法执行矩阵相加操作。");
		}
		
		int lr = m1.length;
		int lc = m1[0].length;
		double m3[][] = new double[lr][lc];

		
		for(int i=0;i<lr;i++) {
			for(int j=0;j<lc;j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return m3;
	}
	
	public static double[][] addition(int[][] m1,double[][] m2){
		if(!haveSameDimension(m1,m2)) {
			System.out.println("两矩阵不符合矩阵加法的条件，无法执行矩阵相加操作。");
		}
		
		int lr = m1.length;
		int lc = m1[0].length;
		double m3[][] = new double[lr][lc];

		for(int i=0;i<lr;i++) {
			for(int j=0;j<lc;j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return m3;
	}
	
	public static double[][] addition(double[][] m1,int[][] m2){
		if(!haveSameDimension(m1,m2)) {
			System.out.println("两矩阵不符合矩阵加法的条件，无法执行矩阵相加操作。");
		}
		
		int lr = m1.length;
		int lc = m1[0].length;
		double m3[][] = new double[lr][lc];

		
		for(int i=0;i<lr;i++) {
			for(int j=0;j<lc;j++) {
				m3[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return m3;
	}
	
//	subtraction operation
	public static int[][] subtraction(int[][] m1,int[][] m2) {
		if(!haveSameDimension(m1,m2)) {
			System.out.println("两矩阵不符合矩阵减法的条件，无法执行矩阵相减操作。");
			return null;
		}
		
		int lr = m1.length;
		int lc = m1[0].length;
		int m3[][] = new int[lr][lc];
		
		for(int i=0;i<lr;i++) {
			for(int j=0;j<lc;j++) {
				m3[i][j] = m1[i][j] - m2[i][j];
			}
		}
		return m3;
	}
	
	public static double[][] subtraction(double[][] m1,double[][] m2){
		if(!haveSameDimension(m1,m2)) {
			System.out.println("两矩阵不符合矩阵减法的条件，无法执行矩阵相减操作。");
			return null;
		}
		
		int lr = m1.length;
		int lc = m1[0].length;
		double m3[][] = new double[lr][lc];
		
		for(int i=0;i<lr;i++) {
			for(int j=0;j<lc;j++) {
				m3[i][j] = m1[i][j] - m2[i][j];
			}
		}
		return m3;
	}
	
	public static double[][] subtraction(int[][] m1,double[][] m2){
		if(!haveSameDimension(m1,m2)) {
			System.out.println("两矩阵不符合矩阵减法的条件，无法执行矩阵相减操作。");
			return null;
		}
		
		int lr = m1.length;
		int lc = m1[0].length;
		double m3[][] = new double[lr][lc];
		
		for(int i=0;i<lr;i++) {
			for(int j=0;j<lc;j++) {
				m3[i][j] = m1[i][j] - m2[i][j];
			}
		}
		return m3;
	}
	
	public static double[][] subtraction(double[][] m1,int[][] m2){
		if(!haveSameDimension(m1,m2)) {
			System.out.println("两矩阵不符合矩阵减法的条件，无法执行矩阵相减操作。");
			return null;
		}
		
		int lr = m1.length;
		int lc = m1[0].length;
		double m3[][] = new double[lr][lc];
		
		for(int i=0;i<lr;i++) {
			for(int j=0;j<lc;j++) {
				m3[i][j] = m1[i][j] - m2[i][j];
			}
		}
		return m3;
	}
	
//  judge where the two matrix could make multiply operation
	public static boolean couldMultiply(int m1[][],int m2[][] ) {
		int lc1 = m1[0].length;
		int lr2 = m2.length;
		if(lc1 == lr2 ){
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean couldMultiply(double m1[][],double m2[][] ) {
		int lc1 = m1[0].length;
		int lr2 = m2.length;
		if(lc1 == lr2 ){
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean couldMultiply(int m1[][],double m2[][] ) {
		int lc1 = m1[0].length;
		int lr2 = m2.length;
		if(lc1 == lr2 ){
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean couldMultiply(double m1[][],int m2[][] ) {
		int lc1 = m1[0].length;
		int lr2 = m2.length;
		if(lc1 == lr2 ){
			return true;
		}else {
			return false;
		}
	}
	
//	multipication operation
	public static int[][] multiplication(int[][] m1,int[][] m2){
		
		if(!couldMultiply(m1,m2)) {
			System.out.println("两矩阵不符合矩阵乘法的条件，无法执行矩阵相乘操作。");
			return null;
		}
		
		
		int lr = m1.length;
		int lc = m1[0].length;
		int m3[][] = new int[lr][lc];
		
		for(int i=0;i<lr;i++) {
			for(int j=0;j<lc;j++) {
				for(int k=0;k<lc;k++) {
					m3[i][j] += (m1[i][k] * m2[k][j]);
				}
			}
		}
		return m3;
	}
	
	public static double[][] multiplication(double[][] m1,double[][] m2){
		if(!couldMultiply(m1,m2)) {
			System.out.println("两矩阵不符合矩阵乘法的条件，无法执行矩阵相乘操作。");
			return null;
		}
		
		int lr = m1.length;
		int lc = m1[0].length;
		double m3[][] = new double[lr][lc];
		
		for(int i=0;i<lr;i++) {
			for(int j=0;j<lc;j++) {
				for(int k=0;k<lc;k++) {
					m3[i][j] += (m1[i][k] * m2[k][j]);
				}
			}
		}
		return m3;
	}
	
	public static double[][] multiplication(int[][] m1,double[][] m2){
		if(!couldMultiply(m1,m2)) {
			System.out.println("两矩阵不符合矩阵乘法的条件，无法执行矩阵相乘操作。");
			return null;
		}
		
		int lr = m1.length;
		int lc = m1[0].length;
		double m3[][] = new double[lr][lc];
		
		for(int i=0;i<lr;i++) {
			for(int j=0;j<lc;j++) {
				for(int k=0;k<lc;k++) {
					m3[i][j] += (m1[i][k] * m2[k][j]);
				}
			}
		}
		return m3;
	}	
	
	public static double[][] multiplication(double[][] m1,int[][] m2){
		
		if(!couldMultiply(m1,m2)) {
			System.out.println("两矩阵不符合矩阵乘法的条件，无法执行矩阵相乘操作。");
			return null;
		}
		
		int lr = m1.length;
		int lc = m1[0].length;
		double m3[][] = new double[lr][lc];
		
		for(int i=0;i<lr;i++) {
			for(int j=0;j<lc;j++) {
				for(int k=0;k<lc;k++) {
					m3[i][j] += (m1[i][k] * m2[k][j]);
				}
			}
		}
		return m3;
	}	
}
