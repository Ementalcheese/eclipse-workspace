package arraytest;
enum Week {��,ȭ,��,��,��,��,��}
public class Test3 {

	public static void main(String[] args) {
		
		//for-each�� Ȱ��
		
		int[] n = {1,2,3,4,5};
		String names[] = {"���","��","�ٳ���","ü��","����","����"};
		
		int sum = 0;
		for(int k : n)
		{
			System.out.println(k+"");
			sum+=k;
		}
		System.out.println("����" + sum);
		
		for(String s : names)
			System.out.println(s+"");
		System.out.println();
		
		for(Week day : Week.values())
			System.out.println(day + "����");
		System.out.println();
	

 }
}