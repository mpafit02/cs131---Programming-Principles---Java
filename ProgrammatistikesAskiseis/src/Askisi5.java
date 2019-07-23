
public class Askisi5 {
	public static final int K = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Z, R, N, AR, TR, BR, AN, TN, BN;
		AR = 1;
		BR = 2;
		TR = 13;
		AN = 2; 
		BN = 1;
		TN = 8;
		N = AN;
		R = AR;
		while((N != TN)&&(R != TR)) {
			Z = K * (int)Math.pow(1 + R, N);
			System.out.printf("Z : %12d\tR : %4d\tN : %4d\t\n",Z,R,N);
			if(N != TN) 
				N += BN;
			if(R != TR)
				R += BR;
		}
	}

}
