package Random;

//�������1-100���������
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Max=100;
		int[] max=new int[10];
		int[] sum=new int[10];
		for(int i=0;i<10;i++){
			max[i]=0;
			sum[i]=0;}
		int[][] arrys=new int[10][10];
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				arrys[i][j]=(int) (1+Math.random()*Max);
				sum[i]+=arrys[i][j];
				if(arrys[i][j]>max[i]){
					max[i]=arrys[i][j];
				}
			}
		}
		System.out.println("�б�Ϊ");
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				System.out.print(arrys[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\t���ֵ\tƽ����");
		for(int i=0;i<10;i++)
		{
			System.out.println("��"+i+"��\t"+max[i]+'\t'+(sum[i]/10.0));
		}
		
	}

}
